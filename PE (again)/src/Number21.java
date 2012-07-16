public class Number21
{
	public static void main(String[] args)
	{
		int a = 5, b = 0, sum_of_div = 0, sum_of_div1 = 0, sum_of_pairs = 0, divisor = 1, nextnum = 0;
		while (a < 10000)
		{
			if (a == nextnum) a++;
			else if (a == divisor)
			{
				divisor = 1;
				b = sum_of_div;
				if(a == (sum_of_div1 (sum_of_div1, b, divisor)))
				{
					if (a == sum_of_div) 
					{
						
					}
					else
					{	
						sum_of_pairs+=a + sum_of_div;
						System.out.println(a + " and " + b);	
						nextnum = sum_of_div;
					}
				}
				a++;
				sum_of_div = 0;
				sum_of_div1 = 0;
				divisor = 1;
			}
			else if (a % divisor == 0)
			{
				sum_of_div+=divisor;
				divisor++;
			}
			else divisor++;
		}
		System.out.println("answer: " + sum_of_pairs);
	}
	public static int sum_of_div1 (int sum_of_div1, int b, int divisor)
	{
		while (true)
		{
			if (b == divisor) return sum_of_div1;
			if (b % divisor == 0) sum_of_div1+=divisor;
			divisor++;
		}
	}
}
