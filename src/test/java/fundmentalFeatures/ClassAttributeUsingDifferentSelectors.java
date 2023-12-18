package fundmentalFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * When class has multiple attribute parts ex: form-control private-form__control login-email
 * @author anith
 *
 */
public class ClassAttributeUsingDifferentSelectors {

	public static void main(String[] args) {
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://app.hubspot.com/login?hubs_signup-url=www.hubspot.com/products/crm&hubs_signup-cta=homepage-nav-login&hubs_content=www.hubspot.com/products/crm&hubs_content-cta=homepage-nav-login");
		
		//class selector (When there are multiple attribute values, only one class value can be used.
		//to use multiple class attribute values , use css or xpath selectors.)
		wd.findElement(By.className("login-email")).sendKeys("abc@gmail.com");
		
		//xpath selector
		wd.findElement(By.xpath("//input[@class='form-control private-form__control login-email']")).sendKeys("xyz@gmail.com");
		//or
		wd.findElement(By.xpath("//input[contains(@class, 'login-email')]")).sendKeys("cdf@gmail.com");
		
		//css selector
		WebElement email = wd.findElement(By.cssSelector("input[class='form-control private-form__control login-email']"));
		email.clear();
		email.sendKeys("Hello123@gmail.com");
		//or
		wd.findElement(By.cssSelector("input[class$='login-email']")).sendKeys("hellwe@gmail.com");
		

	}

}
