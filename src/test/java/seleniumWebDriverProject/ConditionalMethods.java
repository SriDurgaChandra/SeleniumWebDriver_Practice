package seleniumWebDriverProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		
		WebElement logoImg = wd.findElement(By.xpath("//div[@id='logo']"));
		System.out.println("Is logo present ? " +logoImg.isDisplayed());
		
		WebElement newsLetterRadioBtn = wd.findElement(By.xpath("//input[@id='input-newsletter-no']"));
		System.out.println("Is radio btn selected ?"  +newsLetterRadioBtn.isSelected());
		
		
		//newsLetterRadioBtn.click();
		//System.out.println("Is radio btn selected ?"  +newsLetterRadioBtn.isSelected());
		
		WebElement inputBox = wd.findElement(By.xpath("//input[@id='input-firstname']"));
		System.out.println("Is textbox enabled?" +inputBox.isEnabled());
	}

}
