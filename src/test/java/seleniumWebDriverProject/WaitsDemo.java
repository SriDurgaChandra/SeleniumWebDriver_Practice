package seleniumWebDriverProject;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		long start = System.currentTimeMillis (); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.getWindowHandle();
		long inter = System.currentTimeMillis (); 
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("sri");
		long end = System.currentTimeMillis (); 
		System.out.println("start - end =" +(end-start)/100 + "sec" );
		System.out.println("start - inter =" +(inter-start)/100 + "sec" );
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement passWordTxtBox =wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		passWordTxtBox.sendKeys("sri");
		
		
		FluentWait fluentWait = new FluentWait(driver);
		fluentWait.withTimeout(Duration.ofSeconds(20));
		fluentWait.pollingEvery(Duration.ofSeconds(5));
		fluentWait.ignoring(NoSuchElementException.class);
		
		
		WebElement passWord = (WebElement) fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		passWord.sendKeys("test");

	}

}
