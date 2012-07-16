public class Number7
{
	public static void main(String[] args)
	{
		int number = 2, div = 2, counter = 0;
		while (true)
		{
			if (checkPrime (number, div) != 0)
			{
				counter++;
				if (counter == 10001)
				{
					System.out.println(number);
					System.exit(0);
				}
			}
			number++;
		}
		
		
	}
	public static int checkPrime (int number, int div)
	{
		div = 2;
		while (div != number)
		{
			if (number % div != 0) div++;
			else return 0;
		}
		return number;
	}

}
