import java.math.BigInteger;
public class Even 
{
	public static void main(String[] args) 
	{
		int x = 0;
		long sum = 0;
		long sum1 = 0;
		BigInteger a = new BigInteger("1000");
		BigInteger number = BigInteger.valueOf(x);
		BigInteger two = new BigInteger("2");
		BigInteger remainder = (number.remainder(two));
		while (number.compareTo(a)<=1000)
		{
			number = BigInteger.valueOf(x);			
			if (remainder.equals(new BigInteger("0")))
			{
				sum = sum + x;
			}
			if (remainder.equals(new BigInteger("1")))
			{
				sum1 = sum1 + x;
			}
			x++;
		}
		System.out.println("The sum of the even numbers below " + a + " is " + sum + ".");
		System.out.println("The sum of the odd numbers below " + a + " is " + sum1 + ".");            
	}
}

	
		
		
