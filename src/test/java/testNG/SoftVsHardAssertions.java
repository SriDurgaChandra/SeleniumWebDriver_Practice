package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftVsHardAssertions {
	
  @Test
  public void hardAssert() {
	  System.out.println("assert testing start......");
	  Assert.assertEquals(1, 2);
	  System.out.println("assert testing end");
	  Assert.assertTrue(true);
  }
  
  @Test
  public void softAssert() {
	  System.out.println("softassert testing start......");
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(1, 2);
	  System.out.println("softassert testing end");
	  sa.assertTrue(true);
	  sa.assertAll();
  }
}
