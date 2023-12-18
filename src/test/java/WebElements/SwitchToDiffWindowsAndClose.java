package WebElements;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToDiffWindowsAndClose {

	public static void main(String[] args) {
		
		WebDriver wd =  new ChromeDriver();
		wd.get("https://testautomationpractice.blogspot.com/");
		
		wd.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("selenium");
		wd.findElement(By.className("wikipedia-search-button")).click();
		
		List<WebElement> links = wd.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']/descendant::a"));
		System.out.println(links.size());
		for(WebElement l : links) {
			l.click();
			//wd.switchTo().window(wd.getWindowHandle()); //by default driver points to parent page
		}
		
		Set<String> windIDs = wd.getWindowHandles();
		for(String windID : windIDs) {
			wd.switchTo().window(windID);
			//if(!"Automation Testing Practice".equals(wd.getTitle())) {
				wd.close();
			//}
		}
	}

}
