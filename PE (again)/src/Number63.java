import java.math.BigInteger;
public class Number63
{
	public static void main(String[] args)
	{
		int counter = 0, b = 1;
		BigInteger a = new BigInteger("1");
		while (b != 30)
		{
			BigInteger exp = a.pow(b);
			if (Integer.toString(exp.toString().length()).equals(Integer.toString(b)))
			{
				System.out.println(exp + ": " + a + "^" + b); 
				counter++;
			}
			if (a.equals(new BigInteger("30")))
			{
				a = new BigInteger("1");
				b++;
			}
			a = a.add(new BigInteger("1"));
		}
		System.out.println(counter);
	}
}
