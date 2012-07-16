// Tyrone Cheng
// 23 February 2004
// Description: Othello project

// Java packages
import java.awt.*;

public class Piece
	{
	private int xPosition;
	private int yPosition;
	private int color;
	private Image pieceImage;

	//*********************************************************
	//Function name: Piece
	//Purpose: zero contructor for piece
	//Input: none
	//Output: none
	//*********************************************************

	/**
	* Zero constructor used to make "blank" pieces.
	*/
	public Piece()
		{
		xPosition = 0;
		yPosition = 0;
		color = 0;
	  	}

	//*********************************************************
	//Function name: Piece
	//Purpose: constructor to create a piece
	//Input 1: int x (represents X coordinate of the piece)
	//Input 2: int y (represents Y coordinate of the piece)
	//Input 3: Image pI (represents the piece's image file)
	//Output: Piece
	//*********************************************************

	/**
	* Constructor used to create pieces.
	*
	* @param x X coordinate of piece
	* @param y Y coordinate of piece
	* @param pI piece's image file
	*/
	public Piece( int x, int y, Image pI )
		{
		xPosition = x;
		yPosition = y;
		pieceImage = pI;
		}

	//*********************************************************
	//Function name: setXPosition
	//Purpose: to set the X coordinate of the piece
	//Input: int x (represents X coordinate)
	//Output: void
	//*********************************************************

	/**
	* Sets the X coordinate of a piece.
	*
	* @param x the X coordinate
	* @return void
	*/
	public void setXPosition( int x )
		{
		xPosition = x;
		}

	//*********************************************************
	//Function name: setYPosition
	//Purpose: to set the Y coordinate of the piece
	//Input: int y (represents Y coordinate)
	//Output: void
	//*********************************************************

	/**
	* Sets the Y coordinate of a piece.
	*
	* @param y the Y coordinate
	* @return void
	*/
	public void setYPosition( int y )
		{
		yPosition = y;
		}

	//*********************************************************
	//Function name: getXPosition
	//Purpose: gets the X coordinate of the piece
	//Input: none
	//Output: int xPosition (represents X coordinate)
	//*********************************************************

	/**
	* Gets the X coordinate of a piece.
	*
	* @return X coordinate of the piece
	*/
	public int getXPosition()
		{
		return xPosition;
		}

	//*********************************************************
	//Function name: getYPosition
	//Purpose: gets the Y coordinate of the piece
	//Input: none
	//Output: int yPosition (represents Y coordinate)
	//*********************************************************

	/**
	* Gets the Y coordinate of a piece.
	*
	* @return Y coordinate of the piece
	*/
	public int getYPosition()
		{
		return yPosition;
		}

	//*********************************************************
	//Function name: getColor
	//Purpose: gets the integer representation of the color of the piece
	//Input: none
	//Output: int (0 = blank; 1 = black; 2 = white)
	//*********************************************************

	/**
	* Gets the color of a piece.
	*
	* @return color of the piece
	*/
	public int getColor()
		{
		return 0;
		}

	//*********************************************************
	//Function name: getPieceImage
	//Purpose: gets the Image of the piece
	//Input: none
	//Output: Image (blackPieceImage = black; whitePieceImage = white)
	//*********************************************************

	/**
	* Gets the Image of a piece.
	*
	* @return Image of the piece
	*/
	public Image getPieceImage()
		{
		return pieceImage;
		}
	}