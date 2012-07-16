import java.util.Arrays;
public class Number95
{
	public static void main(String[] args) 
	{
		int a = 24, sum_of_div = 0, divisor = 1;
		while (a < 100)
		{
			if (a == divisor)
			{
				System.out.print(a + ": ");
				a = sumOfNumber1(sum_of_div);
				System.out.print(a + " ");
				divisor = 0;
				sum_of_div = 0;
			}
			else if (a % divisor == 0) sum_of_div+=divisor;
			divisor++;
		}
		/*int number = 28, sum_of_num_div = 0, divisor = 1, originalNumber = 29;
		int[] chain = new int[100];
		Arrays.fill(chain, 0);
		while (originalNumber < 10000)
		{
			chain[0] = number;
			System.out.print(number + " ");
			if (number == divisor)
			{
				number = sumOfNumber1 (sum_of_num_div);
				if (chain[1] != 0)
				{
					for (int i = 2; true; i++)
					{
						if (chain[0] == chain[i])
						{
							Arrays.fill(chain, 0);
							originalNumber++;
							number = originalNumber;
							resetValues(divisor, sum_of_num_div);
						}
						if (chain[i] == 0)
						{
							number = chain[i - 1];
							divisor = 0;
							break;
						}
					}
				}
				else
				{
					chain[1] = number;
					resetValues(divisor, sum_of_num_div);
				}
			}
			else if (number % divisor == 0) sum_of_num_div+=divisor;
			divisor++;
		}
		int a = 5, b = 0, sum_of_div = 0, sum_of_div1 = 0, divisor = 1, count_Chain = 2, max = 0, count_Loop = 1, orig_Num = 0;
		int[] chain = new int[1000];
		Arrays.fill(chain, 0);
		while (a < 10000)
		{
			if (count_Loop == 1) orig_Num = a;
			chain[0] = a;
			if (a == divisor)
			{
				divisor = 1;
				b = sum_of_div;
				chain[1] = sum_of_div1 (sum_of_div1, b, divisor);
				int i = 1;
				while (chain[i] != 0)
				{
					if (chain[0] == chain[i]) 
					{
						if (count_Chain > max)
						{
							max = count_Chain;
							count_Chain = 2;
							Arrays.fill(chain, 0);
							a++;
							count_Loop = 1;
							sum_of_div = 0;
							break;
						}
					}
					i++;
				}
				if (sum_of_div != 0)
				{
					count_Loop++;
					a = chain[i-1];
				}
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
		}*/
	}	
	public static int sumOfNumber1(int sum_of_div)
	{
		int divisor = 1, sum = 0;
		while (sum_of_div != divisor)
		{
			if (sum_of_div % divisor == 0) sum+=divisor;
			divisor++;
		}
		return sum;
	}
	public static void resetValues(int divisor, int sum_of_num_div)
	{
		divisor = 1;
		sum_of_num_div = 0;
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
