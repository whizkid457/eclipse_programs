public class Number7 
{
	public static void main(String[] args)
	{
		int divisor = 2;
		int number = 2;
		int counter = 1;
		while (number <= 1000000)
		{
			while (number % divisor != 0)
			{	
				if (number == divisor + 1)
				{
					counter++;
					if (counter == 10001)
					{
						System.out.println("The answer to Project Euler #7 is " + number);
						break;
					}
				}
				divisor++;
			}
			divisor = 2;
			number++;
			if (counter == 10001)
			{
				break;
			}
		}

	}

}
