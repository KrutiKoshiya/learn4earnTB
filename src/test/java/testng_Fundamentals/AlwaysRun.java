package testng_Fundamentals;

import org.junit.Assert;
import org.testng.annotations.Test;

public class AlwaysRun {
	
	@Test
	public void begin()
	{
		System.out.println("This is the beginning part of it");
	}
	@Test(dependsOnMethods="begin")
	public void mid()
	{
		System.out.println("This is the beginning part of it");
		Assert.fail();
	}
	@Test(dependsOnMethods= {"begin","mid"},alwaysRun=true)
	public void end()
	{
		System.out.println("This is the beginning part of it");
	}
	
	@Test(enabled=false, dependsOnMethods= {"begin","mid"},alwaysRun=true)
	public void othermethod()
	{
		System.out.println("This is the beginning part of it");
	}

}
