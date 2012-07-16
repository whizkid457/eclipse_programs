public class Number3int
{
	public static void main(String[] args)
	{
		long number = 600851475143L;
		int divisor = 2;
		while (divisor < number/2)
		{
			if (number % divisor == 0)
			{
				if (checkPrime (divisor) != 0) 
				{
					System.out.println(divisor);
				}
					
			}
			divisor++;
		}
	}
	public static int checkPrime (int divisor)
	{
		int div = 2;
		while (div != divisor)
		{
			if (divisor % div != 0) div++;
			else return 0;
		}
		return divisor;
	}
}
