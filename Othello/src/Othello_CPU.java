// Tyrone Cheng
// 4 March 2004
// Description: Othello project

// Java packages
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Othello_CPU extends JApplet
	{
	//initialize variables
	private Image boardImage;
    private Image blackPieceImage;
    private Image whitePieceImage;
	private Image buffer;
	private Graphics bufferg;
	private JLabel status;

	private ArrayList allPieces = new ArrayList();

	private boolean p1Turn;
	private boolean p2Turn;
	private boolean p1Skip;
	private boolean p2Skip;
	private boolean boardClicked;
	private boolean mouseOver;

    private int xClick;
    private int yClick;
    private int xOver;
    private int yOver;
	private int currentColor;

	private Human h;
	private Computer c;
	private Board b;

	private String p1Name;

	private final String CAPTIONS[][] =
		{ { "A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8" },
		  { "B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8" },
		  { "C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8" },
		  { "D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8" },
		  { "E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8" },
		  { "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8" },
		  { "G1", "G2", "G3", "G4", "G5", "G6", "G7", "G8" },
		  { "H1", "H2", "H3", "H4", "H5", "H6", "H7", "H8" } };

	//*********************************************************
	//Function name: init
	//Purpose: initialize the applet
	//Input: none
	//Output: none
	//*********************************************************

	/**
	* Initializes the applet.
	*/
	public void init()
    	{
    	// pre-load all images
		boardImage = getImage( getDocumentBase(), "images/board.png" );
		blackPieceImage = getImage( getDocumentBase(), "images/piece_black.png" );
		whitePieceImage = getImage( getDocumentBase(), "images/piece_white.png" );

		buffer = createImage( getSize().width, getSize().height - 16 );
		bufferg = buffer.getGraphics();

		// add MouseListener to monitor mouse activity
		addMouseListener( new MouseListenerCustom() );
		addMouseMotionListener( new MouseMotionListenerCustom() );

		// set up status bar
		Container container = getContentPane();
		container.setLayout( new BorderLayout() );
		status = new JLabel();
		container.add( status, BorderLayout.SOUTH );

		// create blank pieces
		for( int counter =  0; counter < 64; counter++ )
			{
			allPieces.add( new Piece() );
			}

		// prompt for names
		p1Name = JOptionPane.showInputDialog( "Input Player 1's (Black) name: " );

		// create player and board objects
		h = new Human( p1Name, 1 );
		c = new Computer( "CPU", 2 );
		b = new Board( 8, 8, allPieces );

		// set up the 4 default game pieces
		b.updateBoard( 3, 4, 1 );
		b.updateBoard( 4, 3, 1 );
		b.updateBoard( 4, 4, 2 );
		b.updateBoard( 3, 3, 2 );

		b.updateArrayList( blackPieceImage, whitePieceImage );
		allPieces = b.getArrayList();

		b.printBoard();
		updateStatus();

		// starts the game
		p1Turn = true;
		currentColor = 1;
		}

	//*********************************************************
	//Function name: paint
	//Purpose: paints the buffer
	//Input: none
	//Output: none
	//*********************************************************

	/**
	* Paints the buffer.
	*/
	public void paint( Graphics g )
		{
		update( g );
		}

	//*********************************************************
	//Function name: update
	//Purpose: perform the double buffering technique
	//Input: none
	//Output: none
	//*********************************************************

	/**
	* Performs the double buffering technique.
	*/
	public void update( Graphics g )
		{
		Dimension d = getSize();
		bufferg.setColor( getBackground() );
		bufferg.fillRect( 0, 0, d.width, d.height );
		bufferg.drawImage( boardImage, 0, 0, this );

		// place status bar at the bottom of the window
		status.updateUI();

		updateStatus();

		//***************************************************************
		// This method searches for all legal moves to determine when
		// the end of the game occurs.
		//***************************************************************
		if( Rules.searchLegalMoves( 1, b.getBoard() ) == false && Rules.searchLegalMoves( 2, b.getBoard() ) == false )
			{
			p1Turn = false;
			p2Turn = false;

			//************************************************************
			// These if statements print out the winner in the status bar.
			//************************************************************
			if( h.getPieceCount( b.getBoard() ) > c.getPieceCount( b.getBoard() ) )
				{
				status.setText( h.getName() + " WINS! (" + h.getPieceCount( b.getBoard() ) + "/" + c.getPieceCount( b.getBoard() ) + ")" );
				}
			else if( h.getPieceCount( b.getBoard() ) < + c.getPieceCount( b.getBoard() ) )
				{
				status.setText( c.getName() + " WINS! (" + c.getPieceCount( b.getBoard() ) + "/" + h.getPieceCount( b.getBoard() ) + ")" );
				}
			else if( h.getPieceCount( b.getBoard() ) == c.getPieceCount( b.getBoard() ) )
				{
				status.setText( "Tie Game (" + h.getPieceCount( b.getBoard() ) + "/" + c.getPieceCount( b.getBoard() ) + ")" );
				}
			}

		//************************************************************
		// These if statements display the "skip turn" dialog.
		//************************************************************
		else if( p1Skip == true )
			{
			JOptionPane.showMessageDialog( null, h.getName() + " must skip turn..." );
			p1Skip = false;
			}
		else if( p2Skip == true )
			{
			JOptionPane.showMessageDialog( null, c.getName() + " must skip turn..." );
			p2Skip = false;
			}

		else
			{
			// player 1's turn
			if( p1Turn == true )
				{
				//****************************************************************
				// This if statement determines when no legal moves are available.
				// If there is none, then the player's turn is skipped.
				//****************************************************************
				if( Rules.searchLegalMoves( currentColor, b.getBoard() ) == false )
					{
					p1Skip = true;
					currentColor = 2;
					p1Turn = false;
					p2Turn = true;
					updateStatus();
					}

				else
					{
					if( mouseOver == true )
						{
						//*******************************************************************
						// This if statement attempts to validate every square the mouse is
						// moved over.  When the mouse is over a legal square, the applet
						// draws a yellow rectangle over it.
						//*******************************************************************
						if( Rules.validateMove( roundN( xOver ), roundN( yOver ), currentColor, b.getBoard() ) == true )
							{
							bufferg.setColor( Color.YELLOW );
							bufferg.drawRect( ( roundN( xOver ) * 51 ), ( roundN( yOver ) * 51 ), 51, 51 );
							mouseOver = false;
							}
						}

					if( boardClicked == true )
						{
						//***********************************************************************
						// This if statement determines if the user clicked on an invalid square.
						// If so, then the text "Invalid location" is displayed.
						//***********************************************************************
						if( Rules.validateMove( roundN( xClick ), roundN( yClick ), currentColor, b.getBoard() ) == false )
							{
							showStatus( "Invalid location" );

							System.out.println( "P1-H: " + Rules.validateHorizontal( roundN( xClick ), roundN( yClick ), currentColor, b.getBoard() ) );
							System.out.println( "P1-V: " + Rules.validateVertical( roundN( xClick ), roundN( yClick ), currentColor, b.getBoard() ) );
							System.out.println( "P1-ULDR: " + Rules.validateDiagonalULDR( roundN( xClick ), roundN( yClick ), currentColor, b.getBoard() ) );
							System.out.println( "P1-DLUR: " + Rules.validateDiagonalDLUR( roundN( xClick ), roundN( yClick ), currentColor, b.getBoard() ) );

							boardClicked = false;
							}
						//********************************************
						// This condition allows the player to place
						// a piece if the move is valid.
						//********************************************
						else
							{
							System.out.println( "P1-H: " + Rules.validateHorizontal( roundN( xClick ), roundN( yClick ), currentColor, b.getBoard() ) );
							System.out.println( "P1-V: " + Rules.validateVertical( roundN( xClick ), roundN( yClick ), currentColor, b.getBoard() ) );
							System.out.println( "P1-ULDR: " + Rules.validateDiagonalULDR( roundN( xClick ), roundN( yClick ), currentColor, b.getBoard() ) );
							System.out.println( "P1-DLUR: " + Rules.validateDiagonalDLUR( roundN( xClick ), roundN( yClick ), currentColor, b.getBoard() ) );

							// piece is placed
							h.move( roundN( xClick ), roundN( yClick ), currentColor, b );

							b.updateArrayList( blackPieceImage, whitePieceImage );
							allPieces = b.getArrayList();

							currentColor = 2;
							p1Turn = false;
							p2Turn = true;
							boardClicked = false;

							updateStatus();
							}
						}
					}
				}

			// computer moves when mouse is moved
			if( mouseOver == true )
				{
				// computer's turn
				if( p2Turn == true )
					{
					System.out.println( c.getAllLegalMoves( b.getBoard() ) );

					int randomNumber = c.randomNumber( b.getBoard() );

					//****************************************************************
					// This if statement determines when no legal moves are available.
					// If there is none, then the computer's turn is skipped.
					//****************************************************************
					if( randomNumber == -1 )
						{
						p2Skip = true;

						currentColor = 1;
						p1Turn = true;
						p2Turn = false;
						updateStatus();
						}

					//**********************************************
					// This condition allows the player to place a
					// piece on the square since it is deemed legal.
					//**********************************************
					else
						{
						// picks a random move
						int randomRow = c.randomMoveRow( randomNumber, b.getBoard() );
						int randomColumn = c.randomMoveColumn( randomNumber, b.getBoard() );

						System.out.println( "P2-H: " + Rules.validateHorizontal( randomColumn, randomRow, currentColor, b.getBoard() ) );
						System.out.println( "P2-V: " + Rules.validateVertical( randomColumn, randomRow, currentColor, b.getBoard() ) );
						System.out.println( "P2-ULDR: " + Rules.validateDiagonalULDR( randomColumn, randomRow, currentColor, b.getBoard() ) );
						System.out.println( "P2-DLUR: " + Rules.validateDiagonalDLUR( randomColumn, randomRow, currentColor, b.getBoard() ) );

						// piece is placed
						c.move( randomColumn, randomRow, currentColor, b );

						b.updateArrayList( blackPieceImage, whitePieceImage );
						allPieces = b.getArrayList();
						b.printBoard();

						currentColor = 1;
						p1Turn = true;
						p2Turn = false;

						updateStatus();
						}
					}
				}
			}

		//*****************************************************
		// This for loop uses polymorphism by going through
		// the board ArrayList and differentiating between
		// white pieces and black pieces.  The pieces are then
		// painted onto a buffer.
		//*****************************************************
		for( int counter = 0; counter < allPieces.size(); counter++ )
			{
			if( ( ( Piece )allPieces.get( counter ) ).getColor() != 0 )
				{
				bufferg.drawImage( ( ( Piece )allPieces.get( counter ) ).getPieceImage(), ( ( Piece )allPieces.get( counter ) ).getXPosition(), ( ( Piece )allPieces.get( counter ) ).getYPosition(), this );
				}
			}

		g.drawImage( buffer, 0, 0, this );
		}

	//*********************************************************
	//Function name: getTurn
	//Purpose: gets the current player's turn
	//Input: none
	//Output: String (P1 (B); P2 (W))
	//*********************************************************

	/**
	* Gets the current player's turn.
	*
	* @return current player's turn
	*/
	private String getTurn()
		{
		if( p1Turn == true )
			{
			return "P1 (B)";
			}
		else
			{
			return "P2 (W)";
			}
		}

	//*********************************************************
	//Function name: updateStatus
	//Purpose: updates the status bar
	//Input: none
	//Output: none
	//*********************************************************

	/**
	* Updates the status bar.
	*/
	private void updateStatus()
		{
		status.setText
			( h.getName() + " (" + h.getColorString() + "): " + h.getPieceCount( b.getBoard() )
				+ "          " + c.getName() + " (" + c.getColorString() + "): " + c.getPieceCount( b.getBoard() )
				+ "          Turn: " + getTurn() ) ;
			}

	//*********************************************************
	//Function name: roundN
	//Purpose: divides given number by pixel width/height
	//Input: int n (represents number to divide)
	//Output: int (divided number)
	//*********************************************************

	/**
	* Divides given number by pixel width/height.
	*
	* @param n number to divide
	* @return divided number
	*/
	private int roundN( int n )
		{
		return n / 51;
		}

	//*********************************************************
	//Function name: translateLocation
	//Purpose: translates XY coordinates to letter-number coordinates
	//Input 1: int x (represents X coordinate)
	//Input 2: int y (represents Y coordinate)
	//Output: String (A to H; 1 to 8)
	//*********************************************************

	/**
	* Translates XY coordinates to Letter-Number coordinates.
	*
	* @param x X coordinate
	* @param y Y coordinate
	* @return letter-number coordinates
	*/
	private String translateLocation( int x, int y )
		{
		if( x >= boardImage.getWidth( this ) || y >= boardImage.getHeight( this ) )
			{
			return "";
			}

		for( int a = 0; a <= 8; a++ )
			{
			if( x == 51 * a || y == 51 * a )
				{
				return "Border";
				}
			}

		return CAPTIONS[ roundN( x ) ][ roundN( y ) ];
		}

	private class MouseListenerCustom extends MouseAdapter implements MouseAction
		{

		//*********************************************************
		//Function name: mouseClicked
		//Purpose: invoked when the mouse button has been clicked (pressed and released) on a component
		//Input: none
		//Output: none
		//*********************************************************

		/**
		* Invoked when the mouse button has been clicked (pressed and released) on a component.
		*/
		public void mouseClicked( MouseEvent e )
		 	{
		 	if( e.getX() < 407 && e.getY() < 407 )
		 		{
		 		boardClicked = true;

		 		xClick = ( roundN( e.getX() ) * 51 ) + 1;
				yClick = ( roundN( e.getY() ) * 51 ) + 1;

				repaint();
		 		}

		 	else
		 		{
		 		boardClicked = false;
		 		}

			showStatus( translateLocation( e.getX(), e.getY() ) );
		 	}

		//*********************************************************
		//Function name: mouseEntered
		//Purpose: invoked when the mouse enters a component
		//Input: none
		//Output: none
		//*********************************************************

		/**
		* Invoked when the mouse enters a component.
		*/
		public void mouseEntered ( MouseEvent e )
		 	{
		 	showStatus( "Mouse is inside the window." );
		 	}

		//*********************************************************
		//Function name: mouseExited
		//Purpose: invoked when the mouse exits a component
		//Input: none
		//Output: none
		//*********************************************************

		/**
		* Invoked when the mouse exits a component.
		*/
		public void mouseExited ( MouseEvent e )
		 	{
		 	showStatus( "Mouse is outside the window." );
		 	}
		}

	private class MouseMotionListenerCustom extends MouseMotionAdapter
		{

		//*********************************************************
		//Function name: mouseMoved
		//Purpose: invoked when the mouse cursor has been moved onto a component but no buttons have been pushed
		//Input: none
		//Output: none
		//*********************************************************

		/**
		* Invoked when the mouse cursor has been moved onto a component but no buttons have been pushed.
		*/
		public void mouseMoved( MouseEvent e )
			{
			if( e.getX() < 407 && e.getY() < 407 )
				{
				mouseOver = true;
				xOver = e.getX();
				yOver = e.getY();
				showStatus( "Moved @ [" + e.getX() + ", " + e.getY() + "]" );
				repaint();
				}
			else
				{
				mouseOver = false;
				}
			}
		}
	}