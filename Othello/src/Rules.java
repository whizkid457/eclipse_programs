// Tyrone Cheng
// 4 March 2004
// Description: Othello project

// Java packages
import java.applet.*;
import java.awt.*;
import javax.swing.*;

public class Rules
	{

	//*********************************************************
	//Function name: checkDuplicate
	//Purpose: to check if box clicked already has a piece
	//Input 1: int x (represents clicked column of board)
	//Input 2: int y (represents clicked row of board)
	//Input 3: int b[][] (represents 2D array of board)
	//Output: boolean (true = no piece found; false = piece found)
	//*********************************************************

	/**
	* Checks if box clicked already has a piece.
	*
	* @param x clicked column of board
	* @param y clicked row of board
	* @param b 2D array of the board
	* @return whether or not a piece was found in the box
	*/
	public static boolean checkDuplicate( int x, int y, int b[][] )
		{
		if ( b[ y ][ x ] == 0 )
			{
			return true;
			}
		else
			{
			return false;
			}
		}

	//*********************************************************
	//Function name: validateHorizontal
	//Purpose: searches specified row to validate move
	//Input 1: int x (represents clicked column of board)
	//Input 2: int y (represents clicked row of board)
	//Input 3: int c (represents current piece's color)
	//Input 4: int b[][] (represents 2D array of board)
	//Output: boolean (true = valid move; false = invalid move)
	//*********************************************************

	/**
	* Searches specified row of the board for pieces to flip.
	*
	* @param x clicked column of board
	* @param y clicked row of board
	* @param c placed piece's color
	* @param b 2D array of board
	* @return whether or not the location of a move is legal in the horizontal direction
	*/
	public static boolean validateHorizontal( int x, int y, int c, int b[][] )
		{
		boolean horizontal1 = false;
		boolean horizontal2 = false;

		//*******************************************
		// This for loop searches all pieces to the
		// left of the reference piece.
		//*******************************************
		for( int counter = x - 2; counter >= 0; counter-- )
			{
			if( b[ y ][ x - 1 ] == changePieceColor( c ) )
				{
				//**********************************************
				// This if statment is executed when a bordering
				// piece of the same color is found.
				//**********************************************
				if( b[ y ][ counter ] == c )
					{
					counter = -1;
					horizontal1 = true;
					}

				if( counter != -1 )
					{
					//************************************************
					// This if statement is executed when no opposite
					// piece is found.
					//************************************************
					if( b[ y ][ counter ] == 0 )
						{
						counter = -1;
						horizontal1 = false;
						}
					}
				}
			else
				{
				horizontal1 = false;
				}
			}

		//*******************************************
		// This for loop searches all pieces to the
		// right of the reference piece.
		//*******************************************
		for( int counter = x + 2; counter <= 7; counter++ )
			{
			if( b[ y ][ x + 1 ] == changePieceColor( c ) )
				{
				//**********************************************
				// This if statment is executed when a bordering
				// piece of the same color is found.
				//**********************************************
				if( b[ y ][ counter ] == c )
					{
					counter = 8;
					horizontal2 = true;
					}
				if( counter != 8 )
					{
					//************************************************
					// This if statement is executed when no opposite
					// piece is found.
					//************************************************
					if( b[ y ][ counter ] == 0 )
						{
						counter = 8;
						horizontal2 = false;
						}
					}
				}
			else
				{
				horizontal2 = false;
				}
			}

		if( horizontal1 == true || horizontal2 == true )
			{
			return true;
			}
		else
			{
			return false;
			}
		}

	//*********************************************************
	//Function name: validateVertical
	//Purpose: searches specified column to validate move
	//Input 1: int x (represents clicked column of board)
	//Input 2: int y (represents clicked row of board)
	//Input 3: int c (represents current piece's color)
	//Input 4: int b[][] (represents 2D array of board)
	//Output: boolean (true = valid move; false = invalid move)
	//*********************************************************

	/**
	* Searches specified column of the board for pieces to flip.
	*
	* @param x clicked column of board
	* @param y clicked row of board
	* @param c placed piece's color
	* @param b 2D array of board
	* @return whether or not the location of a move is legal in the vertical direction
	*/
	public static boolean validateVertical( int x, int y, int c, int b[][] )
		{
		boolean vertical1 = false;
		boolean vertical2 = false;

		//*******************************************
		// This for loop searches all pieces above
		// the reference piece.
		//*******************************************
		for( int counter = y - 2; counter >= 0; counter-- )
			{
			if( b[ y - 1 ][ x ] == changePieceColor( c ) )
				{
				//**********************************************
				// This if statment is executed when a bordering
				// piece of the same color is found.
				//**********************************************
				if( b[ counter ][ x ] == c )
					{
					counter = -1;
					vertical1 = true;
					}
				if( counter != -1 )
					{
					//************************************************
					// This if statement is executed when no opposite
					// piece is found.
					//************************************************
					if( b[ counter ][ x ] == 0 )
						{
						counter = -1;
						vertical1 = false;
						}
					}
				}
			else
				{
				vertical1 = false;
				}
			}

		//*******************************************
		// This for loop searches all pieces below
		// the reference piece.
		//*******************************************
		for( int counter = y + 2; counter <= 7; counter++ )
			{
			// checks adjacent piece
			if( b[ y + 1 ][ x ] == changePieceColor( c ) )
				{
				//**********************************************
				// This if statment is executed when a bordering
				// piece of the same color is found.
				//**********************************************
				if( b[ counter ][ x ] == c )
					{
					counter = 8;
					vertical2 = true;
					}
				if( counter != 8 )
					{
					//************************************************
					// This if statement is executed when no opposite
					// piece is found.
					//************************************************
					if( b[ counter ][ x ] == 0 )
						{
						counter = 8;
						vertical2 = false;
						}
					}
				}
			else
				{
				vertical2 = false;
				}
			}

		if( vertical1 == true || vertical2 == true )
			{
			return true;
			}
		else
			{
			return false;
			}
		}

	//*********************************************************
	//Function name: validateDiagonalDLUR
	//Purpose: searches specified diagonal, lower left to upper right, to validate move
	//Input 1: int x (represents clicked column of board)
	//Input 2: int y (represents clicked row of board)
	//Input 3: int c (represents current piece's color)
	//Input 4: int b[][] (represents 2D array of board)
	//Output: boolean (true = valid move; false = invalid move)
	//*********************************************************

	/**
	* Searches specified diagonal, lower left to upper right, to validate move.
	*
	* @param x clicked column of board
	* @param y clicked row of board
	* @param c placed piece's color
	* @param b 2D array of board
	* @return whether or not the location of a move is legal in the lower left to upper right diagonal direction
	*/
	public static boolean validateDiagonalDLUR( int x, int y, int c, int b[][] )
		{
		boolean diagonalDLUR1 = false;
		boolean diagonalDLUR2 = false;

		int xCounter = x - 1;
		int yCounter = y + 1;

		//*******************************************
		// This while loop searches all pieces to the
		// lower-left of the reference piece.
		//*******************************************
		while( xCounter > 0 && yCounter < 7 )
			{
			xCounter--;
			yCounter++;

			if( b[ y + 1 ][ x - 1 ] == changePieceColor( c ) )
				{
				//**********************************************
				// This if statment is executed when a bordering
				// piece of the same color is found.
				//**********************************************
				if( b[ yCounter ][ xCounter ] == c )
					{
					// breaks the while loop
					xCounter = -1;
					yCounter = 8;

					diagonalDLUR1 = true;
					}

				if( xCounter != -1 && yCounter != 8 )
					{
					//************************************************
					// This if statement is executed when no opposite
					// piece is found.
					//************************************************
					if( b[ yCounter ][ xCounter ] == 0 )
						{
						// breaks the while loop
						xCounter = -1;
						yCounter = 8;

						diagonalDLUR1 = false;
						}
					}
				}
			else
				{
				diagonalDLUR1 = false;
				}
			}

		xCounter = x + 1;
		yCounter = y - 1;

		//*******************************************
		// This while loop searches all pieces to the
		// upper-right of the reference piece.
		//*******************************************
		while( xCounter < 7 && yCounter > 0 )
			{
			xCounter++;
			yCounter--;

			if( b[ y - 1 ][ x + 1 ] == changePieceColor( c ) )
				{
				//**********************************************
				// This if statment is executed when a bordering
				// piece of the same color is found.
				//**********************************************
				if( b[ yCounter ][ xCounter ] == c )
					{
					// breaks the while loop
					xCounter = 8;
					yCounter = -1;

					diagonalDLUR2 = true;
					}

				if( xCounter != 8 && yCounter != -1 )
					{
					//************************************************
					// This if statement is executed when no opposite
					// piece is found.
					//************************************************
					if( b[ yCounter ][ xCounter ] == 0 )
						{
						// breaks the while loop
						xCounter = 8;
						yCounter = -1;

						diagonalDLUR2 = false;
						}
					}
				}
			else
				{
				diagonalDLUR2 = false;
				}
			}

		xCounter = 0;
		yCounter = 0;

		if( diagonalDLUR1 == true || diagonalDLUR2 == true )
			{
			return true;
			}
		else
			{
			return false;
			}
		}

	//*********************************************************
	//Function name: validateDiagonalULDR
	//Purpose: searches specified diagonal, upper left to lower right, to validate move
	//Input 1: int x (represents clicked column of board)
	//Input 2: int y (represents clicked row of board)
	//Input 3: int c (represents current piece's color)
	//Input 4: int b[][] (represents 2D array of board)
	//Output: boolean (true = valid move; false = invalid move)
	//*********************************************************

	/**
	* Searches specified diagonal, upper left to lower right, to validate move.
	*
	* @param x clicked column of board
	* @param y clicked row of board
	* @param c placed piece's color
	* @param b 2D array of board
	* @return whether or not the location of a move is legal in the upper left to lower right diagonal direction
	*/
	public static boolean validateDiagonalULDR( int x, int y, int c, int b[][] )
		{
		boolean diagonalULDR1 = false;
		boolean diagonalULDR2 = false;

		int xCounter = x + 1;
		int yCounter = y + 1;

		//*******************************************
		// This while loop searches all pieces to the
		// lower-right of the reference piece.
		//*******************************************
		while( xCounter < 7 && yCounter < 7 )
			{
			xCounter++;
			yCounter++;

			if( b[ y + 1 ][ x + 1 ] == changePieceColor( c ) )
				{
				//**********************************************
				// This if statment is executed when a bordering
				// piece of the same color is found.
				//**********************************************
				if( b[ yCounter ][ xCounter ] == c )
					{
					// breaks the while loop
					xCounter = 8;
					yCounter = 8;

					diagonalULDR1 = true;
					}

				if( xCounter != 8 && yCounter != 8 )
					{
					//************************************************
					// This if statement is executed when no opposite
					// piece is found.
					//************************************************
					if( b[ yCounter ][ xCounter ] == 0 )
						{
						// breaks the while loop
						xCounter = 8;
						yCounter = 8;

						diagonalULDR1 = false;
						}
					}
				}
			else
				{
				diagonalULDR1 = false;
				}
			}

		xCounter = x - 1;
		yCounter = y - 1;

		//*******************************************
		// This while loop searches all pieces to the
		// upper-left of the reference piece.
		//*******************************************
		while( xCounter > 0 && yCounter > 0 )
			{
			xCounter--;
			yCounter--;

			if( b[ y - 1 ][ x - 1 ] == changePieceColor( c ) )
				{
				//**********************************************
				// This if statment is executed when a bordering
				// piece of the same color is found.
				//**********************************************
				if( b[ yCounter ][ xCounter ] == c )
					{
					// breaks the while loop
					xCounter = -1;
					yCounter = -1;

					diagonalULDR2 = true;
					}

				if( xCounter != -1 && yCounter != -1 )
					{
					//************************************************
					// This if statement is executed when no opposite
					// piece is found.
					//************************************************
					if( b[ yCounter ][ xCounter ] == 0 )
						{
						// breaks the while loop
						xCounter = -1;
						yCounter = -1;

						diagonalULDR2 = false;
						}
					}
				}
			else
				{
				diagonalULDR2 = false;
				}
			}

		xCounter = 0;
		yCounter = 0;

		if( diagonalULDR1 == true || diagonalULDR2 == true )
			{
			return true;
			}
		else
			{
			return false;
			}
		}

	//*********************************************************
	//Function name: searchLegalMoves
	//Purpose: searches every single square to determine if a legal move exists
	//Input 1: int color (represents current player's piece color)
	//Input 2: int b[][] (represents 2D array of board)
	//Output: boolean (true = valid move found; false = no valid move found)
	//*********************************************************

	/**
	* Searches every single square to determine if a legal move exists.
	*
	* @param c current player's piece color
	* @param b 2D array of board
	* @return whether or not a legal move exists
	*/
	public static boolean searchLegalMoves( int c, int b[][] )
		{
		for( int row = 0; row < 8; row++ )
			{
			for( int column = 0; column < 8; column++ )
				{
				if( b[ row ][ column ] == 0 )
					{
					if( validateHorizontal( column, row, c, b ) == true ||
						validateVertical( column, row, c, b ) == true ||
						validateDiagonalULDR( column, row, c, b ) == true ||
						validateDiagonalDLUR( column, row, c, b ) == true )
						{
						return true;
						}
					}
				}
			}
		return false;
		}

	//*********************************************************
	//Function name: changePieceColor
	//Purpose: toggles the piece color for use in if statements
	//Input: int c (represents current player's piece color)
	//Output: int (1 = black; 2 = white)
	//*********************************************************

	/**
	* Toggles the piece color for use in if statements.
	*
	* @param c current player's piece color
	* @return toggled piece color
	*/
	public static int changePieceColor( int c )
		{
		c++;

		if( c == 3 )
			{
			return 1;
			}
		else
			{
			return 2;
			}
		}

	//*********************************************************
	//Function name: validatePosition
	//Purpose: executes all validate methods to progress the game
	//Input 1: int x (represents clicked column of board)
	//Input 2: int y (represents clicked row of board)
	//Input 3: int color (represents current piece's color)
	//Input 4: int b[][] (represents 2D array of board)
	//Output: boolean (true = valid move; false = invalid move)
	//*********************************************************

	/**
	* Searches specified row of the board for pieces to flip.
	*
	* @param x clicked column of board
	* @param y clicked row of board
	* @param c placed piece's color
	* @param b 2D array of board
	* @return whether or not the location of a move is legal
	*/
	public static boolean validateMove( int x, int y, int c, int b[][] )
		{
		if( checkDuplicate( x, y, b ) == false )
			{
			return false;
			}
		else if( validateHorizontal( x, y, c, b ) == true ||
			validateVertical( x, y, c, b ) == true ||
			validateDiagonalULDR( x, y, c, b ) == true ||
			validateDiagonalDLUR( x, y, c, b ) == true )
			{
			return true;
			}
		else if( validateHorizontal( x, y, c, b ) == false &&
			validateVertical( x, y, c, b ) == false &&
			validateDiagonalULDR( x, y, c, b ) == false &&
			validateDiagonalDLUR( x, y, c, b ) == false )
		 	{
		 	return false;
		 	}
		else
			{
			return false;
			}
		}
	}