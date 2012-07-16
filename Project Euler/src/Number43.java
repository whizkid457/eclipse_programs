import java.util.*;
public class Number43
{
	public static void main(String[] args)
	{
		int number = 2;
		isPrime(number);
		System.out.println(number);
		int[] primes = new int[6];
		//ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int i = 0; i <= 6; i++)
	    {
			primes[i] = isPrime(number);
	    }
		System.out.println(primes);
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
				number++;
			}
			divisor++;
		}
	}

}
