package seleniumWebDriverProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.amazon.in/ref=nav_logo");
		
		wd.findElement(By.id("twotabsearchtextbox")).sendKeys("g4free umbrella");
		wd.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(5000);
		
		wd.findElement(By.linkText("Sell on Amazon")).click();
		
		Thread.sleep(2000);
		//wd.findElement(By.partialLinkText("COVID-19")).click();
		
		int imgCount = wd.findElements(By.tagName("img")).size();
		System.out.println("Total number of images = " +imgCount);
		
		wd.quit();
	}

}
