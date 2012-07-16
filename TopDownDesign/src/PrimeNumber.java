import java.math.BigInteger;
import java.util.Scanner;
public class PrimeNumber
{
	public static void main(String[] args)
	{
		Scanner prime = new Scanner(System.in);
		System.out.print("Enter a positive number: ");
		BigInteger number = prime.nextBigInteger();
		if (number.compareTo(new BigInteger("0")) <= 0)
		{
			while (number.compareTo(new BigInteger("0")) <= 0)
			{
				System.out.print("Sorry, the input value, " + number + ", is out of range. Please try again: ");
				number = prime.nextBigInteger();	
			}
		}
		displayPrime(number);
	}
	private static BigInteger isPrime(BigInteger number)
	{
		 BigInteger divisor = new BigInteger("1"), count_div = new BigInteger("1");
		 while(number.compareTo(divisor)!= 0)
		 {
			 if (number.remainder(divisor).equals(new BigInteger("0")))
			 {
				count_div = count_div.add(new BigInteger("1"));
			 }
		     divisor = divisor.add(new BigInteger("1"));
		 }
		 if (count_div.equals(new BigInteger("2")))
		 {
			return number;
		 }	
		 else return new BigInteger("0");    
	}
	private static BigInteger displayPrime(BigInteger number)
	{
        if (isPrime(number).equals(new BigInteger("0")))
		{
        	System.out.println(number + " is not a prime number!");
        }
        else System.out.println(number + " is a prime number!");
		return new BigInteger("0");
	}
}
