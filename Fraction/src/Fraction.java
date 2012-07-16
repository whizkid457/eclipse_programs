import java.util.ArrayList;

	public class Fraction
    {
       
        public static void main(String args[])
        {
        	System.out.println(decimalToFraction(1.0518));
        	int a,b,c,d;
        	a = 5;
        	b = (Integer) null;
        }
        private static String decimalToFraction(double d)
		{
			int LIMIT = 12;
	        int denominators[] = new int[LIMIT + 1];
	        int numerator, denominator, temp;
	        int MAX_GOODNESS = 100;
	        ArrayList<String> str = new ArrayList<String>();
	        int i = 0;
	        while (i < LIMIT + 1)
	        {
	            denominators[i] = (int)d;
	            d = (float) (1.0 / (d - denominators[i]));
	            i++;
	        }
	        int last = 0;
	        while (last < LIMIT)
	        {         	  
	            numerator = 1;
	            denominator = 1;
	            temp = 0;
	            int current = last;
	            while (current >= 0) {
	                denominator = numerator;
	                numerator = (numerator * denominators[current]) + temp;
	                temp = denominator;
	                current = current - 1;
	            }
	            last++;
	                       
	            int goodness = denominators[last];
	            str.add((int)numerator + "/" + (int)denominator);                               
	            // Exit early if we have reached our goodness criterion
	            if (Math.abs(goodness) > MAX_GOODNESS) break;
	        }   
	        return str.get(last - 1);
		}
    }