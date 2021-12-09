package class_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment_chromoptions {
	public static WebDriver driver;
	public static SoftAssert softassert= new SoftAssert();
	public static ChromeOptions options=new ChromeOptions();
	
	@Test
	public static void begin()
	
	{
         WebDriverManager.chromedriver().setup();
         options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
         options.addArguments("--start-maximized");
         //options.addArguments("--incognito");
         driver=new ChromeDriver(options);
         driver.get("https://rediff.com");
         //softassert.assertEquals(driver.getTitle(),"rediff.com");
         //softassert.assertAll();
         
         
	}
	
	@Test
	
	  public static void currentUrl() 
	{
		String ActualCurrentUrl="https://www.rediff.com/";
	    String ExpectedCurrentUrl=driver.getCurrentUrl();
	  softassert.assertEquals(ActualCurrentUrl, ExpectedCurrentUrl); 
	  //softassert.assertAll();
	}
	 
	
	  @Test 
	  public static void signinclick() 
	  {
		  softassert.assertTrue(driver.findElement(By.className("signin")).isEnabled());
		  driver.findElement(By.className("signin")).click();
		  //softassert.assertAll();
	  
	  }
	  
		
	  @Test
	  public static void userName() throws InterruptedException
	  {
		 
		  softassert.assertTrue(driver.findElement(By.id("login1")).isEnabled());
		  driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		  softassert.assertTrue(driver.findElement(By.cssSelector("input#password")).isEnabled());
		  driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
		  softassert.assertTrue(driver.findElement(By.className("signinbtn")).isEnabled());
		  driver.findElement(By.className("signinbtn")).click();
		  Thread.sleep(2000);
		  //softassert.assertAll();
		  driver.findElement(By.className("rd_logout")).click();
	  }
	  
          
	 
		/*
		 * @Test public static void logOut() throws Exception { Thread.sleep(3000);
		 * softassert.assertTrue(driver.findElement(By.className("rd_logout")).isEnabled
		 * ()); driver.findElement(By.className("rd_logout")).click();
		 * //softassert.assertAll(); }
		 */
	  @Test
	  public static void home()
	  {
		 WebDriverWait wait = new WebDriverWait(driver,120);
		 wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Rediff Home")));
		  //softassert.assertTrue(driver.findElement(By.linkText("Rediff Home")).isEnabled());
		  driver.findElement(By.linkText("Rediff Home")).click();
		  softassert.assertAll();
		  
	  }
	  
	 

}
