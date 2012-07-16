import java.math.*;
import java.util.*;
public class PalindromeTester
{
	public static void main(String[] args)
	{
		Scanner pal = new Scanner(System.in);
		System.out.println("Enter a number to see whether it is a palindrome.");
		BigInteger number = pal.nextBigInteger();
		String palindrome = number.toString();
		if (palindrome.equals(new StringBuffer(String.valueOf(palindrome)).reverse().toString())) 
		{
			System.out.println(palindrome + " is a palindrome number");
		}
		else System.out.println(palindrome + " is not a palindrome number");
	}
}
