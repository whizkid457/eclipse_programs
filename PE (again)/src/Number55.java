import java.math.BigInteger;
public class Number55
{
	public static void main(String[] args) 
	{
		int counter = 0, count_loop = 1, count_Lychrel = 0; 
		BigInteger number = new BigInteger("190");
		BigInteger orig_num = new BigInteger("0");
		int loop = 0;
		while (loop <= 10000)
		{
			if (count_loop == 1) orig_num = number;
			BigInteger iteration = number.add(new BigInteger(new StringBuffer(String.valueOf(number)).reverse().toString()));
			if (checkPal(iteration))
			{
				count_loop = 1;
				counter = 0;
				number = orig_num;
				number = number.add(new BigInteger("1"));
			}
			else
			{
				counter++;
				number = iteration;
				count_loop++;
			}
			if (counter == 50)
			{
				System.out.println(orig_num + " is a lychrel number.");
				count_Lychrel++;
				count_loop = 1;
				counter = 0;
				number = orig_num;
				number = number.add(new BigInteger("1"));
			}
			loop = orig_num.intValue();
		}
		System.out.println("answer: " + count_Lychrel);
	}
	public static boolean checkPal(BigInteger iteration)
	{
		if (iteration.toString().equals(new StringBuffer(iteration.toString()).reverse().toString())) return true;
		else return false;
	}
}
