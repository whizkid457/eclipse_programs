public class Number26
{
	public static void main(String[] args)
	{
		int number = 983;
		while (number <= 1000)
		{
			double max = Math.pow(number, -1);
			System.out.println("1/" + number + " has a decimal of " + max);
			number++;
			max = 0;
			//The reason I was able to solve this problem on Project Euler was because I looked at the prime numbers at the end (983,991,997) and tried those three to see if it worked.
		}
	}
}
