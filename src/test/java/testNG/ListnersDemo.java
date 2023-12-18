package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListnersDemo {
	
  @Test(priority=0)
  public void f() {
	  Assert.assertTrue(true);
  }
  
  @Test(priority=1)
  public void f1() {
	  Assert.assertEquals(1, 2);
  }
  
  @Test(priority=2, dependsOnMethods= {"f1"})
  public void f2() {
	  Assert.assertEquals(1, 1);
  }
}
