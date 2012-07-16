import java.util.ArrayList;
public class Number23
{
	public static void main(String[] args)
	{
		ArrayList<Integer> abundantNumbers = new ArrayList<Integer>();
		for (int number = 12; number <= 28123; number++)
		{
			if (checkAbundant(number)) abundantNumbers.add(number);
		}
		int number = 24, a = 0, b = 0, sum = 0;
		for (int i = 0; i < abundantNumbers.size(); i++)
		{
			while (abundantNumbers.get(a) + abundantNumbers.get(b) <= number)
			{
				if (abundantNumbers.get(a) + abundantNumbers.get(b) == number) break;
				
			}
			
		}
	}
	
	public static boolean checkAbundant(int number)
	{
		int sum = 0;
		for (int divisor = 1; divisor != number; divisor++)
		{
			if (number % divisor == 0) sum+=divisor;
		}
		if (number < sum) return true;
		else return false;
	}

}
