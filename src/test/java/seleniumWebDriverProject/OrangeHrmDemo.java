package seleniumWebDriverProject;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class OrangeHrmDemo {

	public static void main(String[] args) {
		
		WebDriver wd = new ChromeDriver();
		// wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//or
		wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		wd.findElement(By.name("username")).sendKeys("Admin");
		wd.findElement(By.name("password")).sendKeys("admin123");
		
		//WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.elementToBeClickable(By.tagName("button"))).click();
		
		
		FluentWait fw = new FluentWait(wd);
		fw.withTimeout(Duration.ofSeconds(30));
		fw.pollingEvery(Duration.ofSeconds(5));
		fw.ignoring(NoSuchElementException.class);
		
		
		WebElement we = (WebElement) fw.until(ExpectedConditions.elementToBeClickable(By.tagName("button")));
		we.click();
	}

}
