public class Number6
{
	public static void main(String[] args) 
	{
		int x = 0;
		int sum = 0;
		int sum1 = 0;
		while (x <= 100)
		{
			sum = sum + (x * x);
			x++;
		}
		x = 0;
		while (x <= 100)
		{
			sum1 = sum1 + x;
			x++;
		}
			
		System.out.println("The answer to Project Euler #6 is " + ((sum1 * sum1) - sum));	
	}

}
