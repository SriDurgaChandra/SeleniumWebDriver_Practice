package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethod {
	
	/**
	 * order: login, search, logout
	 *        login, advSearch, logout
	 */
	
  @BeforeMethod
  public void login() {
	  System.out.println("login......");
  }
  
  @Test
  public void search() {
	  System.out.println("search......"); 
  }
  
  @Test
  public void advSearch() {
	  System.out.println("advanced search......");
  }
  
  @AfterMethod
  public void logOut() {
	  System.out.println("log out......");
  }
}
