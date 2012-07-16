import java.math.BigInteger;
public class Number25 
{
	public static void main(String[] args)
	{
		int a = 0;
		int b = 0;
		int c = 1;
		int counter = 0;
		BigInteger limit = new BigInteger("100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
		BigInteger A = BigInteger.valueOf(a);
		BigInteger B = BigInteger.valueOf(b);
		BigInteger C = BigInteger.valueOf(c);
		while (C != limit && B != limit && A != limit)
		{
			A = B.add(C);
			B = C.add(A);
			C = A.add(B);
			counter+=3;
			System.out.println(A);
			System.out.println(B);
			System.out.println(C);
			String a1 = A.toString();
			String a2 = B.toString();
			String a3 = C.toString();
			int length = a1.length();
			int length1 = a2.length();
			int length2 = a3.length();
			if (length == 1000 || length1 == 1000 || length2 == 1000)
			{
				System.out.println("The answer to Project Euler #25 is " + counter);
				break;
			}
			
		}
	}
}
