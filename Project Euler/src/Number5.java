public class Number5 
{
	public static void main(String[] args) 
	{
		int x = 1;
		int a = 20;
		long b = (1000000000L); 
		while (x < b)
		{
			while (a >= 1)
			{
				if (x % a == 0)
				{
					a--;
				}
				if (x % a != 0)
				{
					x++;
					a = 20;
				}
				if (a == 1)
				{
					System.out.println("The answer to Project Euler #5 is " + x);
					break;					
				}
				break;
			}
		}
	}
}

	
