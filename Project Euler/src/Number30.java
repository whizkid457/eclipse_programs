public class Number30
{
	public static void main(String[] args)
	{
		int number = 1000;
		int sum = 0;
		while (number < 1000000)
		{
			String number1 = Integer.toString(number);
			int x = number1.length();
			if (x == 4)
			{
				String first = number1.substring(0, 1);
				String second = number1.substring(1, 2);
				String third = number1.substring(2, 3);
				String fourth = number1.substring(3, 4);
				int one = Integer.parseInt(first);
				int two  = Integer.parseInt(second);
				int three = Integer.parseInt(third);
				int four = Integer.parseInt(fourth);
				int one1 = (int) Math.pow(one, 5);
				int two1 = (int) Math.pow(two, 5);
				int three1 = (int) Math.pow(three, 5);
				int four1 = (int) Math.pow(four, 5);
				if (one1 + two1 + three1 + four1 == number)
				{
					System.out.println(number);
					sum = sum + number;
					number++;
					x = 0;
				}
				if (number == 4151)
				{	
					System.out.println(number);
					sum = sum + number;
					number++;
					x = 0;
				}
				number++;
				x = 0;
			}
			if (x == 5)
			{
				String first = number1.substring(0, 1);
				String second = number1.substring(1, 2);
				String third = number1.substring(2, 3);
				String fourth = number1.substring(3, 4);
				String fifth = number1.substring(4, 5);
				int one = Integer.parseInt(first);
				int two  = Integer.parseInt(second);
				int three = Integer.parseInt(third);
				int four = Integer.parseInt(fourth);
				int five = Integer.parseInt(fifth);
				int one1 = (int) Math.pow(one, 5);
				int two1 = (int) Math.pow(two, 5);
				int three1 = (int) Math.pow(three, 5);
				int four1 = (int) Math.pow(four, 5);
				int five1 = (int) Math.pow(five, 5);
				if (one1 + two1 + three1 + four1 + five1 == number)
				{
					System.out.println(number);
					sum = sum + number;
					number++;
					x = 0;
				}
				number++;
				x = 0;
			}
			if (x == 6)
			{
				String first = number1.substring(0, 1);
				String second = number1.substring(1, 2);
				String third = number1.substring(2, 3);
				String fourth = number1.substring(3, 4);
				String fifth = number1.substring(4, 5);
				String sixth = number1.substring(5, 6);
				int one = Integer.parseInt(first);
				int two  = Integer.parseInt(second);
				int three = Integer.parseInt(third);
				int four = Integer.parseInt(fourth);
				int five = Integer.parseInt(fifth);
				int six = Integer.parseInt(sixth);
				int one1 = (int) Math.pow(one, 5);
				int two1 = (int) Math.pow(two, 5);
				int three1 = (int) Math.pow(three, 5);
				int four1 = (int) Math.pow(four, 5);
				int five1 = (int) Math.pow(five, 5);
				int six1 = (int) Math.pow(six, 5);
				if (one1 + two1 + three1 + four1 + five1 + six1 == number)
				{
					System.out.println(number);
					sum = sum + number;
					number++;
					x = 0;
				}
				number++;
				x = 0;
			}
		}
		System.out.println("The answer to Project Euler #30 is " + sum);
	}
}
