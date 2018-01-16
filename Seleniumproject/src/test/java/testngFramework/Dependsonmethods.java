package testngFramework;


import org.testng.annotations.Test;

import junit.framework.Assert;

public class Dependsonmethods {
	@Test(groups= {"smoke"})
	  public void test1() {
		  System.out.println("this is first smoke test case ");
		  Assert.assertEquals("test", "test123");
	  }
	  
	  @Test(groups= {"regression"},dependsOnMethods= {"test1"})
	  public void test2() {
		  System.out.println("this is first regression test case ");
	  }
	  
	  @Test(groups= {"smoke"},dependsOnMethods= {"test1"})
	  public void test3() {
		  System.out.println("this is second smoke test case");
	  }
	  @Test(groups= {"smoke"})
	  public void test4() {
		  System.out.println("this is second regression test case");
	  }

	  
}
