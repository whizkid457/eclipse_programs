public class Number2 
{
	public static void main(String[] args)
	{
		int counter = 0;
		System.out.println(calcFib (counter));
	}
	public static int calcFib (int counter)
	{
		int a = 0, b = 0, c = 1;
		while (a < 1000000)
		{
			a = b + c;
			if (a % 2 == 0) counter+=a;
			b = c + a;
			if (b % 2 == 0) counter+=b;
			c = a + b;
			if (c % 2 == 0) counter+=c;
		}
		return counter;
	}

}
