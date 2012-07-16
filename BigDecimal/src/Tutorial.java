import java.math.BigDecimal;
public class Tutorial
{
	public static void main(String[] args)
	{
		BigDecimal bd = new BigDecimal("0");	
		bd = bd.add(new BigDecimal("99.99"));
		bd = bd.add(new BigDecimal("1.99"));		
	  	System.out.println("BigDecimal result: " + bd);
	  	double d = 99.99;
		d = d + 1.99;		
		System.out.println("Double result: " + d);
	}
}
