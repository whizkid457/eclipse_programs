public class Number179
{
	public static void main(String[] args)
	{
		int number = 4;
		int divisor = 1;
		int counter = 0;
		int counter1 = 0;
		int counter2 = 1;
		while(number <= 10000000)
		{
			if(number % divisor == 0)
			{
				counter++;
				divisor++;
			}
			if(number % divisor != 0)
			{
				divisor++;
			}
			if(number == divisor)
			{
				number++;
				divisor = 1;
				while (number <= 10000000)
				{
					if(number % divisor == 0)
					{
						counter1++;
						divisor++;
					}
					if(number % divisor != 0)
					{
						divisor++;
					}
					if(number == divisor)
					{
						if (counter1 == counter)
						{
							counter2++;
							counter1 = 0;
							counter = 0;
							divisor = 1;
							System.out.println((number - 1) + " & " + number);
							break;
						}
						if (counter1 != counter)
						{
							counter1 = 0;
							counter = 0;
							divisor = 1;
							break;
						}	
					}
				}
			}
		}
		System.out.println(counter2);
	}
}
