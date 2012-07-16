public class Number9
{
	public static void main(String[] args)
	{
		int a = 1;
		int b = 1;
		int c = 2;
		while (a <= 1000 && b <= 1000 && c <= 1000)
		{
			if (b == 1000)
			{
				a++;
				b = 1;
				c = 1;
			}
			if (c == 1000)
			{
				b++;
				c = 1;
			}
			if ((a * a) + (b * b) == (c * c) && a + b + c == 1000)
			{
				System.out.println("The answer to Project Euler #9 is " + a * b * c);
				break;
			}
			if (((a * a) + (b * b) != (c * c) || a + b + c != 1000))
			{
				c++;
			}
					
		}
	}
}
