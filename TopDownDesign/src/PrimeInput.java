import java.util.*;
public class PrimeInput
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Which prime number would you like to see?");
		int number = input.nextInt();
		System.out.println(number + ": " + calcPrime(number));
	}
	public static long calcPrime(int number)
	{
		long count_div = 0, divisor = 1, counter = 0, prime = 2;;
		while (true)
		{
			if (prime % divisor == 0)
			{
				count_div++;
			}
			if (prime == divisor)
			{
				if (count_div == 2)
				{
					counter++;
					if (counter == number)
					{
						return prime;
					}
				}
				divisor = 0;
				count_div = 0;
				prime++;
			}
			divisor++;
		}
	}
}
