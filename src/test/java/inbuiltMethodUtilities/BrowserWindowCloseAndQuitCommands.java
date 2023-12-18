package inbuiltMethodUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowCloseAndQuitCommands {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		wd.findElement(By.xpath("//a[.='OrangeHRM, Inc']")).click();
		
		//wd.close();
		wd.quit();
	}

}
