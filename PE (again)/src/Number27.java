public class Number27 
{
	public static void main(String[] args)
	{
		long prime = 0, a = -999, b =-999, n = 0, max = 0, ans = 0;
		while (b < 1000)
		{
			if (a == 1000)
			{
				a = -999;
				b+=2;
			}
			prime = (n * n) + (a * n) + b;
			while (checkPrime(prime))
			{
				n++;
				 prime = (n * n) + (a * n) + b;
			}
			if (n > max)
			{
				max = 0;
				max = n;
			    ans = a * b;
				System.out.println("n^2 + " + a + "n + " + b + " has " + max + " consecutive primes");
			}
			a++;
			n = 0; 
		}
		System.out.println("Answer: " + ans);
	}
	public static boolean checkPrime(long prime)
	{
		if (prime < 0) prime*=-1;
		int divisor = 2;
		while (prime % divisor != 0 && prime != 1 && prime != 1)
		{
			if (divisor > prime/2) return true;
			divisor++;
		}
		return false;
	}

}
