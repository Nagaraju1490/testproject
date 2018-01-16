package javaSelenium;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class dataprovider {
    WebDriver driver;
  @BeforeMethod
  public void launchbrowser() {
	 System.setProperty("webdriver.chrome.driver", "D:\\Nagaraju\\chromedriver.exe");
     driver=new ChromeDriver();
     driver.get("https://www.facebook.com/");
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		 
	driver.manage().window().maximize(); 
	
  }
  
   @DataProvider(name="Testdata")
   public Object[][] getdata(){
	  Object[][] data=new Object[3][2];
	  data[0][0]="user1";
	  data[0][1]="password1";
	  
	  data[1][0]="user2";
	  data[1][1]="password2";

	  data[2][0]="user3";
	  data[2][1]="password3";

      return data;
  }
    @Test(dataProvider="Testdata")
    public void logib(String username , String password) {
    	
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("username");
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.id("loginbutton")).click();
    	
    	
    	
    	
    	
    }
}
