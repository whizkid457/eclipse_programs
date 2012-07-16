public class Number45
{
	public static void main(String[] args)
	{
		int number = 166;
		int number1 = 144;
		while (number <= 100000000 && number1 <= 100000000)
		{
			int a = (int) ((number * ((3 * number) - 1) * 0.5));
			int b = (int) ((number1 * ((2 * number1) - 1)));
			if (a == b)
			{
				System.out.println("The answer to Project Euler #45 is " + a);
				break;
			}
			if (a != b)
			{
				number1++;
				a = 0;
				b = 0;
			}
			if (number1 == 100000000)
			{
				number1 = 144;
				number++;
			}
		}
	}
}	

