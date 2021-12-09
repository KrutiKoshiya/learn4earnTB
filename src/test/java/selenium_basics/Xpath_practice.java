package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_practice {
public  static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
//syntaxes of xpath
		
		//1.        //html[@attribute='value']
		//2.        //html[@attribute1='value' and @attribute2='value']
		//3.        //html[text()='value']
		//4.        //html[contains(text(),'value')]
		//5.        //html[contains(@attribute,'value')]
		//6.        //html[starts-with(@attribute,'value')]
		//7.        //html[ends-with(@attribute,'value')]
		
		/*
		 * driver.findElement(By.xpath("//a[@class='signin']")).click();
		 * driver.findElement(By.xpath("//input[contains(@id,'login1')]")).sendKeys(
		 * "Seleniumpanda@rediffmail.com");
		 * driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys(
		 * "Selenium@123");
		 * driver.findElement(By.xpath("//input[@class='signinbtn' and @name='proceed']"
		 * )).click();
		 * driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		 */
		
		
		  driver.findElement(By.cssSelector("a[class=signin]")).click();
		  driver.findElement(By.cssSelector("input[id=login1][name=login]")).sendKeys("seleniumpanda@rediffmail.com");
		  driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
		  driver.findElement(By.cssSelector("input#password+input.signinbtn")).click();
		   driver.findElement(By.cssSelector("div.rd_container div.setting_rd a.rd_logout")).click();
		   driver.findElement(By.cssSelector("a.logo+span>a:nth-child(2)>b")).click();
		   driver.close();
		 
		 
		
		/*
		 * driver.findElement(By.xpath("//p[@id=\"signin_info\"]/child::a[1]")).click();
		 * driver.findElement(By.xpath(
		 * "//div[@class=\"table\"]/child::div[@class=\"row\"]/child::div[2]/child::input[@id=\"login1\"]"
		 * )).sendKeys("seleniumpanda@rediffmail.com"); driver.findElement(By.xpath(
		 * "//input[@class=\"signinbtn\"]/preceding-sibling::input[contains(@id,\"password\")]"
		 * )).sendKeys("Selenium@123"); driver.findElement(By.xpath(
		 * "//div[@class=\"cell\"]/child::input[@class=\"signinbtn\"]")).click();
		 * driver.findElement(By.xpath(
		 * "//a[@class=\"rd_setting_panel\"]/following-sibling::a[@class=\"rd_logout\"]"
		 * )).click(); driver.findElement(By.
		 * xpath("//div[@class=\"new_container\"]/child::a[@class=\"logo\"]/following-sibling::span/child::a[2]/child::b[contains(text(),\"Rediff Home\")]"
		 * )).click(); driver.close();
		 */
	}

}
