package javaSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void launch() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Nagaraju\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
		 
		driver.get("https://www.Gmail.com");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		 
		driver.manage().window().maximize(); 
		
		driver.findElement(By.xpath("//*[@name='identifier']")).sendKeys("nagaraju465@gmail.com");
		driver.findElement(By.xpath("//*[@class='RveJvd snByac']")).click();
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("medaboinan");
		driver.findElement(By.xpath("//input[@name='password']/following::span[1]")).click();

	  
  }
}
