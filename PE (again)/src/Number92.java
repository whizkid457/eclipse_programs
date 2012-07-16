public class Number92
{
	public static void main(String[] args)
	{
		int number = 5, counter = 0, sum = 0;
		while (number < 1000000)
		{
			int num1 = number;
			System.out.print(number + ": ");
			while (sum != 1)
			{
				while (num1 >= 1)
				{
					int digit = num1 % 10;
					sum+=digit*digit;
					num1/=10;
				}
				System.out.println(sum + " ");
				num1 = sum;
				if (sum == 89)
				{
					sum = 0;
					break;
				}
			}
			number++;
		}

	}

}
