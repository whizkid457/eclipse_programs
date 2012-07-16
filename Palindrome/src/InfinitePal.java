import java.math.BigInteger;
public class InfinitePal
{
	public static void main(String[] args)
	{
		BigInteger number = new BigInteger("0");
		while (number.compareTo(new BigInteger("999999999999999999999999999999999999999999"))<=99)
		{
			String palindrome = number.toString();
			if (palindrome.equals(new StringBuffer(String.valueOf(palindrome)).reverse().toString())) 
			{
				System.out.println(palindrome);
			}
			number = number.add(new BigInteger("1"));
		}
	}

}
