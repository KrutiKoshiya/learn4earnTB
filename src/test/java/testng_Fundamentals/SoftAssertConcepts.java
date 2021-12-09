package testng_Fundamentals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertConcepts {
	public  static WebDriver driver;
	SoftAssert softassert= new SoftAssert();
	
	
	@Test
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		String actualTitle=driver.getTitle();
		String expectedTitle="Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		softassert.assertEquals(actualTitle,expectedTitle);
		softassert.assertAll("They are the same");
		
		//assertEquals(), assertNotEquals(),assertTrue(),assertFalse()
	}
	
	
}
