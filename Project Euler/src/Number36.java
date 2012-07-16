public class Number36
{
	public static void main(String[] args)
	{
		int number = 10;
		int sum = 0;
		for (number = 1; number <= 1000000; number++)
		{
			String palindrome = Integer.toString(number);
			if (palindrome.equals(new StringBuffer(String.valueOf(palindrome)).reverse().toString())) 
			{
				String answer = Integer.toBinaryString(number);
				if (answer.equals(new StringBuffer(String.valueOf(answer)).reverse().toString()))
				{
					System.out.println("Base 10: " + number + " Base 2: " + answer);
					sum = sum + number;
				}
			}
		}
		System.out.println("The answer to Project Euler #36 is " + sum);

	}
}
