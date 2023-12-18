package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestionDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.google.com/");
		
		wd.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Selenium");
		
		Thread.sleep(3000);//wait till auto suggestions load
		List<WebElement> suggestions = wd.findElements(By.xpath("//div[contains(@class,'wM6W7d')]//span"));
		
		for(WebElement suggestion : suggestions) {
			String s = suggestion.getText();
			if("selenium tutorial".equals(s)) {
				suggestion.click();
				break;
			}
			System.out.println(s);
		}
	}

}
