public class ex 
{
	public static void main(String[] args) 
	{
		int x = 1;
		int myNumber = x;
		int myExponent = x;
		int sum = 0;
		while (x <= 1000)
		{
			int myTotal = (int) Math.pow(myNumber, myExponent);
			sum = sum + myTotal;
			System.out.println(sum);
			x++;
		}
		

	}

}
