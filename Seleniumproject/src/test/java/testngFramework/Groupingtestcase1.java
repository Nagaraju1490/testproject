package testngFramework;

import org.testng.annotations.Test;

public class Groupingtestcase1 {
	@Test(groups= {"smoke"})
	  public void test1() {
		  System.out.println("this is first smoke test case ");
	  }
	  
	  @Test(groups= {"regression"})
	  public void test2() {
		  System.out.println("this is first regression test case ");
	  }
	  
	  @Test(groups= {"smoke"})
	  public void test3() {
		  System.out.println("this is second smoke test case");
	  }
	  
}
