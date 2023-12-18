package testNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Class2_BeforeAndAfterTest {
  @Test
  public void Test2() {
	  System.out.println("Test2.....");
  }
  
  @AfterTest
  public void m() {
	  System.out.println("after test");
  }
  
  @BeforeSuite
  public void x() {
	  System.out.println("before suite............");
  }
  
  @AfterSuite
  public void y() {
	  System.out.println("after suite............");
  }
}
