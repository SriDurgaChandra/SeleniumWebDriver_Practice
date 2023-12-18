package inbuiltMethodUtilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(1));
		List<WebElement> socialMediaLinks = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("ul.networks a")));
		
		for(WebElement s : socialMediaLinks) {
			String txt = s.getText();
			System.out.println(txt);
		}
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(2));
		boolean urlValidation = wait1.until(ExpectedConditions.urlToBe("https://demo.nopcommerce.com/register?returnUrl=%2F"));
		System.out.println("Url validation : "+urlValidation);
		
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("alert('This is an alert!')");
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(2));
		Alert alert = wait2.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert.getText());
		alert.accept();

	}

}
