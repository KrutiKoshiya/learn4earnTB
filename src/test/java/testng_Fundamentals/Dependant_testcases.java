package testng_Fundamentals;

import org.testng.annotations.Test;

public class Dependant_testcases {
	
	@Test
		public void login()
		{
			
		}
		@Test(dependsOnMethods="login")
		
		public void logic()
		{
			
		}
		@Test(dependsOnMethods= {"login","logic"})
		public void logout()
		{
		}
		

}
