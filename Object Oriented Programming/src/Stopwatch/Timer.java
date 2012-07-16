package Stopwatch;

public class Timer
{
	private long startTime = 0;
    private long stopTime = 0;
    private boolean running = false;
	public Timer()
	{
	}   
	public void start()
	{
		this.startTime = System.currentTimeMillis();
	    this.running = true;
	}   
	public void stop()
	{
		this.stopTime = System.currentTimeMillis();
	    this.running = false;
	}
    //elapsed time in milliseconds
	public long getElapsedTime()
	{
		long elapsed;
	    if (running)
	    {
	    	elapsed = (System.currentTimeMillis() - startTime);
	    }
	    else
	    {
	    	elapsed = (stopTime - startTime);
	    }
	    return elapsed;
	}
	//elapsed time in seconds
	public double getElapsedTimeSecs()
	{
		double elapsed;
		if (running)
		{
			elapsed = ((System.currentTimeMillis() - startTime) / 1000);
        }
		else
		{
			elapsed = ((stopTime - startTime) / 1000);
        }
        return elapsed;
    }
}
