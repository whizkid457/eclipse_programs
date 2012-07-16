public class Number12
{
	public static void main(String[] args)
	{
		long number = 1;
		int divisor = 1;
		int counter = 0;
		while (number < 10000)
		{
			long b = (long) (number * (number + 1))/2;
			System.out.print(b + ": ");
			
			while (b >= divisor)
			{
				if (b % divisor == 0)
				{
					System.out.print(divisor + " ");
					counter++;
					divisor++;
				}
				if (b % divisor != 0)
				{
					divisor++;
				}
				if (counter > 500)
				{
					System.out.println("The answer to Project Euler #12 is " + b);
					break;
				}		
				
			}
			System.out.println(" ");
			counter = 0;
			number++;
			divisor = 1;
		}
	}
}
