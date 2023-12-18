package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	WebDriver 	  driver ;

	@BeforeClass
	public void setUp() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();

	}

	@Test(dataProvider="loginDataPrd")
	public void login(String email, String password) throws InterruptedException {
		WebElement emailInpt = driver.findElement(By.id("Email"));
		emailInpt.clear();
		emailInpt.sendKeys(email);
		WebElement passwordInpt = driver.findElement(By.id("Password"));
		passwordInpt.clear();
		passwordInpt.sendKeys(password);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

		String exp_title = "nopCommerce demo store";
		String act_title = driver.getTitle();

		Assert.assertEquals(exp_title, act_title);

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@DataProvider(name="loginDataPrd", indices= {0, 1, 2, 3})
	public String[][] loginData() {
		String [][] data = {{"sri@gmail.com", "helloworld"},
				{"sri45123@gmail.com", "test@123"},
				{"abc@gmail.com", "test1@123"},
				{"sri123@gmail.com", "test@123"}
		};
		return data;
	}
}
