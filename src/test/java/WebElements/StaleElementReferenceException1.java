package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		
		By by = By.id("Email");
		WebElement email = driver.findElement(by);
		email.sendKeys("abc@123@gmail.com");
		
		driver.navigate().refresh();
		
		email.clear();

	}

}
