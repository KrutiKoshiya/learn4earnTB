package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook 
{
	public static WebDriver driver;
	//public static SoftAssert softassert= new SoftAssert();
	public static ChromeOptions options=new ChromeOptions();
	public static Select select;
	
	public static void main(String[] args) throws Exception
	{
		 WebDriverManager.chromedriver().setup();
         options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
         options.addArguments("--start-maximized");
         options.addArguments("--incognito");
         driver=new ChromeDriver(options);
         driver.get("https://facebook.com/");
         driver.findElement(By.xpath("//div[@id='reg_pages_msg']/preceding::a[1]")).click();
         Thread.sleep(1000);
         driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("xyz");
         Thread.sleep(1000);
         driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("pqr");
         Thread.sleep(1000);
         driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("seleniumpanda@rediffmail.com");
         Thread.sleep(1000);
         driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("seleniumpanda@rediffmail.com");
         Thread.sleep(1000);
         driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("seleniumpanda@rediffmail.com");
         Thread.sleep(1000);
         
          select=new Select(driver.findElement(By.id("day")));
         select.selectByVisibleText("11");
         select=new Select(driver.findElement(By.id("month")));
         select.selectByVisibleText("Feb");
         select=new Select(driver.findElement(By.id("year")));
         select.selectByVisibleText("1989");
	}

}
