public class PrimeNumbers
{
	public static void main(String[] args)
	{
		int divisor = 1;
		int number = 2;
		int count_div = 0;
		long a = 100;
		int counter = 1;
		while (number <= a)
		{
			if (number % divisor == 0)
			{
				count_div++;
			}
			if (number == divisor)
			{
				if (count_div == 2)
				{
					System.out.println(counter + ": " + number);
					counter++;
				}
				divisor = 0;
				count_div = 0;
				number++;
			}
			divisor++;
		}
			
	}
}

	
