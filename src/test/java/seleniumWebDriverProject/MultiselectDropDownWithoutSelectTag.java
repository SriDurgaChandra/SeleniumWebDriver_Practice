package seleniumWebDriverProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDropDownWithoutSelectTag {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		wd.manage().window().maximize();
		/**
		 * WebElement selOptions = wd.findElement(By.id("option-droup-demo"));
		Select sel = new Select(selOptions);
		
		List<WebElement> options = sel.getOptions();
		for(WebElement option : options) {
			System.out.println(option.getText());
		}
		 * 
		 */
		
		wd.findElement(By.xpath("//button[contains(@class, 'multiselect')]")).click();
		Thread.sleep(6000);
		List<WebElement> options = wd.findElements(By.xpath("//ul[contains(@class, 'multiselect')]//label"));
		
		for(WebElement option : options) {
			String op = option.getText();
			if("Java".equals(op) || "Python".equals(op)) {
				option.click();
				Thread.sleep(6000);
			}
		}
		
		
	}

}
