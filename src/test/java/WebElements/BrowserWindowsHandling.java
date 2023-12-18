package WebElements;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		wd.manage().window().maximize();
		Thread.sleep(5000);
		wd.findElement(By.xpath("//a[.='OrangeHRM, Inc']")).click();
		Set<String> windHandles = wd.getWindowHandles();

		//Approach1	  
		List<String> winHandlesList = new ArrayList<String>(windHandles);
		String parentWindHandle = winHandlesList.get(0);
		String childWindHandle = winHandlesList.get(1);
		Thread.sleep(8000);
		System.out.println(parentWindHandle);
		System.out.println(childWindHandle);
		wd.switchTo().window(childWindHandle);
		System.out.println(wd.getWindowHandle());
		wd.findElement(By.xpath("(//button[.='Contact Sales'])[2]")).click();

		wd.switchTo().window(parentWindHandle);
		wd.findElement(By.name("username")).sendKeys("Admin");
		wd.findElement(By.name("password")).sendKeys("admin123");
		wd.findElement(By.xpath("//button[normalize-space() ='Login']")).click();


		//Approach2
		for(String id : windHandles) {
			String pageTitle = wd.switchTo().window(id).getTitle();
			if("OrangeHRM HR Software | OrangeHRM".equals(pageTitle)) {
				wd.findElement(By.xpath("(//button[.='Contact Sales'])[2]")).click();
				wd.close();//closing the required browser window.
			}
		}
		
		
		
	}

}
