package testng_Fundamentals;

import org.testng.annotations.Test;

public class Enablement_Disablement {
	

	@Test(enabled=true)
		public void login()
		{
			
		}
		@Test(dependsOnMethods="login")
		
		public void logic()
		{
			
		}
		@Test(enabled=false,dependsOnMethods= {"login","logic"})
		public void logout()
		{
		}
		

}
