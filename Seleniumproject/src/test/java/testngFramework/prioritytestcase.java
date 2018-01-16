package testngFramework;

import org.testng.annotations.Test;

public class prioritytestcase {
	
  @Test(priority=1)
  public void login() {
 System.out.println("this is login test");
  }
  @Test(priority=2,enabled=false)
  public void lanch() {
 System.out.println("this is lanch test");
  }
  @Test(priority=3)
  public void open() {
 System.out.println("this is open test");
  }
  @Test(priority=4)
  public void close() {
 System.out.println("this is close test");
  }
}
