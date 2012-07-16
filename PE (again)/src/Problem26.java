import java.math.BigDecimal;
public class Problem26
{
	public static void main(String[] args)
	{
		double number = 2;
		/*for (BigDecimal bd = new BigDecimal("1"); bd.compareTo(new BigDecimal("1000")) < 1000; bd = bd.add(new BigDecimal("1")))
		{
			System.out.println((new BigDecimal("1")).divide(bd));
		}*/
		for (double d = 0; number < 1000; number++)
		{
			d = Math.pow(number, -1);
			System.out.println(d);
		}
	}
}