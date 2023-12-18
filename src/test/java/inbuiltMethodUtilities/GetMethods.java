package inbuiltMethodUtilities;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	/**
	get methods  - we can these methods through webdriver instance
  ----------
	get(url)
	getTitle()
	getCurrentURL()
	getPageSource()
	getWindowHandle()
	getwindowHandles()
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String title = wd.getTitle();
		System.out.println("Title : "+title);
		
		String url = wd.getCurrentUrl();
		System.out.println("Url :" +url);
		
		
		String pageSrc = wd.getPageSource();
		//System.out.println(pageSrc);
		
		String windHandle = wd.getWindowHandle();
		System.out.println("Window handle : " +windHandle);
		Thread.sleep(3000);
		wd.findElement(By.xpath("//a[.='OrangeHRM, Inc']")).click();
		
		Set<String> windHandles = wd.getWindowHandles();

		for(String windID : windHandles) {
			System.out.println(windID);
		}
		
		
	}

}
