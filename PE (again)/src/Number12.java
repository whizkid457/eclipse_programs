public class Number12 
{
	public static void main(String[] args)
	{
		int counter = 0, i = 400;
		while (counter != 500)
		{
			int divisor = 1;
			int tri_number = i * (i + 1)/2;
			while(divisor != tri_number)
			{
				if (tri_number % divisor == 0)
				{
					counter++;
				}
				divisor++;
				if (counter == 500)
				{
					System.out.println(tri_number);
					System.exit(0);
				}
			}
			counter = 0;
			i++;
		}
	}	
}

