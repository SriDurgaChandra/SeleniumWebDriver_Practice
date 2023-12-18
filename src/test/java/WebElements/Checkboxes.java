package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
		
		wd.switchTo().frame("iframeResult");
		
		
		List<WebElement> checkboxes = wd.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement checkbox : checkboxes) {
			checkbox.click();
		}
		
		//deselect last two checkboxes
		for(int i=checkboxes.size()-2; i<checkboxes.size();i++) {
			if(checkboxes.get(i).isSelected())
				checkboxes.get(i).click();
		}
		
		
		

	}

}
