public class Number26
{
	public static void main(String[] args)
	{
		double number = 3.0, max = 0, length = 0;
		while (number <= 1000)
		{
			System.out.println(number + ": " + 1/number);
			String answer = Double.toString(1/number);
			length = answer.length() - 2;
			/*if (length <= 3) 
			{
				number++;
			}
			/*else 
			{
				String decimal = answer.substring(2, length + 2);
				int i = 3;
				while(i + 1 != length) 
				{
					if (Integer.parseInt(decimal.substring(2, 3)) == (Integer.parseInt(decimal.substring(i, i+1)))) 
					{
						break;
					}
					else i++;
				}
				if (i - 1 > max)
				{
					max = number;
				}*/
			number++;
		}
	}
}

