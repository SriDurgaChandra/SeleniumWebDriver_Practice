package testNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1_BeforeAndAfterTest {
	
  @Test
  public void Test1() {
	  System.out.println("Test1.....");
  }
  
  @BeforeTest
  public void m() {
	  System.out.println("before test");
  }
}
