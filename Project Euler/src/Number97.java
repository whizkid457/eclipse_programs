import java.math.BigInteger;
public class Number97
{
	public static void main(String[] args)
	{
		BigInteger a = new BigInteger("2"); 
		BigInteger mode = new BigInteger("10000000000"); 
		a = a.modPow(new BigInteger("7830457"),mode).multiply(new BigInteger("28433")).add(BigInteger.ONE).mod(mode); 
		System.out.println(a); 
	}
}
