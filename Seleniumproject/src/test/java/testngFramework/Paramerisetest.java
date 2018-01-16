package testngFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paramerisetest {
	  WebDriver driver;
	  @BeforeMethod
	  public void launchbrowser() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Nagaraju\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		 
	  driver.manage().window().maximize(); 
		
	  }
	  @Test
	  @Parameters({"username","password"})
	    public void login(String username , String password) {
	    	
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(username);
			driver.findElement(By.id("pass")).sendKeys(password);
			driver.findElement(By.id("loginbutton")).click();
	    
} 
	  @AfterMethod
	  public void close() {
		  driver.close();
		  
	  }
}
