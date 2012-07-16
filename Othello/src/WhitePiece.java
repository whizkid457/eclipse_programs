// Tyrone Cheng
// 4 March 2004
// Description: Othello project

// Java packages
import java.awt.*;

public class WhitePiece extends Piece
	{
	private final int COLOR = 2;

	//*********************************************************
	//Function name: WhitePiece
	//Purpose: zero constructor
	//Input: none
	//Output: none
	//*********************************************************

	/**
	* Zero constructor for white piece.
	*/
	public WhitePiece()
		{
	  	}

	//*********************************************************
	//Function name: WhitePiece
	//Purpose: constructor to make white piece
	//Input 1: int x (represents X coordinate)
	//Input 2: int y (represents Y coordiante)
	//Input 3: Image pI (represents piece's image)
	//Output: WhitePiece
	//*********************************************************

	/**
	* Constructor to create a white piece.
	*
	* @param x X coordinate of piece
	* @param y Y coordinate of piece
	* @param pI piece's image file
	*/
	public WhitePiece( int x, int y, Image pI )
		{
		super( x, y, pI );
		}

	//*********************************************************
	//Function name: setXPosition
	//Purpose: to set the X coordinate of the white piece
	//Input: int x (represents X coordinate)
	//Output: void
	//*********************************************************

	/**
	* Sets the X coordinate of the white piece.
	*
	* @param x the X coordinate
	* @return void
	*/
	public void setXPosition( int x )
		{
		super.setXPosition( x );
		}

	//*********************************************************
	//Function name: setYPosition
	//Purpose: to set the Y coordinate of the white piece
	//Input: int y (represents Y coordinate)
	//Output: void
	//*********************************************************

	/**
	* Sets the Y coordinate of the white piece.
	*
	* @param y the Y coordinate
	* @return void
	*/
	public void setYPosition( int y )
		{
		super.setYPosition( y );
		}

	//*********************************************************
	//Function name: getXPosition
	//Purpose: gets the X coordinate of the white piece
	//Input: none
	//Output: int xPosition (represents X coordinate)
	//*********************************************************

	/**
	* Gets the X coordinate of the white piece.
	*
	* @return X coordinate of the white piece
	*/
	public int getXPosition()
		{
		return super.getXPosition();
		}

	//*********************************************************
	//Function name: getYPosition
	//Purpose: gets the Y coordinate of the white piece
	//Input: none
	//Output: int yPosition (represents Y coordinate)
	//*********************************************************

	/**
	* Gets the Y coordinate of the white piece.
	*
	* @return Y coordinate of the white piece
	*/
	public int getYPosition()
		{
		return super.getYPosition();
		}

	//*********************************************************
	//Function name: getColor
	//Purpose: gets the integer representation of the color of the piece
	//Input: none
	//Output: int COLOR
	//*********************************************************

	/**
	* Gets the color of the white piece.
	*
	* @return color of the white piece (2)
	*/
	public int getColor()
		{
		return COLOR;
		}

	//*********************************************************
	//Function name: getPieceImage
	//Purpose: gets the Image of the white piece
	//Input: none
	//Output: Image pieceImage
	//*********************************************************

	/**
	* Gets the Image of the white piece.
	*
	* @return Image of the white piece
	*/
	public Image getPieceImage()
		{
		return super.getPieceImage();
		}
	}