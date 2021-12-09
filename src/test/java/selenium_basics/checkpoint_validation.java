package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkpoint_validation {
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		System.out.println(driver.getTitle());
		String ActualTitle="Rediff.com:News|Rediffmail|Stock Quotes |Shopping";
		String ExpectedTitle=driver.getTitle();
		
	    System.out.println(driver.getCurrentUrl());
	    String ActualCurrentUrl="https://www.rediff.com/";
	    String ExpectedCurrentUrl=driver.getCurrentUrl();
	      
	    if(ActualTitle.equals(ExpectedTitle) && ActualCurrentUrl.equals(ExpectedCurrentUrl))
	    {
	    	System.out.println("Both my validation about this webpage is correct");
	    }
	    else
	    {
	    	System.out.println("Both my validation about this webpage is incorrect ");
	    }
		
	    //isEnabled(),isSelected(),isDiplayed();
	    
	    WebElement signinlink=driver.findElement(By.className("signin"));
	    
	    System.out.println(signinlink.isDisplayed());
	    boolean b1=signinlink.isDisplayed();
	    boolean b2=signinlink.isEnabled();
	    
	    if(b1==true && b2==true)
	    {
	    	driver.findElement(By.className("signin")).click();
	    	
	    			
	    }
	    else
	    {
	    	System.out.println("This link is not operational");
	    	
	    }
	   
	    WebElement userName=driver.findElement(By.id("login1"));
	    boolean b3=userName.isDisplayed();
	    boolean b4=userName.isEnabled();
	    
	    if(b3==true && b4==true)
	    {
	    	driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
	    }
	    else
	    {
	    	System.out.println("This textbox is not operational");
	    }
	    
	    WebElement passWord=driver.findElement(By.id("password"));
	    boolean b5=passWord.isDisplayed();
	    boolean b6=passWord.isEnabled();
	    
	    if(b5==true && b6==true)
	    {
	    	driver.findElement(By.id("password")).sendKeys("Selenium@123");
	    }
	    else
	    {
	    	System.out.println("This textbox is not operational");
	    }
	    
	    WebElement signInBtn=driver.findElement(By.className("signinbtn"));
	    boolean b7=signInBtn.isDisplayed();
	    boolean b8=signInBtn.isEnabled();
	    
	    if(b7==true && b8==true)
	    {
	    	driver.findElement(By.className("signinbtn")).click();
	    }
	    else
	    {
	    	System.out.println("This link is not operational");
	    }
	    	
	    	
	    WebElement logOut=driver.findElement(By.className("rd_logout"));
	    boolean b9=logOut.isDisplayed();
	    boolean b10=logOut.isEnabled();
	    
	    if(b9==true && b10==true)
	    {
	    	driver.findElement(By.className("rd_logout")).click();
	    }
	    else
	    {
	    	System.out.println("This link is not operational");
	    }
	    
	    WebElement home=driver.findElement(By.linkText("Rediff Home"));
	    boolean b11=home.isDisplayed();
	    boolean b12=home.isEnabled();
	    
	    if(b11==true && b12==true)
	    {
	    	driver.findElement(By.linkText("Rediff Home")).click();
	    }
	    else
	    {
	    	System.out.println("This link is not operational");
	    }
		
		
	}

}
