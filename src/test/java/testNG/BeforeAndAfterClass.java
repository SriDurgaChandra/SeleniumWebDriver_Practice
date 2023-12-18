package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAndAfterClass {
	/**
	 * order : login, search, advSearch, logout
	 */

	 @BeforeClass
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
	  
	  @AfterClass
	  public void logOut() {
		  System.out.println("log out......");
	  }
  
}
