import java.math.BigInteger;
public class FibonacciNumbers
{
	public static void main(String[] args)
	{
		BigInteger a = new BigInteger ("0");
		BigInteger b = new BigInteger ("0");
		BigInteger c = new BigInteger ("1");
		BigInteger limit = new BigInteger("9999999999999999999999999");
		int counter = 0;
		while (a.compareTo(limit)<=999999999)
		{   
			a = b.add(c);
			counter++;
			System.out.println(counter + "." + a + "  ");
			b = c.add(a);
			counter++;
			System.out.println(counter + "." + b + "  ");
			c = a.add(b);
			counter++;
			System.out.println(counter + "." + c + "  ");
			
		}
	}
}
