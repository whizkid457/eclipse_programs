public class Number2 
{

	public static void main(String[] args) 
	{
		int a = 1;
		int b = 1;
		int c = 2;
		int x = 0;
		int sum = 0;
		while (c < 40000000 && a < 4000000 && b < 4000000)
		{
			a = b + c;
			b = c + a;
			c = a + b;
			if (c == 14930352)
			{
				break;
			}
			if (a % 2 == 0 && a % 2 != 1)
			{
				sum = sum + x;
			}	
				x = b;
			if (b % 2 == 0 && b % 2 != 1)
			{
				sum = sum + x;
			}
				x = c;
			if (c % 2 == 0 && c % 2 != 1)
			{
				sum = sum + x;
			}
				x = a;	
		}
		System.out.print("The answer to Project Euler #2 is ");
	    System.out.print(sum + 2);
	}

}

