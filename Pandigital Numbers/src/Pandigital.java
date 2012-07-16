import java.util.Set;
import java.util.TreeSet;

public class Pandigital
{
	public static void main(String[] args)
	{
		int pans = 0;
		for (int i=123456789;i<=987654321;i++)
		{
		    if (isPandigital(i))
		    {
		    	System.out.println(i);
		        pans++;
		    }
		}
	}	
	private static boolean isPandigital(int i)
	{
	    Set<Character> set = new TreeSet<Character>();   
	    String string = i + "";
	    for (char c:string.toCharArray())
	    {
	        if (c=='0') return false;
	        set.add(c);
		}
		return set.size()==string.length();
	}
}
