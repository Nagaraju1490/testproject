package testngFramework;

import org.testng.annotations.Test;

public class Groupingtestcase2 {
	
	@Test(groups= {"smoke"})
	  public void test1() {
		  System.out.println("this is third smoke test case ");
	  }
	  
	  @Test(groups= {"regression"})
	  public void test2() {
		  System.out.println("this is second regression test case ");
	  }
	  
	  @Test(groups= {"smoke"})
	  public void test3() {
		  System.out.println("this is fourth smoke test case ");
	  }
	  

}
