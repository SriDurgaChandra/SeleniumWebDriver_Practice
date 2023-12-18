package seleniumWebDriverProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().to("https://www.flipkart.com/");
		
		driver.navigate().back();
		System.out.println("Current page is : " +driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println("Current page is : " +driver.getCurrentUrl());
		
		driver.navigate().refresh();
		System.out.println("Current page is : " +driver.getCurrentUrl());

	}

}
