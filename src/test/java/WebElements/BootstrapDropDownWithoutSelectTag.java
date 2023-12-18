package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDownWithoutSelectTag {

	public static void main(String[] args) {
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.codehim.com/demo/bootstrap-multiselect-dropdown/");
		wd.manage().window().maximize();
		//JavascriptExecutor  je = (JavascriptExecutor) wd;
		wd.findElement(By.xpath("//select[@id='example-multiple-optgroups']/following-sibling::div/child::button")).click();
		//je.executeScript("arguments[0].click();", btn);
		
		List<WebElement> lists = wd.findElements(By.xpath("//select[@id='example-multiple-optgroups']/following-sibling::div/descendant::label"));
		for(WebElement e : lists) {
			String txt = e.getText();
			System.out.println(txt);
			if(txt.equals("Option 1.1")) {
				e.click();
				break;
			}

		}
	}

}
