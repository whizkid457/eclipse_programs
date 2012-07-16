public class Number10 
{
	public static void main(String[] args) 
	{
		int divisor = 1;
		int number = 2;
		long sum = 0;
		while (number <= 2000000)
		{
			int count_div = 1;
			while(number != divisor)
			{
				if (number % divisor == 0)
				{
					count_div++;
				}
			    divisor++;
			}
			if (count_div == 2)
			{
				sum += number;
				System.out.println(number);
			}
			divisor = 1;
			number++;
		}
		System.out.println("The answer to Project Euler #10 is " + sum);
	}
}
