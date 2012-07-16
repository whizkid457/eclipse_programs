import java.math.BigInteger;
public class Number48
{
	public static void main(String[] args)
	{
		int x = 1;
		int counter = 0;
		BigInteger sum1 = new BigInteger("0");
		BigInteger sum = new BigInteger("1");
		while (x <= 1000)
		{
			BigInteger X = BigInteger.valueOf(x);
			while (counter != x)
			{
				sum = sum.multiply(X);
				counter++;
			}
			System.out.println(x + "^" + x + " = " + sum);
			sum1 = sum1.add(sum);
			x++;
			counter = 0;
			sum = new BigInteger("1");
		}
		System.out.println("The answer to Project Euler #48 is " + sum1);
	}
}
