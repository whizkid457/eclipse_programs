import java.math.BigInteger;
public class Number56
{	
	public static void main(String[] args) 
	{
		BigInteger a = new BigInteger("1");
		int b = 2;
		BigInteger max = new BigInteger("0");
		while (b != 100)
		{
			if (a.equals(new BigInteger("100")))
			{
				a = new BigInteger("1");
				b++;
			}
			BigInteger product = a.pow(b);
			digitAdder(product, max, a, b);
			//System.out.println(a + "^" + b + ": " + product);
			a = a.add(new BigInteger("1"));
			//max.equals(new BigInteger("0"));
		}
	}
	public static void digitAdder(BigInteger product, BigInteger max, BigInteger a, int b)
	{
		BigInteger one = new BigInteger("1");
		BigInteger sum = new BigInteger("0");
		while(product.compareTo(one) >= 1)
		{
			BigInteger remainder = product.remainder(new BigInteger("10")); 
			sum = sum.add(remainder);
			product = product.divide(new BigInteger("10"));
		}
		if (sum.compareTo(max) > max.intValue())
		{
			max = sum;
			System.out.println("The maximum so far is " + max + "(" + a + "^" + b + ")");
		}
		/*int sum = 0, i = 0, j = 0, max = 0;
		String s= "";
		while(i < 100)
		{
			while(j < 100)
			{
				int product=(int) Math.pow(i,j);
				s= "" + product; //this will convert the number into string
				sum = 0;
				for(int k = 0; k < s.length(); k++)
				{
					int a = product%10;// a stores each digit from right to left
					product/=10;  //now value of product is a number with  last digit of original value removed
					sum+=a;	
				}
				if(sum > max)
				{
					max=sum;
				}	
				j++;
			}
			i++;
		}
		System.out.print("maximum digital sum is :"+max);*/
	}
}
