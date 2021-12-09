package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_file {
	public  static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a.btn.block.resume-btn.btn-orange.mt20")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("file-upload")).sendKeys("D:\\Hello.txt");
		Thread.sleep(2000);
	}

}
