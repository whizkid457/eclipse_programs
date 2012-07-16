public class Number14 
{
	public static void main(String[] args)
	{
		long number = 100000, counter = 0, max = 0, max_num = 0;
		long num1 = number;
		while (true)
		{
			num1 = number;
			System.out.print(number + " ");
			while (num1 != 1)
			{
				if (num1 % 2 == 0)
				{
					num1 = num1/2;
					System.out.print(" " + num1);
					counter++;
				}
				else if (num1 % 2 == 1)
				{
					num1 = (3 * num1) + 1;
					System.out.print(" " + num1);
					counter++;
				}
			}
			if (counter > max)
			{
				max = counter;
				max_num = 0;
				max_num = number;
				//System.out.println(number);
			}
			counter = 0;
			number++;
			System.out.println();
			if (number == 1000000) break;
			
			
		}
		System.out.println("answer: " + max_num);
	}
	
}
