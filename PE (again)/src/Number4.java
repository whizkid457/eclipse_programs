public class Number4
{
	public static void main(String[] args)
	{
		int a = 100;
		int b = 100;
		for (a = 100; b <= 1000 && a  <= 999; b++)
		{
			if (b == 1000)
			{
				a++;
				b = 100;
			}
			int p = a * b;
			String palindrome = Integer.toString(p);
			if (palindrome.equals(new StringBuffer(String.valueOf(palindrome)).reverse().toString())) 
			{
				System.out.println(palindrome + " is a palindrome number; " + a + " x " + b);
			}	
		}
	}
}
