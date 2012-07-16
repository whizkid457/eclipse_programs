public class Number34
{
	public static void main(String[] args)
	{
		int number = 100,sum = 0,a = 0,b = 0,c = 0,d = 0,e = 0,answer = 0;
		while (number <= 50000)
		{
			String power = Integer.toString(number);
			int x = power.length();
			if (x == 3)
			{
				String first = power.substring(0,1);
				String second = power.substring(1,2);
				String third = power.substring(2,3);
				int n1 = Integer.parseInt(first);
				int n2 = Integer.parseInt(second);
				int n3 = Integer.parseInt(third);
				while (n1 != 0)
				{
					a *= n1;
					n1--;
				}
				while (n2 != 0)
				{
					b *= n2;
					n2--;
				}
				while (n3 != 0)
				{
					c *= n3;
					n3--;
				}
				sum = a + b + c;
			}
			if (x == 4)
			{
				String first = power.substring(0,1);
				String second = power.substring(1,2);
				String third = power.substring(2,3);
				String fourth = power.substring(3,4);
				int n1 = Integer.parseInt(first);
				int n2 = Integer.parseInt(second);
				int n3 = Integer.parseInt(third);
				int n4 = Integer.parseInt(fourth);
				while (n1 != 0)
				{
					a *= n1;
					n1--;
				}
				while (n2 != 0)
				{
					b *= n2;
					n2--;
				}
				while (n3 != 0)
				{
					c *= n3;
					n3--;
				}
				while (n4 != 0)
				{
					d *= n4;
					n4--;
				}
				sum = a + b + c + d;
			}
			if (x == 5)
			{
				String first = power.substring(0,1);
				String second = power.substring(1,2);
				String third = power.substring(2,3);
				String fourth = power.substring(3,4);
				String fifth = power.substring(4,5);
				int n1 = Integer.parseInt(first);
				int n2 = Integer.parseInt(second);
				int n3 = Integer.parseInt(third);
				int n4 = Integer.parseInt(fourth);
				int n5 = Integer.parseInt(fifth);
				while (n1 != 0)
				{
					a *= n1;
					n1--;
				}
				while (n2 != 0)
				{
					b *= n2;
					n2--;
				}
				while (n3 != 0)
				{
					c *= n3;
					n3--;
				}
				while (n4 != 0)
				{
					d *= n4;
					n4--;
				}
				while (n5 != 0)
				{
					e *= n5;
					n5--;
				}
				sum = a + b + c + d + e;
			}
			if (sum == number)
			{
				System.out.println(number);
				answer += number;
			}
			number++;
			a = 1;
			b = 1;
			c = 1;
			d = 1;
			e = 1;	
		}
		System.out.println("The answer to Project Euler #34 is " + answer);

	}

}
