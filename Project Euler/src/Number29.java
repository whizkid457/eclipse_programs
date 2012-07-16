import java.math.BigInteger;
public class Number29
{
	public static void main(String[] args) 
	{
		int a = 2;
		int b = 1;
		int counter = 0;
		int counter1 = 0;
		BigInteger sum = new BigInteger("1");
		while (a <= 100 && b <= 100)
		{
			BigInteger A = BigInteger.valueOf(a);
			while (counter1 != b)
			{
				sum = sum.multiply(A);
				counter1++;
			}
			System.out.println(a + "^" + b + " = " + sum);
			counter++;
			b++;
			counter1 = 0;
			sum = new BigInteger("1");
			if (b == 100)
			{
				counter++;
				a++;
				b = 2;	
				counter1 = 0;
			}
		}
		System.out.println(counter);
	}
}
