package testNG;

import org.testng.Assert;
import org.testng.annotations.*;



public class AllAnnotations {
	//suite, test, class, method
	
  @BeforeSuite
  public void f() {
	  System.out.println("before suite......");

  }
  
  @AfterSuite
  public void g() {
	  System.out.println("after suite......");

  }
  
  @AfterTest
  public void h() {
	  System.out.println("after test......");
  }
  
  @BeforeTest
  public void i() {
	  System.out.println("before test......");
  }
  
  @BeforeMethod
  public void j() {
	  System.out.println("before method......");
  }
  
  @AfterMethod
  public void k() {
	  System.out.println("after method......");
  }
  
  @Test(priority=1)
  public void l() {
	  System.out.println("test 1......");
  }
  
  @Test(priority=2)
  public void m() {
	  System.out.println("test 2......");
  }
}
