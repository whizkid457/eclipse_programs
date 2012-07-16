public class Number3
{
	public static void main(String[] args)
	{
		long x = (13159) ;
		int a = 2;
		int max = 1;
		while (a < x)
		{
			if (x % a != 0)
			{
				a++;
			}
			if (x % a == 0)
			{
				int divisor = 2;
				while (a % divisor != 0)
				{	
					if (a == divisor + 1)
					{
						if (a >= max)
						{
							max = a;
						}
					}
					divisor++;
				}
				divisor = 2;
				a++;
			}
		}
		System.out.println("The answer to Project Euler #3 is " + max);
	}
}
	
