import java.math.BigInteger;
public class Number20
{
	public static BigInteger factorial(BigInteger i)
    {
        if(i.equals(new BigInteger("1")))
        {
        	return new BigInteger("1");
        }
        else return i.multiply(factorial(i.subtract(new BigInteger("1"))));
    }
    public static void main(String [] args)
    {
    	BigInteger i = new BigInteger("100");
    	int a = 100;
        while (i.equals(new BigInteger("100")))
        {
        	System.out.println(a + "!= " + factorial(i));
        	i = i.add(new BigInteger("1"));
        	a++;
        }      
    }
}
