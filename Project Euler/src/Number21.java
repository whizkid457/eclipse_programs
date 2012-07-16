public class Number21
{
	public static void main(String[] args) 
	{
		int number = 20;
		int divisor = 2;
		int sum = 1;
		int sum1 = 1;
		System.out.println("6 and 6 are amicable pairs.");
		while (number < 10000)
		{
			while (number >= divisor)
			{
				if (number == divisor)
				{	
					divisor = 2;
					while (sum < 10000)
					{
						while (sum >= divisor)
						{
							if (sum == divisor)
							{
								if (sum1 == number)
								{
									System.out.println(number + " and " + sum + " are amicable pairs.");									
								}
								divisor = 1000000;
								number++;
								sum = 1;
								sum1 = 1;
								break;
							}	
							if (sum % divisor == 0)
							{
								sum1 = sum1 + divisor;
								divisor++;
							}
							divisor++;
						}
						break;
					}
				}	
				if (number % divisor == 0)
				{
					sum = sum + divisor;
				}
				divisor++;
			}
			number++;
			divisor = 2;
		}
	}
}


