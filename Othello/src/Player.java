// Tyrone Cheng
// 4 March 2004
// Description: Othello project

public class Player
	{
	private String name;
	private int color;

	//*********************************************************
	//Function name: Player
	//Purpose: zero contructor for player
	//Input: none
	//Output: none
	//*********************************************************

	/**
	* Zero constructor for player.
	*/
	public Player()
		{
		name = "";
		color = 0;
		}

	//*********************************************************
	//Function name: Player
	//Purpose: constructor to make a player
	//Input 1: String n (represents player's name)
	//Input 2: int c (represents player's piece color)
	//Output: Player
	//*********************************************************

	/**
	* Constructor to create a player.
	*
	* @param n name of player
	* @param c piece color of player
	*/
	public Player( String n, int c )
		{
		name = n;
		color = c;
		}

	//*********************************************************
	//Function name: getName
	//Purpose: gets the player's name
	//Input: none
	//Output: String name (represents player's name)
	//*********************************************************

	/**
	* Gets the player's name.
	*
	* @return player's name
	*/
	public String getName()
		{
		return name;
		}

	//*********************************************************
	//Function name: getColor
	//Purpose: gets the player's piece color in integer form
	//Input: none
	//Output: int color (represents player's piece color)
	//*********************************************************

	/**
	* Gets the player's piece color in integer form.
	*
	* @return player's piece color in integer form
	*/
	public int getColor()
		{
		return color;
		}

	//*********************************************************
	//Function name: getColorString
	//Purpose: gets the player's piece color in String format
	//Input: none
	//Output: String (Black; White)
	//*********************************************************

	/**
	* Gets the player's piece color in String format.
	*
	* @return player's piece color in String format
	*/
	public String getColorString()
		{
		if( getColor() == 1 )
			{
			return "Black";
			}
		else
			{
			return "White";
			}
		}

	//*********************************************************
	//Function name: getPieceCount
	//Purpose: gets specfied player's piece count
	//Input: int b[][] (represents 2D array of board)
	//Output: int pieceCount (represents piece count for player)
	//*********************************************************

	/**
	* Gets specfied player's piece count.
	*
	* @param b 2D array of board
	* @return specfied player's piece count
	*/
	public int getPieceCount( int b[][] )
		{
		int pieceCount = 0;

		for( int r = 0; r < 8; r++ )
			{
			for( int c = 0; c < 8; c++ )
				{
				if( b[ r ][ c ] == color )
					{
					pieceCount++;
					}
				}
			}
		return pieceCount;
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
		b.updateBoard( y, x, c );
		b.searchHorizontal( x, y, c );
		b.searchVertical( x, y, c );
		b.searchDiagonalDLUR( x, y, c );
		b.searchDiagonalULDR( x, y, c );
		b.printBoard();
		}
	}