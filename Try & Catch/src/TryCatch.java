import java.util.*;
public class TryCatch
{
   public static void main(String args[])
   {
	   	Scanner str = new Scanner(System.in);
	   	System.out.println("Enter random numbers: ");
	   	int ran = str.nextInt();
	   	String random = Integer.toString(ran);
        int sum = 0;
        for(int i = 0; i < random.length(); i++)
        {
            try
            {
            	sum += Integer.parseInt(random.charAt(i)+ "");
            }catch(NumberFormatException exception)
            {
                    System.out.println("Sorry, the character in the string is not a number!");
            }finally
            {
                  System.out.println("Sum is at: " + sum);
            }
        }
        System.out.println("Sum: " + sum);
   }

} 

