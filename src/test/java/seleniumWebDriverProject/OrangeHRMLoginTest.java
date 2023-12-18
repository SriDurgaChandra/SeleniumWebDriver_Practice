package seleniumWebDriverProject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLoginTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver wd = new ChromeDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//introduce delay
		Thread.sleep(5000);
		
		//login
		wd.findElement(By.name("username")).sendKeys("Admin1");
		wd.findElement(By.name("password")).sendKeys("admin123");
		
		wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		Thread.sleep(7000);
		try {
			//validate the homepage
			String homePageStr_actual = wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
			String homePageStr_expected = "Dashboard";

			if(homePageStr_expected.equals(homePageStr_actual)) {
				System.out.println("Test Passed");
			} else {
				System.out.println("Test Failed");
			}
		} catch(NoSuchElementException e) {
			System.out.println("Login failed");
		}
		wd.quit();
	}

}
