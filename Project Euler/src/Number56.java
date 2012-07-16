import java.math.BigInteger;
public class Number56
{
	public static void main(String[] args)
	{
		int a = 2;
		int b = 2;
		int max = 0;
		BigInteger product = new BigInteger("1");
		while (a < 100 && b < 100)
		{
			BigInteger bigA = BigInteger.valueOf(a);
			//BigInteger bigB = BigInteger.valueOf(b);
			product = bigA.pow(b);
			
			b++;	
			System.out.println(a + "^" + b + " = " + product);
			String answer = product.toString();
			int length = answer.length();
			int total = 0;
			for(int loop = 0; loop < length; loop++)
			{
				total += answer.charAt (loop) - 48; 			
			}
			if (total > max)
			{
				max = total;
			}
			if (b == 99)
			{
				a++;
				b = 1;
			}
			product = new BigInteger("1");
		}
		System.out.println("The answer to Project Euler #56 is " + max);
	}
}
