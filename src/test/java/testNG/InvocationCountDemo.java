package testNG;

import org.testng.annotations.Test;

public class InvocationCountDemo {
  @Test(invocationCount=10)// when a feature is not stable and fails sometimes, then we do exhaustive testing using invocationCount
  public void f() {
	  System.out.println("testing........");
  }
}
