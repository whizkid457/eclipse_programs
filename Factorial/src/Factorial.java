public class Factorial
{
    public static long factorial(long i)
    {
        if(i == 1) return 1;
        else return i * (factorial(i - 1));
    }
    public static void main(String [] args)
    {
    	long i = 1;
        while (i <= 20)
        {
        	System.out.println(i + "!= " + factorial(i));
        	i++;
        }      
    }
}