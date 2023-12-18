package testNG;

import org.testng.annotations.Test;

public class Groupings {
	
  @Test(priority=2, groups= {"sanity", "regression"})
  public void login() {
	  System.out.println("login......");
  }
  
  @Test(priority=1, groups= {"sanity", "regression"})
  public void openBrowser() {
	  System.out.println("open browser......");
  }
  
  @Test(priority=3, groups= {"regression"})
  public void paymentByUPI() {
	  System.out.println("payment by upi......");
  }
  
  @Test(priority=4)
  public void paymentByCash() {
	  System.out.println("payment by cash......");
  }
  
  @Test(priority=5, groups= {"sanity"})
  public void paymentByDebitCard() {
	  System.out.println("payment by debit card......");
  }
  
  @Test(priority=6, groups= {"regression"})
  public void paymentByCreditCard() {
	  System.out.println("payment by credit card......");
  }
  
  @Test(priority=7, groups= {"sanity", "regression"})
  public void logout() {
	  System.out.println("logout......");
  }
  
}
