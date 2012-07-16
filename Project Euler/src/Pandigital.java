import java.util.*;
public class Pandigital
{
	public static void main(String[] args)
	{
		int counter = 0;
		for (long i = 123456789; i <= 987654321; i++)
		{
		    if (isPandigital(i))
		    {
		         counter++;
		         System.out.println(i + " counter: " + counter);
		         
		    }
		}
	}
	public static boolean isPandigital(long n)
	{
	    Set<Character> set= new TreeSet<Character>();   
	    String string = n+"";
	    for (char c:string.toCharArray())
	    {
	        if (c=='0') return false;
	        set.add(c);
	    }
	    return set.size()==string.length();
	}
}


