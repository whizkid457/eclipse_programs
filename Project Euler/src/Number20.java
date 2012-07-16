import java.math.BigInteger;
public class Number20
{
	public static void main(String[] args)
	{
		int starting = 1;
		BigInteger factorial = new BigInteger("1");
		int multiplier = 1;
		int number = 100;
		for (multiplier = starting; multiplier <= number; multiplier++)
		{
			BigInteger mult = BigInteger.valueOf(multiplier);
			factorial = factorial.multiply(mult);
		}
		System.out.println(number + "!" + " = " + factorial);
		
		BigInteger sum = new BigInteger("0");
		int counter = 0;
		BigInteger one = new BigInteger("1");
		while(factorial.compareTo(one)>=1)
		{
			BigInteger reminder = (factorial.remainder(new BigInteger("10"))); 
			sum = sum.add(reminder);
			counter++;
			factorial = factorial.divide(new BigInteger("10"));
		}
		System.out.println("The sum of the digits in 100! is " + sum);
		System.out.println("100! is " + counter + " digits long");
	}
}	


	


