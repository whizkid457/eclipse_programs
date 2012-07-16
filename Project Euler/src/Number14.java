public class Number14
{
	public static void main(String[] args)
	{		
		int counter = 1;
		int number = 0;
		int max = 0;	
		int maxnum = 0;
		int starting = 1;
		while (starting <= 1000000)
		{
			number = starting;
			System.out.print(number + ": ");
			while (number >= 1)
			{
				if (number % 2 == 0)
				{
					number = number/2;
					counter++;
					System.out.print(number + " ");
				}
				if (number == 1)
				{
					break;
				}
				if (number % 2 != 0)
				{
					number = (3 * number) + 1;
					counter++;
					System.out.print(number + " ");
				}
			}
			System.out.println(" ");
			if (counter > max)
			{
				max = counter;
				maxnum = starting;
			}
			counter = 1;
			starting++;	
		}
		System.out.println("The answer to Project Euler #14 is " + maxnum);
	}
}
