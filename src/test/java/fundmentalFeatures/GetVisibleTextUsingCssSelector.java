package fundmentalFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetVisibleTextUsingCssSelector {

	public static void main(String[] args) {
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		
		String text = wd.findElement(By.cssSelector("button[type='submit'][class='button-1 login-button']")).getText();
		System.out.println(text);
	}

}
