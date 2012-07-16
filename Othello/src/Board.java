// Tyrone Cheng
// 4 March 2004
// Description: Othello project

// Java packages
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Board
	{
	private int board[][];
	private String output;
	private ArrayList allPieces;

	//*********************************************************
	//Function name: Board
	//Purpose: zero constructor
	//Input: none
	//Output: none
	//*********************************************************

	/**
	* Zero constructor for board.
	*/
	public Board()
		{
		board = new int[ 0 ][ 0 ];
		output = "";
	  	}

	//*********************************************************
	//Function name: Board
	//Purpose: constructor to make a board
	//Input 1: int row (represents rows of board)
	//Input 2: int column (represents columns of board)
	//Input 3: ArrayList (represents ArrayList representation of board)
	//Output: Board
	//*********************************************************

	/**
	* Constructor to create a board.
	*/
	public Board( int row, int column, ArrayList aP )
		{
		board = new int[ row ][ column ];
		allPieces = aP;
		}

	//*********************************************************
	//Function name: getBoard
	//Purpose: gets the 2D array of the board
	//Input: none
	//Output: int[][] board (represents 2D array of board)
	//*********************************************************

	/**
	* Gets the 2D array of the board.
	*
	* @return 2D array of the board
	*/
	public int[][] getBoard()
		{
		return board;
		}

	//*********************************************************
	//Function name: getArrayList
	//Purpose: gets the ArrayList of the board
	//Input: none
	//Output: ArrayList allPieces (represents ArrayList of board)
	//*********************************************************

	/**
	* Gets the ArrayList of the board.
	*
	* @return ArrayList of the board
	*/
	public ArrayList getArrayList()
		{
		return allPieces;
		}

	//*********************************************************
	//Function name: updateBoard
	//Purpose: to update the 2D array of the board with user's input
	//Input 1: int row (represents row of board)
	//Input 2: int column (represents column of board)
	//Input 3: int color (represents color of the piece at specific location)
	//Output: void
	//*********************************************************

	/**
	* Updates the 2D array of the board with user's input.
	*
	* @param row the row of the board
	* @param column the column of the board
	* @param color the color at specific location
	* @return void
	*/
	public void updateBoard( int row, int column, int color )
		{
		board[ row ][ column ] = color;
		}

	//*********************************************************
	//Function name: updateArrayList
	//Purpose: to update ArrayList of the board from 2D array
	//Input 1: Image bPI (represents black piece's image)
	//Input 2: Image wPI (represents white piece's image)
	//Output: void
	//*********************************************************

	/**
	* Updates ArrayList of the board from 2D array.
	*
	* @param bPI black piece's image
	* @param wPI white piece's image
	* @return void
	*/
	public void updateArrayList( Image bPI, Image wPI )
		{
		for( int r = 0; r < 8; r++ )
			{
			for( int c = 0; c < 8; c++ )
				{

				//***********************************************************
				// These if statements match a piece's color at a particular
				// location in the 2D array and set it in its equivalent
				// location in the ArrayList.
				//***********************************************************
				if( board[ r ][ c ] == 1 )
					{
					allPieces.set( ( 8 * r ) + c, new BlackPiece( ( c * 51 ) + 1, ( r * 51 ) + 1, bPI ) );
					}

				if( board[ r ][ c ] == 2 )
					{
					allPieces.set( ( 8 * r ) + c, new WhitePiece( ( c * 51 ) + 1, ( r * 51 ) + 1, wPI ) );
					}
				}
			}
		}

	//*********************************************************
	//Function name: printBoard
	//Purpose: prints 2D array of the board
	//Input: none
	//Output: text
	//*********************************************************

	/**
	* Prints 2D array of the board.
	*
	* @return void
	*/
	public void printBoard()
		{
		output = "      A   B   C   D   E   F   G   H";

		for( int r = 0; r < 8; r++ )
			{
			output += "\n[" + r + "]   ";

			for( int c = 0; c < 8; c++ )
				{
				output += board[ r ][ c ] + "   ";
				}
			}
		System.out.println( output + "\n" );
		}

	//*********************************************************
	//Function name: searchHorizontal
	//Purpose: searches specified row of the board for pieces to flip
	//Input 1: int xPosition (represents starting X position)
	//Input 2: int yPosition (represents starting Y position)
	//Input 3: int color (represents placed piece's color)
	//Output: void
	//*********************************************************

	/**
	* Searches specified row of the board for pieces to flip.
	*
	* @param xPosition starting X position
	* @param yPosition starting Y position
	* @param color placed piece's color
	* @return void
	*/
	public void searchHorizontal( int xPosition, int yPosition, int color )
		{
		int xCounter = xPosition;

		//*******************************************
		// This while loop searches all pieces to the
		// left of the reference piece.
		//*******************************************
		while( xCounter > 0 )
			{
			xCounter--;

			//**********************************************
			// This if statment is executed when a bordering
			// piece of the same color is found.  All pieces
			// in between are then flipped.
			//**********************************************
			if( board[ yPosition ][ xCounter ] == color )
				{
				flipHorizontal( xCounter, xPosition, yPosition, color );

				// breaks the while loop
				xCounter = -1;
				}

			if( xCounter != -1 )
				{
				//************************************************
				// This if statement is executed when no opposite
				// piece is found.
				//************************************************
				if( board[ yPosition ][ xCounter ] == 0 )
					{
					// breaks the while loop
					xCounter = -1;
					}
				}
			}

		xCounter = xPosition;

		//*******************************************
		// This while loop searches all pieces to the
		// right of the reference piece.
		//*******************************************
		while( xCounter < 7 )
			{
			xCounter++;

			//**********************************************
			// This if statment is executed when a bordering
			// piece of the same color is found.  All pieces
			// in between are then flipped.
			//**********************************************
			if( board[ yPosition ][ xCounter ] == color )
				{
				flipHorizontal( xPosition, xCounter, yPosition, color );

				// breaks the while loop
				xCounter = 8;
				}

			if( xCounter != 8 )
				{
				//************************************************
				// This if statement is executed when no opposite
				// piece is found.
				//************************************************
				if( board[ yPosition ][ xCounter ] == 0 )
					{
					// breaks the while loop
					xCounter = 8;
					}
				}
			}
		}

	//*********************************************************
	//Function name: searchVertical
	//Purpose: searches specified column of the board for pieces to flip
	//Input 1: int xPosition (represents starting X position)
	//Input 2: int yPosition (represents starting Y position)
	//Input 3: int color (represents placed piece's color)
	//Output: void
	//*********************************************************

	/**
	* Searches specified column of the board for pieces to flip.
	*
	* @param xPosition starting X position
	* @param yPosition starting Y position
	* @param color placed piece's color
	* @return void
	*/
	public void searchVertical( int xPosition, int yPosition, int color )
		{
		int yCounter = yPosition;


		//*******************************************
		// This while loop searches all pieces above
		// the reference piece.
		//*******************************************
		while( yCounter > 0 )
			{
			yCounter--;

			//**********************************************
			// This if statment is executed when a bordering
			// piece of the same color is found.  All pieces
			// in between are then flipped.
			//**********************************************
			if( board[ yCounter ][ xPosition ] == color )
				{
				flipVertical( yCounter, yPosition, xPosition, color );

				// breaks the while loop
				yCounter = -1;
				}


			if( yCounter != -1 )
				{
				//************************************************
				// This if statement is executed when no opposite
				// piece is found.
				//************************************************
				if( board[ yCounter ][ xPosition ] == 0 )
					{
					// breaks the while loop
					yCounter = -1;
					}
				}
			}

		yCounter = yPosition;

		//*******************************************
		// This while loop searches all pieces below
		// the reference piece.
		//*******************************************
		while( yCounter < 7 )
			{
			yCounter++;


			//**********************************************
			// This if statment is executed when a bordering
			// piece of the same color is found.  All pieces
			// in between are then flipped.
			//**********************************************
			if( board[ yCounter ][ xPosition ] == color )
				{
				flipVertical( yPosition, yCounter, xPosition, color );

				// breaks the while loop
				yCounter = 8;
				}


			if( yCounter != 8 )
				{
				//************************************************
				// This if statement is executed when no opposite
				// piece is found.
				//************************************************
				if( board[ yCounter ][ xPosition ] == 0 )
					{
					// breaks the while loop
					yCounter = 8;
					}
				}
			}
		}

	//*********************************************************
	//Function name: searchDiagonalDLUR
	//Purpose: searches specified diagonal of the board from lower left to upper right for pieces to flip
	//Input 1: int xPosition (represents starting X position)
	//Input 2: int yPosition (represents starting Y position)
	//Input 3: int color (represents placed piece's color)
	//Output: void
	//*********************************************************

	/**
	* Searches specified diagonal of the board from lower left to upper right for pieces to flip.
	*
	* @param xPosition starting X position
	* @param yPosition starting Y position
	* @param color placed piece's color
	* @return void
	*/
	public void searchDiagonalDLUR( int xPosition, int yPosition, int color )
		{
		int xCounter = xPosition;
		int yCounter = yPosition;

		//*******************************************
		// This while loop searches all pieces to the
		// lower-left of the reference piece.
		//*******************************************
		while( xCounter > 0 && yCounter < 7 )
			{
			xCounter--;
			yCounter++;

			//**********************************************
			// This if statment is executed when a bordering
			// piece of the same color is found.  All pieces
			// in between are then flipped.
			//**********************************************
			if( board[ yCounter ][ xCounter ] == color )
				{
				flipDiagonalDLUR( xCounter, xPosition, yCounter, yPosition, color );

				// breaks the while loop
				xCounter = -1;
				yCounter = 8;
				}


			if( xCounter != -1 && yCounter != 8 )
				{
				//************************************************
				// This if statement is executed when no opposite
				// piece is found.
				//************************************************
				if( board[ yCounter ][ xCounter ] == 0 )
					{
					// breaks the while loop
					xCounter = -1;
					yCounter = 8;
					}
				}
			}

		xCounter = xPosition;
		yCounter = yPosition;

		//*******************************************
		// This while loop searches all pieces to the
		// upper-right of the reference piece.
		//*******************************************
		while( xCounter < 7 && yCounter > 0 )
			{
			xCounter++;
			yCounter--;

			//**********************************************
			// This if statment is executed when a bordering
			// piece of the same color is found.  All pieces
			// in between are then flipped.
			//**********************************************
			if( board[ yCounter ][ xCounter ] == color )
				{
				flipDiagonalDLUR( xPosition, xCounter, yPosition, yCounter, color );

				// breaks the while loop
				xCounter = 8;
				yCounter = -1;
				}


			if( xCounter != 8 && yCounter != -1 )
				{
				//************************************************
				// This if statement is executed when no opposite
				// piece is found.
				//************************************************
				if( board[ yCounter ][ xCounter ] == 0 )
					{
					// breaks the while loop
					xCounter = 8;
					yCounter = -1;
					}
				}
			}
		}

	//*********************************************************
	//Function name: searchDiagonalULDR
	//Purpose: searches specified diagonal of the board from upper left to lower right for pieces to flip
	//Input 1: int xPosition (represents starting X position)
	//Input 2: int yPosition (represents starting Y position)
	//Input 3: int color (represents placed piece's color)
	//Output: void
	//*********************************************************

	/**
	* Searches specified diagonal of the board from upper left to lower right for pieces to flip.
	*
	* @param xPosition starting X position
	* @param yPosition starting Y position
	* @param color placed piece's color
	* @return void
	*/
	public void searchDiagonalULDR( int xPosition, int yPosition, int color )
		{
		int xCounter = xPosition;
		int yCounter = yPosition;


		//*******************************************
		// This while loop searches all pieces to the
		// lower-right of the reference piece.
		//*******************************************
		while( xCounter < 7 && yCounter < 7 )
			{
			xCounter++;
			yCounter++;

			//**********************************************
			// This if statment is executed when a bordering
			// piece of the same color is found.  All pieces
			// in between are then flipped.
			//**********************************************
			if( board[ yCounter ][ xCounter ] == color )
				{
				flipDiagonalULDR( xPosition, xCounter, yPosition, yCounter, color );

				// breaks the while loop
				xCounter = 8;
				yCounter = 8;
				}

			if( xCounter != 8 && yCounter != 8 )
				{
				//************************************************
				// This if statement is executed when no opposite
				// piece is found.
				//************************************************
				if( board[ yCounter ][ xCounter ] == 0 )
					{
					// breaks the while loop
					xCounter = 8;
					yCounter = 8;
					}
				}
			}

		xCounter = xPosition;
		yCounter = yPosition;

		//*******************************************
		// This while loop searches all pieces to the
		// upper-left of the reference piece.
		//*******************************************
		while( xCounter > 0 && yCounter > 0 )
			{
			xCounter--;
			yCounter--;

			//**********************************************
			// This if statment is executed when a bordering
			// piece of the same color is found.  All pieces
			// in between are then flipped.
			//**********************************************
			if( board[ yCounter ][ xCounter ] == color )
				{
				flipDiagonalULDR( xCounter, xPosition, yCounter, yPosition, color );

				// breaks the while loop
				xCounter = -1;
				yCounter = -1;
				}

			if( xCounter != -1 && yCounter != -1 )
				{
				//************************************************
				// This if statement is executed when no opposite
				// piece is found.
				//************************************************
				if( board[ yCounter ][ xCounter ] == 0 )
					{
					// breaks the while loop
					xCounter = -1;
					yCounter = -1;
					}
				}
			}
		}

	//*********************************************************
	//Function name: flipHorizontal
	//Purpose: flips all valid pieces in the row
	//Input 1: int start (represents starting column)
	//Input 2: int end (represents ending column)
	//Input 3: int yPosition (represents row to search)
	//Input 4: int color (represents placed piece's color)
	//Output: void
	//*********************************************************

	/**
	* Flips all valid pieces in the row.
	*
	* @param start starting column
	* @param end ending column
	* @param yPosition row to search
	* @param color placed piece's color
	* @return void
	*/
	private void flipHorizontal( int start, int end, int yPosition, int color ) //doesn't flip the start and the end pieces
		{
		for( int counter = start + 1; counter < end; counter++ )
			{
			if( board[ yPosition ][ counter ] != color )
				{
				board[ yPosition ][ counter ] = color;
				}
			}
		}

	//*********************************************************
	//Function name: flipVertical
	//Purpose: flips all valid pieces in the column
	//Input 1: int start (represents starting row)
	//Input 2: int end (represents ending row)
	//Input 3: int yPosition (represents column to search)
	//Input 4: int color (represents placed piece's color)
	//Output: void
	//*********************************************************

	/**
	* Flips all valid pieces in the column.
	*
	* @param start starting row
	* @param end ending row
	* @param xPosition column to search
	* @param color placed piece's color
	* @return void
	*/
	private void flipVertical( int start, int end, int xPosition, int color ) //doesn't flip the start and the end pieces
		{
		for( int counter = start + 1; counter < end; counter++ )
			{
			if( board[ counter ][ xPosition ] != color )
				{
				board[ counter ][ xPosition ] = color;
				}
			}
		}

	//*********************************************************
	//Function name: flipDiagonalDLUR
	//Purpose: flips all valid pieces in the diagonal from lower left to upper right
	//Input 1: int xStart (represents starting column)
	//Input 2: int xEnd (represents ending column)
	//Input 3: int yStart (represents starting row)
	//Input 4: int yEnd (represents ending row)
	//Input 5: int color (represents placed piece's color)
	//Output: void
	//*********************************************************

	/**
	* Flips all valid pieces in the diagonal from lower left to upper right.
	*
	* @param xStart starting column
	* @param xEnd ending column
	* @param yStart starting row
	* @param yEnd ending row
	* @param color placed piece's color
	* @return void
	*/
	private void flipDiagonalDLUR( int xStart, int xEnd, int yStart, int yEnd, int color )
		{
		xStart++;
		yStart--;

		while( xStart != xEnd && yStart != yEnd )
			{
			if( board[ yStart ][ xStart ] != color )
				{
				board[ yStart ][ xStart ] = color;
				xStart++;
				yStart--;
				}
			}
		}

	//*********************************************************
	//Function name: flipDiagonalULDR
	//Purpose: flips all valid pieces in the diagonal from upper left to lower right
	//Input 1: int xStart (represents starting column)
	//Input 2: int xEnd (represents ending column)
	//Input 3: int yStart (represents starting row)
	//Input 4: int yEnd (represents ending row)
	//Input 5: int color (represents placed piece's color)
	//Output: void
	//*********************************************************

	/**
	* Flips all valid pieces in the diagonal from lupper left to lower right.
	*
	* @param xStart starting column
	* @param xEnd ending column
	* @param yStart starting row
	* @param yEnd ending row
	* @param color placed piece's color
	* @return void
	*/
	private void flipDiagonalULDR( int xStart, int xEnd, int yStart, int yEnd, int color )
		{
		xStart++;
		yStart++;

		while( xStart != xEnd && yStart != yEnd )
			{
			if( board[ yStart ][ xStart ] != color )
				{
				board[ yStart ][ xStart ] = color;
				xStart++;
				yStart++;
				}
			}
		}
	}