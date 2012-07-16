import java.math.BigInteger;
public class FactorialLoop
{
	public static void main(String[] args)
	{
		int starting = 1;
		BigInteger factorial = new BigInteger("1");
		int multiplier = 1;
		int number = 1;
		for (number = 1;number <= 10; number++)
		{
			for (multiplier = starting; multiplier <= number; multiplier++)
			{
				BigInteger mult = BigInteger.valueOf(multiplier);
				factorial = factorial.multiply(mult);
			}
			System.out.println(number + "!" + " = " + factorial);
			starting = 1;
		}
	}
}
