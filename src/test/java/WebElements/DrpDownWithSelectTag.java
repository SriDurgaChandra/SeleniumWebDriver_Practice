package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DrpDownWithSelectTag {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		wd.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
		WebElement dropDown = wd.findElement(By.id("country-list"));
		dropDown.click();
		Select sel = new Select(dropDown);
		
		for(WebElement o : sel.getOptions()) {
			if("France".equals(o.getText())) {
				o.click();
			}
		}
		
		Thread.sleep(3000);
		
		//select using inbuilt methods
		sel.selectByVisibleText("India");
		Thread.sleep(3000);
		sel.selectByIndex(0);
		Thread.sleep(3000);
		sel.selectByValue("5");
	}

}
