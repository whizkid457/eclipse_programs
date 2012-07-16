public class Number1 
{
	public static void main(String[] args)
	{
		int x = 0;
		int sum = 0;
		while (x < 1000)
		{
			if (x % 3 == 0 && x % 5 != 0)
			{	
				sum+=x;
			}
			if (x % 5 == 0 && x % 3 != 0)
			{	
				sum+=x;
			}
			if (x % 3 == 0 && x % 5 == 0)
			{	
				sum+=x;
			}
				x++;
		}			
		System.out.print("The answer to Project Euler Question #1 is " + sum);
	}
}
