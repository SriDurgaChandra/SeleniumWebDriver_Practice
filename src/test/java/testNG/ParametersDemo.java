package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {
	
	WebDriver wd;
	
  @BeforeClass
  @Parameters({"browser", "url"})
  public void setUp(String br, String url) {
	  if("chrome".equals(br)) {
		  wd = new ChromeDriver();
	  } else if("edge".equals(br)) {
		  wd = new EdgeDriver();
	  } else {
		  wd = new FirefoxDriver();
	  }
	 
	  wd.get(url);
  }
  
  @Test
  public void isLogoDisplayed() {
	  try {
	  By logo = By.xpath("//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']");
	  WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(10));
	  boolean isLogoDisplayed = wait.until(ExpectedConditions.visibilityOfElementLocated(logo)).isDisplayed();
	  Assert.assertEquals(isLogoDisplayed, true);
	  } catch(Exception e) {
		  Assert.fail();
	  }
	 
  }
  
  @Test
  public void titleValidation() {
	  Assert.assertEquals(wd.getTitle(), "OrangeHRM");
	  
  }
  
  @AfterClass
  public void tearDown() {
	  wd.quit();
  }
}
