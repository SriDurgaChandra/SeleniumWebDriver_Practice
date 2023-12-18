package seleniumWebDriverProject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println("Title of page :"+driver.getTitle());
		
		System.out.println("url of current webpage :" +driver.getCurrentUrl());
		
		System.out.println("page source code contains template tag...............\n" + driver.getPageSource().contains("template"));
	
		Thread.sleep(5000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		String currentWinID = driver.getWindowHandle();
		System.out.println(currentWinID);
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		for(String winID : windowIDs)  {
			System.out.println(winID);
		}
	}

}
