public class Number36
{
	public static void main(String[] args)
	{
		int sum = 0;
		String separator = "";
		for (int number = 1; number < 1000000; number++)
		{
			String testing = Integer.toString(number);
			if (testing.equals(new StringBuffer(String.valueOf(testing)).reverse().toString()))
			{
				int number1 = number;
				StringBuffer base2 = new StringBuffer();
				while (number1 >= 1)
				{
					int remainder = number1 % 2;
					base2.append(separator);
					base2.append(Integer.toString(remainder));
					number1/=2;	
				}
			  	String newbase = base2.toString();
				if (newbase.equals(new StringBuffer(String.valueOf(newbase)).reverse().toString()))
				{
					sum+=number;
					System.out.println("Base 2: " + base2 + " Base 10: " + number);
				}
			}
		}
		System.out.println("Answer: " + sum);
	}

}
