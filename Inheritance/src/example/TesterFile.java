package example;

public class TesterFile
{
	public static void main(String[] args)
	{
		Test t = new Test();
		SmartTest t1 = new SmartTest();
		SmartTest t2 = (SmartTest) new ReallySmartTest(); 
		
		t2 = t;
	}
}
