package testng_Fundamentals;

import org.testng.annotations.Test;

public class Priorities {
	
	@Test(priority=1)
	public void initialization()
	{
		System.out.println("This will execute third");
	}

	@Test(priority=-1)
	public void execution()
	{
		System.out.println("This will execute first");
	}
	
	@Test(priority=0)
	public void termination()
	{
		System.out.println("This will execute second");
	}
}
