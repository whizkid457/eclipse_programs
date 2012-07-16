import java.math.BigInteger;
import java.util.Scanner;
public class Addsupdigits
{
	public static void main(String[] args)
	{
		BigInteger sum = new BigInteger("0");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		BigInteger number = input.nextBigInteger();
		int counter = 0;
		BigInteger one = new BigInteger("1");
		while(number.compareTo(one) >= 1)
		{
			BigInteger reminder = (number.remainder(new BigInteger("10"))); 
			sum = sum.add(reminder);
			counter++;
			number = number.divide(new BigInteger("10"));
		}
		System.out.println("The sum of the digits is " + sum);
		System.out.println("This number is " + counter + " digits long.");
	}
}
