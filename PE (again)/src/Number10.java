public class Number10
{
	public static void main(String[] args)
	{
		long number = 2, divisor = 1, count_div = 0;
		long sum = 0;
		while (number < 2000000)
		{
			while(number != divisor)
			{
				if (number % divisor == 0) count_div++;
				divisor++;
			}
			if (count_div == 1)
			{
				sum+=number; 
			}
			number++;
			count_div = 0;
			divisor = 1;
		}
		System.out.println(sum);
	}		
}
