// Tyrone Cheng
// 4 March 2004
// Description: Othello project

// Java packages
import java.util.*;

public class Computer extends Player
	{
	private ArrayList moves = new ArrayList();

	//*********************************************************
	//Function name: Computer
	//Purpose: zero contructor for computer
	//Input: none
	//Output: none
	//*********************************************************

	/**
	* Zero constructor for computer.
	*/
	public Computer()
		{
		}

	//*********************************************************
	//Function name: Player
	//Purpose: constructor to make a computer
	//Input 1: String n (represents computer's name)
	//Input 2: int c (represents computer's piece color)
	//Output: Computer
	//*********************************************************

	/**
	* Constructor to create a computer.
	*
	* @param n name of player
	* @param c piece color of player
	*/
	public Computer( String n, int c )
		{
		super( n, c );
		}

	//*********************************************************
	//Function name: getName
	//Purpose: gets the computer's name
	//Input: none
	//Output: String name (represents computer's name)
	//*********************************************************

	/**
	* Gets the computer's name.
	*
	* @return computer's name
	*/
	public String getName()
		{
		return super.getName();
		}

	//*********************************************************
	//Function name: getColor
	//Purpose: gets the computer's piece color in integer form
	//Input: none
	//Output: int color (represents computer's piece color)
	//*********************************************************

	/**
	* Gets the computer's piece color in integer form.
	*
	* @return computer's piece color in integer form
	*/
	public int getColor()
		{
		return super.getColor();
		}

	//*********************************************************
	//Function name: getColorString
	//Purpose: gets the computer's piece color in String format
	//Input: none
	//Output: String (Black; White)
	//*********************************************************

	/**
	* Gets the computer's piece color in String format.
	*
	* @return computer's piece color in String format
	*/
	public String getColorString()
		{
		return super.getColorString();
		}

	//*********************************************************
	//Function name: getPieceCount
	//Purpose: gets specfied computer's piece count
	//Input: int b[][] (represents 2D array of board)
	//Output: int pieceCount (represents piece count for computer)
	//*********************************************************

	/**
	* Gets specfied computer's piece count.
	*
	* @param b 2D array of board
	* @return specfied computer's piece count
	*/
	public int getPieceCount( int b[][] )
		{
		return super.getPieceCount( b );
		}

	//*********************************************************
	//Function name: move
	//Purpose: places a piece in a specified area
	//Input 1: int x (represents row of board)
	//Input 2: int y (represents column of board)
	//Input 3: int c (represents color of piece placed)
	//Input 4: Board b (represents board object)
	//Output: void
	//*********************************************************

	/**
	* Places a piece in a specified area.
	*
	* @param x row of board
	* @param y column of board
	* @param c color of piece placed
	* @param b board object
	* @return void
	*/
	public void move( int x, int y, int c, Board b )
		{
		super.move( x, y, c, b );
		}

	//*********************************************************
	//Function name: getAllLegalMoves
	//Purpose: finds locations of all legal moves and stores them
	//Input: int b[][] (represents 2D array of board)
	//Output: ArrayList moves (represents stored legal moves)
	//*********************************************************

	/**
	* Finds locations of all legal moves and stores them.
	*
	* @param b 2D array of board
	* @return ArrayList of all legal moves
	*/
	public ArrayList getAllLegalMoves( int b[][] )
		{
		moves.clear();

		for( int r = 0; r < 8; r++ )
			{
			for( int c = 0; c < 8; c++ )
				{
				if( b[ r ][ c ] == 0 )
					{
					if( Rules.validateHorizontal( c, r, getColor(), b ) == true ||
						Rules.validateVertical( c, r, getColor(), b ) == true ||
						Rules.validateDiagonalULDR( c, r, getColor(), b ) == true ||
						Rules.validateDiagonalDLUR( c, r, getColor(), b ) == true )
						{
						Integer row = new Integer( r );
						Integer column = new Integer( c );

						moves.add( row );
						moves.add( column );
						}
					}
				}
			}
		return moves;
		}

	//*********************************************************
	//Function name: randomNumber
	//Purpose: picks a random number within the range of the number of legal moves
	//Input: int b[][] (represents 2D array of board)
	//Output: int (-1; tempNumber) (represents position in ArrayList of picked move)
	//*********************************************************

	/**
	* Picks a random number within the range of the number of legal moves.
	*
	* @param b 2D array of board
	* @return position in ArrayList of the picked move
	*/
	public int randomNumber( int b[][] )
		{
		moves = getAllLegalMoves( b );
		int randomNumber = 0;
		int tempNumber = 0;

		if( moves.size() == 0 )
			{
			return -1;
			}
		else
			{
			while( tempNumber == 0 )
				{
				randomNumber = 1 + ( int ) ( Math.random() * moves.size() );

				if( randomNumber % 2 == 0 )
					{
					tempNumber = randomNumber - 2;
					return tempNumber;
					}
				}
			return tempNumber;
			}
		}

	//*********************************************************
	//Function name: randomMoveRow
	//Purpose: gets the row location of the picked random move
	//Input 1: int random (represents position in ArrayList of the random move)
	//Input 2: int b[][] (represents 2D array of board)
	//Output: int row (represents row of random move)
	//*********************************************************

	/**
	* Gets the row location of the picked random move.
	*
	* @param random position in ArrayList of the picked move
	* @param b 2D array of board
	* @return row of the random move
	*/
	public int randomMoveRow( int random, int b[][] )
		{
		moves = getAllLegalMoves( b );

		return ( ( Integer )moves.get( random ) ).intValue();
		}

	//*********************************************************
	//Function name: randomMoveColumn
	//Purpose: gets the column location of the picked random move
	//Input 1: int random (represents position in ArrayList of the random move)
	//Input 2: int b[][] (represents 2D array of board)
	//Output: int column (represents column of random move)
	//*********************************************************

	/**
	* Gets the column location of the picked random move.
	*
	* @param random position in ArrayList of the picked move
	* @param b 2D array of board
	* @return column of the random move
	*/
	public int randomMoveColumn( int random, int b[][] )
		{
		moves = getAllLegalMoves( b );

		return ( ( Integer )moves.get( random + 1 ) ).intValue();
		}
	}