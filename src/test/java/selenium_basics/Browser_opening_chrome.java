package selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_opening_chrome {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","D:\\SELENIUM AUTOMATION\\BROWSER DRIVER\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://amazon.com");
		driver.quit();

	}

}
