public class Number27
{
	public static void main(String[] args)
	{
		int a = -999;
		int b = -999;
		int n = 0;
		int divisor = 2;
		int counter = 0;
		int max = 0;
		while (a <= 1000 && b <= 1000)
		{
			int c = (n * n) + (a * n) + b;
			while (c % divisor != 0)
			{	
				if (Math.abs(c) == divisor + 1)
				{
					n++;
					counter++;
					divisor = 2;
				}
				c = (n * n) + (a * n) + b;
				divisor++;
			}
			divisor = 2;
			if (counter > max)
			{
				System.out.println("A is " + a + "; B is " + b + "; These variables produced " + counter + " consecutive primes.");
				if (counter > 70)
				{
					System.out.println("The answer to Project Euler is " + (a * b));
					break;
				}
				max = counter;
			}
			if (b == 1000)
			{
				a++;
				b = -999;
			}
			b++;
			n = 0;
			counter = 0;
			if (b == -2)
			{
				b = 3;
			}
		}
	}
}
