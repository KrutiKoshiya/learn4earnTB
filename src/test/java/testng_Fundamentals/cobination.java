package testng_Fundamentals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class cobination {
	
	@BeforeMethod
	public void begin()
	{
		System.out.println("execute first");
	}
    
	@Test
	public void testcase1()
	{
		System.out.println("First testcase");
	}
	
	@Test
	public void testcase2()
	{
		System.out.println("Second testcase");
	}
	
	@AfterMethod
	public void ends()
	{
		System.out.println("execute after testcase");
	}
	
	
}
