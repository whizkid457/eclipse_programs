package baseConverterClass;
public class BaseConverter
{
	private int number;
	public BaseConverter(int number)
	{
		this.number = number;
	}
	public int toBase10(int startingbase)
	{
		int i = 0, digit = 0, place = 0, sum = 0;
		while (number >= 1)
		{
			place = number % 10;
			digit = place * (int) Math.pow(startingbase, i); 
			sum += digit;
			number /= 10;
			i++;
		}
		number = sum;
		return sum;
	}
	public StringBuffer toBaseX(int endingBase)
	{
		String ans = "";
		while (number >= 1)
		{
			int remainder = number % endingBase;
			ans += remainder + "";
			number /= endingBase;	
		}
		return new StringBuffer(ans).reverse();
	}
}
