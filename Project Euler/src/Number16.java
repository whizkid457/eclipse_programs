import java.math.BigInteger;
public class Number16
{
	public static void main(String[] args)
	{
		BigInteger base = new BigInteger("2");
		BigInteger mode = new BigInteger("10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
		base = base.modPow(new BigInteger("1000"), mode);
		System.out.println("2^1000 = " + base);
		String answer = base.toString();
		int length = answer.length();
		int total = 0;
		for(int loop = 0; loop < length; loop++)
		{
			total += answer.charAt (loop) - 48; 			
		}
		System.out.println("The answer to Project Euler #16 is " + total);
	}

}
