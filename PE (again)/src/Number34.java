public class Number34
{
	public static void main(String[] args)
	{
		int number = 145, sum = 0;
		while (number < 1000000)
		{
			int length = Integer.toString(number).length();
			if (length == 3)
			{
				if (three(number))
				{
					sum+=number;
					System.out.println(number);
				}
			}
			else if (length == 4)
			{
				if (four(number))
				{
					sum+=number;
					System.out.println(number);
				}
			}
			else if (length == 5)
			{
				if (five(number))
				{
					sum+=number;
					System.out.println(number);
				}
			}
			else if (length == 6)
			{
				if (six(number))
				{
					sum+=number;
					System.out.println(number);
				}
			}
			number++;
		}
		System.out.println("Answer: " + sum);
	}
	private static boolean six(int number)
	{
		int a = 1, b = 1, c = 1, d = 1, e = 1, f = 1;
		int one = Integer.parseInt(Integer.toString(number).substring(0, 1));
		for (a = 1; one != 0; one--) a*=one; 
		int two = Integer.parseInt(Integer.toString(number).substring(1, 2));
		for (b = 1; two != 0; two--) b*=two; 
		int three = Integer.parseInt(Integer.toString(number).substring(2, 3));
		for (c = 1; three != 0; three--) c*=three; 
		int four = Integer.parseInt(Integer.toString(number).substring(3, 4));
		for (d = 1; four != 0; four--) d*=four; 
		int five = Integer.parseInt(Integer.toString(number).substring(4, 5));
		for (e = 1; five != 0; five--) e*=five; 
		int six = Integer.parseInt(Integer.toString(number).substring(5, 6));
		for (f = 1; six != 0; six--) f*=six; 
		if (a + b + c + d + e + f == number) return true;
		else return false;
	}
	private static boolean five(int number)
	{
		int a = 1, b = 1, c = 1, d = 1, e = 1;
		int one = Integer.parseInt(Integer.toString(number).substring(0, 1));
		for (a = 1; one != 0; one--) a*=one; 
		int two = Integer.parseInt(Integer.toString(number).substring(1, 2));
		for (b = 1; two != 0; two--) b*=two; 
		int three = Integer.parseInt(Integer.toString(number).substring(2, 3));
		for (c = 1; three != 0; three--) c*=three; 
		int four = Integer.parseInt(Integer.toString(number).substring(3, 4));
		for (d = 1; four != 0; four--) d*=four; 
		int five = Integer.parseInt(Integer.toString(number).substring(4, 5));
		for (e = 1; five != 0; five--) e*=five; 
		if (a + b + c + d + e == number) return true;
		else return false;
	}
	private static boolean four(int number)
	{
		int a = 1, b = 1, c = 1, d = 1;
		int one = Integer.parseInt(Integer.toString(number).substring(0, 1));
		for (a = 1; one != 0; one--) a*=one; 
		int two = Integer.parseInt(Integer.toString(number).substring(1, 2));
		for (b = 1; two != 0; two--) b*=two; 
		int three = Integer.parseInt(Integer.toString(number).substring(2, 3));
		for (c = 1; three != 0; three--) c*=three; 
		int four = Integer.parseInt(Integer.toString(number).substring(3, 4));
		for (d = 1; four != 0; four--) d*=four; 
		if (a + b + c + d == number) return true;
		else return false;
	}
	private static boolean three(int number)
	{
		int a = 1, b = 1, c = 1;
		int one = Integer.parseInt(Integer.toString(number).substring(0, 1));
		for (a = 1; one != 0; one--) a*=one; 
		int two = Integer.parseInt(Integer.toString(number).substring(1, 2));
		for (b = 1; two != 0; two--) b*=two; 
		int three = Integer.parseInt(Integer.toString(number).substring(2, 3));
		for (c = 1; three != 0; three--) c*=three; 
		if (a + b + c == number) return true;
		else return false;
	}
}
