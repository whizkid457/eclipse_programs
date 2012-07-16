import java.math.BigInteger;
public class FactorialBigInt
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
    	BigInteger i = new BigInteger("1");
    	while (true)
        {
        	System.out.println(i + "!= " + factorial(i));
        	i = i.add(new BigInteger("1"));
        	if (i.equals(new BigInteger("1001")))
        	{
        		break;
        	}
        }      
    }
}