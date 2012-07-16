import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
* Computer Guess the Number! Yahoo! Answers
* @author Mohamed Mansour
*
*/
public class GuesstheNumber
{

public static void main(String[] args) throws IOException
{
// Utils
BufferedReader stdin = new BufferedReader( new InputStreamReader( System.in ) );
Random generator = new Random();

// User variables
boolean correct = false;
int numberOfGuesses = 0;

// Computers variables
int startIndex = 0;
int endIndex = 50;
int compGuess;
// Choose a number from 1 to 10 in your head...

System.out.println("Think of a number between " + startIndex + " and " + endIndex);

while(!correct)
{
// If the index are the same the number has been guessed
if (startIndex == endIndex)
{
compGuess = startIndex;
}
else
{
// Computer start guessing!
compGuess = Math.abs(generator.nextInt()) % (endIndex-startIndex) + startIndex;
}

System.out.println("Computer Says: is the number " + compGuess);

// Increment Number of Guesses!
numberOfGuesses++;

// Grab input
System.out.print("Higher(H) or Lower(L) or Correct(C): ");
String input = stdin.readLine();

// Check input
if(input.equals("H"))
{
// It is higher so assign the start index to the current comp guess
startIndex = compGuess + 1;
}
else if (input.equals("L"))
{
// It is lower so assign the end index to the current comp guess
endIndex = compGuess - 1;
}
else if (input.equals("C"))
{
correct = true;
System.out.println("Computer have guessed the number! Total of " + numberOfGuesses + " guesses!" );
}
}
}
}