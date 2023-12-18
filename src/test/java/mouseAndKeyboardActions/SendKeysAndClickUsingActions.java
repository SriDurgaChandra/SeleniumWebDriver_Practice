package mouseAndKeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysAndClickUsingActions {

	public static void main(String[] args) {
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		
		Actions act = new Actions(wd);
		act.sendKeys(wd.findElement(By.id("Email")), "abc@gmail.com").build().perform();
		//Equivalent to calling: Actions.click(element).sendKeys(keysToSend).
		
		act.sendKeys(Keys.TAB);
		
		act.click(wd.findElement(By.xpath("//button[text()='Log in']"))).build().perform();
	}

}
