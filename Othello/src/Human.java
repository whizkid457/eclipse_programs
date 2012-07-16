// Tyrone Cheng
// 4 March 2004
// Description: Othello project

public class Human extends Player
	{

	//*********************************************************
	//Function name: Human
	//Purpose: zero contructor for human
	//Input: none
	//Output: none
	//*********************************************************

	/**
	* Zero constructor for human.
	*/
	public Human()
		{
		}

	//*********************************************************
	//Function name: Player
	//Purpose: constructor to make a human
	//Input 1: String n (represents human's name)
	//Input 2: int c (represents human's piece color)
	//Output: Human
	//*********************************************************

	/**
	* Constructor to create a human.
	*
	* @param n human's name
	* @param c human's piece color
	*/
	public Human( String n, int c )
		{
		super( n, c );
		}

	//*********************************************************
	//Function name: getName
	//Purpose: gets the human's name
	//Input: none
	//Output: String name (represents human's name)
	//*********************************************************

	/**
	* Gets the human's name.
	*
	* @return human's name
	*/
	public String getName()
		{
		return super.getName();
		}

	//*********************************************************
	//Function name: getColor
	//Purpose: gets the human's piece color in integer form
	//Input: none
	//Output: int color (represents human's piece color)
	//*********************************************************

	/**
	* Gets the human's piece color in integer form.
	*
	* @return human's piece color in integer form
	*/
	public int getColor()
		{
		return super.getColor();
		}

	//*********************************************************
	//Function name: getColorString
	//Purpose: gets the human's piece color in String format
	//Input: none
	//Output: String (Black; White)
	//*********************************************************

	/**
	* Gets the human's piece color in String format.
	*
	* @return human's piece color in String format
	*/
	public String getColorString()
		{
		return super.getColorString();
		}

	//*********************************************************
	//Function name: getPieceCount
	//Purpose: gets specfied human's piece count
	//Input: int b[][] (represents 2D array of board)
	//Output: int pieceCount (represents piece count for human)
	//*********************************************************

	/**
	* Gets specfied human's piece count.
	*
	* @param b 2D array of board
	* @return specfied human's piece count
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
	}