public class Number5 
{
	public static void main(String[] args)
	{
		int number = 1;
		int divisor = 1;
		long num = 10000000000L;
		while (number < num)
		{	
			while (number % divisor == 0) 
			{
				divisor++;
				if (divisor == 20 && number % divisor == 0)
				{
					System.out.println(number);
					System.exit(0);
				}
				if (number % divisor != 0) break;
			}
			number++;
			divisor = 1;
		}
	}
}
