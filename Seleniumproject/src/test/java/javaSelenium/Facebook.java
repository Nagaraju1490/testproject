package javaSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Facebook {
	  WebDriver driver;
    @Test
   public void launchbrowser() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Nagaraju\\chromedriver.exe");
	  driver=new ChromeDriver();
      driver.get("https://www.facebook.com/");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);		 
	  driver.manage().window().maximize(); 
	  
		driver.findElement(By.id("email")).sendKeys("nagaraju465@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("medaboinan");
		driver.findElement(By.id("loginbutton")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("Nagaraju")).click();
		//driver.findElement(By.xpath("//span[text()='Nagaraju']")).click();
		//driver.findElement(By.linkText("Nagaraju Medaboina")).click();
		//driver.findElement(By.xpath("//div[text()='Nagaraju Medaboina']")).click();
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Nagaraju Medaboina");
		//driver.switchTo().alert().dismiss();
		/*WebElement e=driver.findElement(By.xpath("//button[@aria-label='Search']"));
		Actions a = new Actions(driver);
		a.doubleClick(e).build().perform();
		driver.findElement(By.linkText("Nagaraju Medaboina")).click();*/
		String x=driver.findElement(By.xpath("//*[@data-tab-key='friends']")).getText();
		//String x=driver.findElement(By.id("u_fetchstream_2_0")).getText();
		System.out.println(x);

     


	  
  }
}
