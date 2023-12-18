package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener extends TestListenerAdapter implements ITestListener{
	
	public void onTestStart(ITestResult result) {
	    System.out.println("test started........");
	  }
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("test successful........");
	  }

	public void onTestFailure(ITestResult result) {
		System.out.println("test failed........");
	  }


	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped........");
	  }

	public void onFinish(ITestContext context) {
		System.out.println("test completed........");
	  }
}
