public class Number1 
{
	public static void main(String[] args) 
	{
		int number = 1, counter = 0;
		while (number < 1000)
		{
			if (number % 3 == 0 && number % 5 == 0) counter+= number;
			else if (number % 3 == 0) counter+=number;
			else if (number % 5 == 0) counter+=number;
			number++;
		}
		System.out.println(counter);
	}

}
