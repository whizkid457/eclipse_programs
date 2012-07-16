public class Number30
{
	public static void main(String[] args) 
	{
		int number = 1000, sum = 0;
		while (number < 1000000)
		{
			String num = Integer.toString(number);
			int length = num.length();
			if (length == 2) 
			{
				if (two (num, number) != 0)
				{
					System.out.println(number); sum+=number;
				}
				number++;
			}
			else if (length == 3)
			{
				if (three (num, number) != 0)
				{
					System.out.println(number); sum+=number;
				}
				number++;
			}
			else if (length == 4) 
			{
				if (four (num, number) != 0)
				{
					System.out.println(number); sum+=number;
				}
				number++;
			}
			else if (length == 5)
			{
				if (five (num, number) != 0)
				{
					System.out.println(number); sum+=number;
				}
				number++;
			}
			else if (length == 6)
			{
				if (six (num, number) != 0)
				{
					System.out.println(number); sum+=number;
				}
				number++;
			}
		}
		System.out.println("answer: " + sum);
	}
	public static int two (String num, int number)
	{
		int one = Integer.parseInt(num.substring(0, 1));
		int two = Integer.parseInt(num.substring(1, 2));
		if (Math.pow(one, 5) + Math.pow(two, 5) == number) return number;
		else return 0;
	}
	public static int three (String num, int number)
	{
		int one = Integer.parseInt(num.substring(0, 1));
		int two = Integer.parseInt(num.substring(1, 2));
		int three = Integer.parseInt(num.substring(2, 3));
		if (Math.pow(one, 5) + Math.pow(two, 5) + Math.pow(three, 5) == number) return number;
		else return 0;
		
	}
	public static int four (String num, int number)
	{
		int one = Integer.parseInt(num.substring(0, 1));
		int two = Integer.parseInt(num.substring(1, 2));
		int three = Integer.parseInt(num.substring(2, 3));
		int four = Integer.parseInt(num.substring(3, 4));
		if (Math.pow(one, 5) + Math.pow(two, 5) + Math.pow(three, 5) + Math.pow(four, 5) == number) return number;
		else return 0;
		
	}
	public static int five (String num, int number)
	{
		int one = Integer.parseInt(num.substring(0, 1));
		int two = Integer.parseInt(num.substring(1, 2));
		int three = Integer.parseInt(num.substring(2, 3));
		int four = Integer.parseInt(num.substring(3, 4));
		int five = Integer.parseInt(num.substring(4, 5));
		if (Math.pow(one, 5) + Math.pow(two, 5) + Math.pow(three, 5) + Math.pow(four, 5) + Math.pow(five, 5) == number) return number;
		else return 0;
	}
	public static int six (String num, int number)
	{
		int one = Integer.parseInt(num.substring(0, 1));
		int two = Integer.parseInt(num.substring(1, 2));
		int three = Integer.parseInt(num.substring(2, 3));
		int four = Integer.parseInt(num.substring(3, 4));
		int five = Integer.parseInt(num.substring(4, 5));
		int six = Integer.parseInt(num.substring(5, 6));
		if (Math.pow(one, 5) + Math.pow(two, 5)  + Math.pow(three, 5) + Math.pow(four, 5)  + Math.pow(five, 5) + Math.pow(six, 5) == number) return number;
		else return 0;
	}
}
