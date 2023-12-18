package inbuiltMethodUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
/**
conditional commands - access these commands thorugh WebElement
----------------------
Returns true/false ( boolean values)

isDisplayed()
isEnabled()
isSelected() -> for radio btns, select drop downs, check boxes
 * @param args
 */
	public static void main(String[] args) {
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		WebElement logo = wd.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		if(logo.isDisplayed()) {
			System.out.println("logo validation passed");
		} else {
			System.out.println("logo validation failed");
		}
		
		boolean isSearchBoxEnabled = wd.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
		System.out.println("Is search box enabled: " +isSearchBoxEnabled);
		
		WebElement radioMale = wd.findElement(By.xpath("//input[@id='gender-male']"));
		boolean isMaleRadioBtnSelected = radioMale.isSelected();
		System.out.println("Is male radio btn selected ? "+isMaleRadioBtnSelected);
		radioMale.click();
		isMaleRadioBtnSelected = radioMale.isSelected();
		System.out.println("Is male radio btn selected ? "+isMaleRadioBtnSelected);
	}

}
