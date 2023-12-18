package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver wd;
	
  @BeforeClass
  public void openBrowser() throws InterruptedException {
	  wd = new ChromeDriver();
	  wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(10000);
  }
  
  
  @Test
  public void login() {
	  wd.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  wd.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  wd.findElement(By.xpath("//button[normalize-space()='Login']")).click();
  }
  
  @AfterClass
  public void close() {
	  wd.quit();
  }
}
