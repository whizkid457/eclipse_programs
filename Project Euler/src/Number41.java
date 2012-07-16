public class Number41
{
	public static void main(String[] args)
	{
		int divisor = 2;
		int number = 1234;
		while (number <= 1000000)
		{
			while (number % divisor != 0)
			{	
				if (number == divisor + 1)
				{
					String number1 = Integer.toString(number);
					int x = number1.length();
					if (x == 4)
					{
						String first = number1.substring(0, 1);
						String second = number1.substring(1, 2);
						String third = number1.substring(2, 3);
						String fourth = number1.substring(3, 4);
						int n1 = Integer.parseInt(first);
						int n2 = Integer.parseInt(second);
						int n3 = Integer.parseInt(third);
						int n4 = Integer.parseInt(fourth);
						while (n1 != n2 && n1 != n3 && n1 != n4 && n2 != n3 && n2 != n4 && n3 != n4 && n1 <= 4 && n2 <= 4 && n3 <= 4 && n4 <= 4 && n1 > 0 && n2 > 0 && n3 > 0 && n4 > 0)
						{
							if (n1 == 1 || n2 == 1 || n3 == 1 || n4 == 1 && n1 == 2 || n2 == 2 || n3 == 2 || n4 == 2 && n1 == 3 || n2 == 3 || n3 == 3 || n4 == 3  && n1 == 4 || n2 == 4 || n3 == 4 || n4 == 4)
							{
								System.out.println(number);
								x = 0;
								break;
							}
						}
						number++;
					}
					if (x == 5)
					{
						String first = number1.substring(0, 1);
						String second = number1.substring(1, 2);
						String third = number1.substring(2, 3);
						String fourth = number1.substring(3, 4);
						String fifth = number1.substring(4, 5);
						int n1 = Integer.parseInt(first);
						int n2 = Integer.parseInt(second);
						int n3 = Integer.parseInt(third);
						int n4 = Integer.parseInt(fourth);
						int n5 = Integer.parseInt(fifth);
						while (n1 != n2 && n1 != n3 && n1 != n4 && n1 != n5 && n2 != n3 && n2 != n4 &&  n2 != n5 && n3 != n4 && n3 != n5 && n4 != n5 && n1 <= 5 && n2 <= 5 && n3 <= 5 && n4 <= 5 && n5 <= 5 && n1 > 0 && n2 > 0 && n3 > 0 && n4 > 0 && n5 > 0)
						{
							if (n1 == 1 || n2 == 1 || n3 == 1 || n4 == 1 || n5 == 1 && n1 == 2 || n2 == 2 || n3 == 2 || n4 == 2 || n5 == 2 && n1 == 3 || n2 == 3 || n3 == 3 || n4 == 3 || n5 == 3 && n1 == 4 || n2 == 4 || n3 == 4 || n4 == 4 || n5 == 4 && n1 == 5 || n2 == 5 || n3 == 5 || n4 == 5 || n5 == 5)
							{
								System.out.println(number);
								x = 0;
								break;
							}
						}
						number++;
					}
					if (x == 6)
					{
						String first = number1.substring(0, 1);
						String second = number1.substring(1, 2);
						String third = number1.substring(2, 3);
						String fourth = number1.substring(3, 4);
						String fifth = number1.substring(4, 5);
						String sixth = number1.substring(5, 6);
						int n1 = Integer.parseInt(first);
						int n2 = Integer.parseInt(second);
						int n3 = Integer.parseInt(third);
						int n4 = Integer.parseInt(fourth);
						int n5 = Integer.parseInt(fifth);
						int n6 = Integer.parseInt(sixth);
						while (n1 != n2 && n1 != n3 && n1 != n4 && n1 != n5 && n1 != n6 && n2 != n3 && n2 != n4 && n2 != n5 && n2 != n6 && n3 != n4 && n3 != n5 && n3 != n6 && n4 != n5 && n4 != n6 && n5 != n6 && n1 <= 6 && n2 <= 6 && n3 <= 6 && n4 <= 6 && n5 <= 6 && n6 <= 6 && n1 > 0 && n2 > 0 && n3 > 0 && n4 > 0 && n5 > 0 && n6 > 0)
						{
							if (n1 == 1 || n2 == 1 || n3 == 1 || n4 == 1 || n5 == 1 || n6 == 1 && n1 == 2 || n2 == 2 || n3 == 2 || n4 == 2 || n5 == 2 || n6 == 2 && n1 == 3 || n2 == 3 || n3 == 3 || n4 == 3 || n5 == 3 || n6 == 3 && n1 == 4 || n2 == 4 || n3 == 4 || n4 == 4 || n5 == 4 || n6 == 4 && n1 == 5 || n2 == 5 || n3 == 5 || n4 == 5 || n5 == 5 || n6 == 5 && n1 == 6 || n2 == 6 || n3 == 6 || n4 == 6 || n5 == 6 || n6 == 6 )
							{
								System.out.println(number);
								x = 0;
								break;
							}
						}
						number++;
					}
					if (x == 7)
					{
						String first = number1.substring(0, 1);
						String second = number1.substring(1, 2);
						String third = number1.substring(2, 3);
						String fourth = number1.substring(3, 4);
						String fifth = number1.substring(4, 5);
						String sixth = number1.substring(5, 6);
						String seventh = number1.substring(6, 7);
						int n1 = Integer.parseInt(first);
						int n2 = Integer.parseInt(second);
						int n3 = Integer.parseInt(third);
						int n4 = Integer.parseInt(fourth);
						int n5 = Integer.parseInt(fifth);
						int n6 = Integer.parseInt(sixth);
						int n7 = Integer.parseInt(seventh);
						while (n1 != n2 && n1 != n3 && n1 != n4 && n1 != n5 && n1 != n6 && n1 != n7 && n2 != n3 && n2 != n4 && n2 != n5 && n2 != n6 && n2 != n7 && n3 != n4 && n3 != n5 && n3 != n6 && n3 != n7 && n4 != n5 && n4 != n6 && n4 != n7 && n5 != n6 && n5 != n7 && n6 != n7 && n1 <= 7 && n2 <= 7 && n3 <= 7 && n4 <= 7 && n5 <= 7 && n6 <= 7 && n7 <= 7 && n1 > 0 && n2 > 0 && n3 > 0 && n4 > 0 && n5 > 0 && n6 > 0 && n7 > 0)
						{
							if (n1 == 1 || n2 == 1 || n3 == 1 || n4 == 1 || n5 == 1 || n6 == 1 || n7 == 1 && n1 == 2 || n2 == 2 || n3 == 2 || n4 == 2 || n5 == 2 || n6 == 2 || n7 == 2 && n1 == 3 || n2 == 3 || n3 == 3 || n4 == 3 || n5 == 3 || n6 == 3 || n7 == 3 && n1 == 4 || n2 == 4 || n3 == 4 || n4 == 4 || n5 == 4 || n6 == 4 || n7 == 4 && n1 == 5 || n2 == 5 || n3 == 5 || n4 == 5 || n5 == 5 || n6 == 5 || n7 == 5 && n1 == 6 || n2 == 6 || n3 == 6 || n4 == 6 || n5 == 6 || n6 == 6 || n7 == 6 && n1 == 7 || n2 == 7 || n3 == 7 || n4 == 7 || n5 == 7 || n6 == 7 || n7 == 7)
							{
								System.out.println(number);
								x = 0;
								break;
							}
						}
						number++;
					}
				}
				divisor++;
			}
			divisor = 2;
			number++;
		}
	}
}
 