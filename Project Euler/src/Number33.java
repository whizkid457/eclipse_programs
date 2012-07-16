public class Number33 
{
	public static void main(String[] args)
	{
		double num1 = 49, num2 = 98;
		while (num1 != 9)
		{
			if (num2 == 9)
			{
				num2 = 99;
				num1--;
			}
			int n1 = Integer.parseInt(Double.toString(num1).substring(0, 1));
			int n11 = Integer.parseInt(Double.toString(num1).substring(1, 2));
			int n2 = Integer.parseInt(Double.toString(num2).substring(0, 1));
			int n21 = Integer.parseInt(Double.toString(num2).substring(1, 2));
			switch (n1)
			{
				case 1: n1 = n2; if (num1/num2 == n11/n21) System.out.println(n11 + " " + n21); break;
				case 2: n1 = n21; if (num1/num2 == n11/n2) System.out.println(n11 + " " + n2); break;
				default: break;
			}
			switch (n11)
			{
				case 1: n11 = n2; if (num1/num2 == n1/n21) System.out.println(n1 + " " + n21); break;
				case 2: n11 = n21; if (num1/num2 == n1/n2) System.out.println(n2 + " " + n2); break;
				default: break;
			}
			num2--;
		}
	}

}
