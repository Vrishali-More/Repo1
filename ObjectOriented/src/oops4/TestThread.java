package oops4;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThread {
public static void main (String[] args)
{
	Executor executor = Executors.newCachedThreadPool();// use when we want multiple things at one point
    executor.execute(new Task());
    ThreadPoolExecutor pool=(ThreadPoolExecutor)executor;
    pool.shutdown();
    

}
static class Task implements Runnable{
	public void run()
{
		try{
			Long duration = (long)(Math.random()*5);
		   System.out.println("Running task");
		   TimeUnit.SECONDS.sleep(duration);
		   System.out.println("Task completed");
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
			
		}
		
		}
}
}
