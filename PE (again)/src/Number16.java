import java.math.BigInteger;
public abstract class Number16
{
	public static void main(String[] args)
	{
		BigInteger TWO = new BigInteger ("2");
		BigInteger one = new BigInteger("1");
		BigInteger answer = TWO.pow(1000);
		BigInteger sum = new BigInteger("1");
		int counter = 0;
		while(answer.compareTo(one) >= 1)
		{
			BigInteger remainder = (answer.remainder(new BigInteger("10"))); 
			sum = sum.add(remainder);
			counter++;
			answer = answer.divide(new BigInteger("10"));
		}
		System.out.println("The sum of the digits is " + sum);
		System.out.println("This number is " + counter + " digits long.");
		
		

	}

}
