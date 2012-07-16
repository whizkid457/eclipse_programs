public class Number92
{
	public static void main(String[] args)
	{
		int number = 2;
		int sum = 0;
		int counter = 0;
		int z = 0;
		while (number < 10000000)
		{
			System.out.print(number + " ");
			String number1 = Integer.toString(number);
			int x = number1.length();
			z = 0;
			while (z != 1)
			{
				if (x == 1)
				{
					String first = number1.substring(0,1);
					int n1 = Integer.parseInt(first);
					sum = (n1 * n1);
					System.out.print(sum + " ");
					String y = Integer.toString(sum);
					number1 = y;
					x = number1.length();
					if (sum == 89)
					{
						System.out.println("");
						number++;
						counter++;
						z = 1;
					}
					if (sum == 1)
					{
						System.out.println("");
						number++;
						z = 1;	
					}
					
				}
				if(x == 2)
				{
					String first = number1.substring(0,1);
					String second = number1.substring(1,2);
					int n1 = Integer.parseInt(first);
					int n2 = Integer.parseInt(second);
					sum = (n1 * n1) + (n2 * n2);
					System.out.print(sum + " ");
					String y = Integer.toString(sum);
					number1 = y;
					x = number1.length();
					if (sum == 89)
					{
						System.out.println("");
						number++;
						counter++;
						z = 1;
					}
					if (sum == 1)
					{
						System.out.println("");
						number++;
						z = 1;	
					}
				}
				if(x == 3)
				{
					String first = number1.substring(0,1);
					String second = number1.substring(1,2);
					String third = number1.substring(2,3);
					int n1 = Integer.parseInt(first);
					int n2 = Integer.parseInt(second);
					int n3 = Integer.parseInt(third);
					sum = (n1 * n1) + (n2 * n2) + (n3 * n3);
					System.out.print(sum + " ");
					String y = Integer.toString(sum);
					number1 = y;
					x = number1.length();
					if (sum == 89)
					{
						System.out.println("");
						number++;
						counter++;
						z = 1;
					}
					if (sum == 1)
					{
						System.out.println("");
						number++;
						z = 1;
					}
				}
				if(x == 4)
				{
					String first = number1.substring(0,1);
					String second = number1.substring(1,2);
					String third = number1.substring(2,3);
					String fourth = number1.substring(3,4);
					int n1 = Integer.parseInt(first);
					int n2 = Integer.parseInt(second);
					int n3 = Integer.parseInt(third);
					int n4 = Integer.parseInt(fourth);
					sum = (n1 * n1) + (n2 * n2) + (n3 * n3) + (n4 * n4);
					System.out.print(sum + " ");
					String y = Integer.toString(sum);
					number1 = y;
					x = number1.length();
					if (sum == 89)
					{
						System.out.println("");
						number++;
						counter++;
						z = 1;
					}
					if (sum == 1)
					{
						System.out.println("");
						number++;
						z = 1;
					}
				}
				if(x == 5)
				{
					String first = number1.substring(0,1);
					String second = number1.substring(1,2);
					String third = number1.substring(2,3);
					String fourth = number1.substring(3,4);
					String fifth = number1.substring(4,5);
					int n1 = Integer.parseInt(first);
					int n2 = Integer.parseInt(second);
					int n3 = Integer.parseInt(third);
					int n4 = Integer.parseInt(fourth);
					int n5 = Integer.parseInt(fifth);
					sum = (n1 * n1) + (n2 * n2) + (n3 * n3) + (n4 * n4) + (n5 * n5);
					System.out.print(sum + " ");
					String y = Integer.toString(sum);
					number1 = y;
					x = number1.length();
					if (sum == 89)
					{
						System.out.println("");
						number++;
						counter++;
						z = 1;
					}
					if (sum == 1)
					{
						System.out.println("");
						number++;
						z = 1;
					}
				}
				if(x == 6)
				{
					String first = number1.substring(0,1);
					String second = number1.substring(1,2);
					String third = number1.substring(2,3);
					String fourth = number1.substring(3,4);
					String fifth = number1.substring(4,5);
					String sixth = number1.substring(5,6);
					int n1 = Integer.parseInt(first);
					int n2 = Integer.parseInt(second);
					int n3 = Integer.parseInt(third);
					int n4 = Integer.parseInt(fourth);
					int n5 = Integer.parseInt(fifth);
					int n6 = Integer.parseInt(sixth);
					sum = (n1 * n1) + (n2 * n2) + (n3 * n3) + (n4 * n4) + (n5 * n5) + (n6 * n6);
					System.out.print(sum + " ");
					String y = Integer.toString(sum);
					number1 = y;
					x = number1.length();
					if (sum == 89)
					{
						System.out.println("");
						number++;
						counter++;
						z = 1;
					}
					if (sum == 1)
					{
						System.out.println("");
						number++;
						z = 1;
					}
				}
				if(x == 7)
				{
					String first = number1.substring(0,1);
					String second = number1.substring(1,2);
					String third = number1.substring(2,3);
					String fourth = number1.substring(3,4);
					String fifth = number1.substring(4,5);
					String sixth = number1.substring(5,6);
					String seventh = number1.substring(6,7);
					int n1 = Integer.parseInt(first);
					int n2 = Integer.parseInt(second);
					int n3 = Integer.parseInt(third);
					int n4 = Integer.parseInt(fourth);
					int n5 = Integer.parseInt(fifth);
					int n6 = Integer.parseInt(sixth);
					int n7 = Integer.parseInt(seventh);
					sum = (n1 * n1) + (n2 * n2) + (n3 * n3) + (n4 * n4) + (n5 * n5) + (n6 * n6) + (n7 * n7);
					System.out.print(sum + " ");
					String y = Integer.toString(sum);
					number1 = y;
					x = number1.length();
					if (sum == 89)
					{
						System.out.println("");
						number++;
						counter++;
						z = 1;
					}
					if (sum == 1)
					{
						System.out.println("");
						number++;
						z = 1;
					}
				}
			}
		
		}
		System.out.println("The answer to Project Euler #92 is " + counter);
	}	
}