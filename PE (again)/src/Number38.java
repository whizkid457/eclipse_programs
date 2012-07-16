public class Number38
{
	public static void main(String[] args)
	{
		int number = 5, i = 1;
		while (number < 1000000)
		{
			i = 1;
			StringBuffer pandigital = new StringBuffer();
			while (pandigital.length() < 9)
			{
				pandigital.append(number * i);
				i++;
			}
			if (pandigital.length() == 9) 
			{
				int n = Integer.parseInt(pandigital.substring(0, 1).toString());
				int n1 = Integer.parseInt(pandigital.substring(1, 2).toString());
				int n2 = Integer.parseInt(pandigital.substring(2, 3).toString());
				int n3 = Integer.parseInt(pandigital.substring(3, 4).toString());
				int n4 = Integer.parseInt(pandigital.substring(4, 5).toString());
				int n5 = Integer.parseInt(pandigital.substring(5, 6).toString());
				int n6 = Integer.parseInt(pandigital.substring(6, 7).toString());
				int n7 = Integer.parseInt(pandigital.substring(7, 8).toString());
				int n8 = Integer.parseInt(pandigital.substring(8, 9).toString());
				//int n9 = Integer.parseInt(pandigital.substring(9, 10).toString());
				if ((n + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 == 45) && (n * n1 * n2 * n3 * n4 * n5 * n6 * n7 * n8 == 362880))
				{
					System.out.println(pandigital);
				}
			}
			number++;
			i = 1;
		}	
	}
}	

