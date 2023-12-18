package WebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownWithDisappearingOptions {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver wd = new ChromeDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wd.manage().window().maximize();
		//introduce delay
		Thread.sleep(5000);
		
		//login
		wd.findElement(By.name("username")).sendKeys("Admin");
		wd.findElement(By.name("password")).sendKeys("admin123");
		
		wd.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='PIM']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//i[@class='oxd-icon bi-caret-up-fill oxd-select-text--arrow'])[1]"))).click();
		
		List<WebElement> options = wd.findElements(By.xpath("//div[@role='listbox']//span"));
		
		for(WebElement e : options) {
			String option = e.getText();
			if("Full-Time Permanent".equals(option)) {
				e.click();
			}
		}

	}

}
