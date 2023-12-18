package inbuiltMethodUtilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(7));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.ignoring(NoSuchFrameException.class);
		wait.withMessage("Element not found with the given time ");
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//frame[@src='frame_1.html']")));
		
		driver.findElement(By.name("mytext1")).sendKeys("frame1........");


	}

}
