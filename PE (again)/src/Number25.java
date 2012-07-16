import java.math.BigInteger;
public class Number25
{
	public static void main(String[] args)
	{
		BigInteger a = new BigInteger("0");
		BigInteger b = new BigInteger("0");
		BigInteger c = new BigInteger("1");
		int counter = 1;
		while (true)
		{
			a = b.add(c);
			counter++;
			if (a.toString().length() == 1000)
			{
				System.out.println(counter); 
				break; 
			}
			b = c.add(a);
			counter++;
			if (b.toString().length() == 1000)
			{	
				System.out.println(counter);
				break; 
			}
			c = a.add(b);
			counter++;
			if (c.toString().length() == 1000)
			{
				System.out.println(counter); 
				break;
			}
		}
	}
}
