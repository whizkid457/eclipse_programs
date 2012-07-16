import java.math.BigInteger;
public class Number80
{
	public static void main(String[] args)
	{
		int number = 2;
		int sum = 0;
		int remainder = 0;
		int counter = 0;
		int answer = 0;
		while(number < 100)
		{
			if (number == 4 || number == 9 || number == 16 || number == 25 || number == 36 || number == 49 || number == 64 || number == 81)
			{
				number++;
			}
			double sqrt = Math.sqrt(number);
			long integralvalue = (long) sqrt;
			double decimal = sqrt - integralvalue;
			System.out.println(number + ": " + decimal);
			while(decimal >= 1)
			{
				remainder = (int) (decimal % 10);
				sum = sum + remainder;
				counter++;
				decimal = decimal / 10;
				if (counter > 0)
				{
					System.out.println(decimal + ": " + sum);
					answer = answer + sum;
					sum = 0;
					counter = 0;
					break;
				}
			}
			number++;
		}
		System.out.println(answer);
	}

}
