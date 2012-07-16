public class Number9
{
	public static void main(String[] args)
	{
		for (int a = 1, b = 2, c = 3; c < 1000; a++)
		{
			if (a == 1000)
			{	
				a = 1;
				b++;
			}
			if (b == 1000)
			{
				b = 1;
				c++;
			}
			if (a + b + c == 1000) checkifTriple(a, b, c); 
		}
	}
	public static void checkifTriple (int a, int b, int c)
	{
		if (Math.pow(a,2) + Math.pow(b, 2) == Math.pow(c, 2))
		{
			System.out.println("Answer: " + a * b * c); 
			System.exit(0);
		}
	}

}
