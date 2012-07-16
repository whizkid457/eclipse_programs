public class Number119
{
	public static void main(String[] args)
	{
		int number = 3;
		int b = 1;
		long a = 999999999999999999L; 
		int counter = 1;
		while (number <= a)
		{
			String number1 = Integer.toString(number);
			int n = number1.length();
			
			if (n == 2)
			{
				String first = number1.substring(0,1);
				String second = number1.substring(1,2);
				int n1 = Integer.parseInt(first);
				int n2 = Integer.parseInt(second);
				int sum = n1 + n2;
				
				if (sum != 1)
				{
					while (Math.pow(sum,b) <= number)
					{
						if (Math.pow(sum,b) == number)
						{
							System.out.println(number + " is " + counter + " in this odd sequence");
							counter++;
						}
						b++;
					}
				}
			}
			
			if (n == 3)
			{	
				String first = number1.substring(0,1);
				String second = number1.substring(1,2);
				String third = number1.substring(2,3);
				int n1 = Integer.parseInt(first);
				int n2 = Integer.parseInt(second);
				int n3 = Integer.parseInt(third);				
				int sum = n1 + n2 + n3;
				if (sum != 1)
				{
					while (Math.pow(sum,b) <= number)
					{
						if (Math.pow(sum,b) == number)
						{
							System.out.println(number + " is " + counter + " in this odd sequence");
							counter++;
						}
						b++;
					}
				}
			}
			
			if (n == 4)
			{
				String first = number1.substring(0,1);
				String second = number1.substring(1,2);
				String third = number1.substring(2,3);
				String fourth = number1.substring(3,4);
				int n1 = Integer.parseInt(first);
				int n2 = Integer.parseInt(second);
				int n3 = Integer.parseInt(third);
				int n4 = Integer.parseInt(fourth);
				
				int sum = n1+ n2 + n3 + n4;
				
				if (sum != 1)
				{
					while (Math.pow(sum,b) <= number)
					{
						if (Math.pow(sum,b) == number)
						{
							System.out.println(number + " is " + counter + " in this odd sequence");
							counter++;
						}
						b++;
					}
				}	
			}
			
			if (n == 5)
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
				
				int sum = n1+ n2 + n3 + n4 + n5;
				
				if (sum != 1)
				{
					while (Math.pow(sum,b) <= number)
					{
						if (Math.pow(sum,b) == number)
						{
							System.out.println(number + " is " + counter + " in this odd sequence");
							counter++;
						}
						b++;
					}
				}	
			}

			if (n == 6)
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
				
				int sum = n1+ n2 + n3 + n4 + n5 + n6;
				
				if (sum != 1)
				{
					while (Math.pow(sum,b) <= number)
					{
						if (Math.pow(sum,b) == number)
						{
							System.out.println(number + " is " + counter + " in this odd sequence");
							counter++;
						}
						b++;
					}
				}	
			}
			
			if (n == 7)
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
				
				int sum = n1+ n2 + n3 + n4 + n5 + n6 + n7;
				
				if (sum != 1)
				{
					while (Math.pow(sum,b) <= number)
					{
						if (Math.pow(sum,b) == number)
						{
							System.out.println(number + " is " + counter + " in this odd sequence");
							counter++;
						}
						b++;
					}
				}	
			}
			
			if (n == 8)
			{
				String first = number1.substring(0,1);
				String second = number1.substring(1,2);
				String third = number1.substring(2,3);
				String fourth = number1.substring(3,4);
				String fifth = number1.substring(4,5);
				String sixth = number1.substring(5,6);
				String seventh = number1.substring(6,7);
				String eighth = number1.substring(7,8);
				int n1 = Integer.parseInt(first);
				int n2 = Integer.parseInt(second);
				int n3 = Integer.parseInt(third);
				int n4 = Integer.parseInt(fourth);
				int n5 = Integer.parseInt(fifth);
				int n6 = Integer.parseInt(sixth);
				int n7 = Integer.parseInt(seventh);
				int n8 = Integer.parseInt(eighth);
				
				int sum = n1+ n2 + n3 + n4 + n5 + n6 + n7 + n8;
				
				if (sum != 1)
				{
					while (Math.pow(sum,b) <= number)
					{
						if (Math.pow(sum,b) == number)
						{
							System.out.println(number + " is " + counter + " in this odd sequence");
							counter++;
						}
						b++;
					}
				}	
			}
			
			if (n == 9)
			{
				String first = number1.substring(0,1);
				String second = number1.substring(1,2);
				String third = number1.substring(2,3);
				String fourth = number1.substring(3,4);
				String fifth = number1.substring(4,5);
				String sixth = number1.substring(5,6);
				String seventh = number1.substring(6,7);
				String eighth = number1.substring(7,8);
				String ninth = number1.substring(8,9);
				int n1 = Integer.parseInt(first);
				int n2 = Integer.parseInt(second);
				int n3 = Integer.parseInt(third);
				int n4 = Integer.parseInt(fourth);
				int n5 = Integer.parseInt(fifth);
				int n6 = Integer.parseInt(sixth);
				int n7 = Integer.parseInt(seventh);
				int n8 = Integer.parseInt(eighth);
				int n9 = Integer.parseInt(ninth);
				
				int sum = n1+ n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9;
				
				if (sum != 1)
				{
					while (Math.pow(sum,b) <= number)
					{
						if (Math.pow(sum,b) == number)
						{
							System.out.println(number + " is " + counter + " in this odd sequence");
							counter++;
						}
						b++;
					}
				}	
			}
			
			number++;
			b = 2;
		}
	}

}

