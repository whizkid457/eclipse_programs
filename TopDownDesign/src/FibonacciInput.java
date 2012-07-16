import java.math.BigInteger;
import java.util.*;
public class FibonacciInput
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Which fibonacci number would you like to see?");
		BigInteger number = input.nextBigInteger();
		System.out.println(number + ": " + calcFib(number));
	}
	public static BigInteger calcFib(BigInteger number)
	{
		BigInteger a = new BigInteger("0"), b = new BigInteger("0") ,c = new BigInteger("1"), count = new BigInteger("0");
		while (true)
		{
			a = b.add(c);
			count = count.add(new BigInteger("1"));
			if (count.equals(number))
			{
				return a;
			}
			b = c.add(a);
			count = count.add(new BigInteger("1"));
			if (count.equals(number))
			{
				return b;
			}
			c = a.add(b);
			count = count.add(new BigInteger("1"));
			if (count.equals(number))
			{
				return c;
			}
		}		
	}
}
