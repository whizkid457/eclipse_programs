public class PrimeArray
{
	public static void main(String[] args)
	{
		int number = 2;
		int[] primes = new int[1000];
		for (int i = 0; i < 1000; i++)
		{
			primes[i] = isPrime(number);
			number++;
		}
	}
	public static int isPrime(int number)
	{
		long count_div = 0, divisor = 1;
		while (true)
		{
			if (number % divisor == 0)
			{
				count_div++;
			}
			if (number == divisor)
			{
				if (count_div == 2)
				{
					System.out.println(number);
					return number;
				}
				divisor = 0;
				count_div = 0;
				return 0;
			}
			divisor++;
		}
	}

}
