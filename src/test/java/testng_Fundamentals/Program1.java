package testng_Fundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program1 {

	public static WebDriver driver;
	
	@BeforeTest
	public static void begin()
	{
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://rediff.com");
	}
	@Test
	public static void signinlinkClick()
	{
		WebElement signinlink=driver.findElement(By.className("signin"));
		
		if(signinlink.isEnabled()==true)
		{
			signinlink.click();
		}
		else
		{
			System.out.println("The link is not working");
		}
		 driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");	
	  
	}
	
	
	@AfterTest
	public static void tearDown()
	
	{
	  //driver.quit();	
	}
	
}
