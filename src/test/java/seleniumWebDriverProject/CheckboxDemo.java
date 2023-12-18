package seleniumWebDriverProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver wd = new ChromeDriver();
		wd.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
		//Thread.sleep(3000);
		wd.switchTo().frame("iframeResult");
		
		//wd.findElement(By.xpath("//input[@type='checkbox']")).click();
		List<WebElement> checkBoxes = wd.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("no. of checkboxes-"  +checkBoxes.size());
		for(int i=0; i<checkBoxes.size(); i++) {
			checkBoxes.get(i).click();
		}
		System.out.println("Test ended");
		
		//uncheck
		for(WebElement checkbox : checkBoxes) {
			if(checkbox.isSelected())
				checkbox.click();
		}
		
		//select last two checkboxes
		for(int i=checkBoxes.size()-2; i<checkBoxes.size();i++) {
			checkBoxes.get(i).click();
		}
		
	}

}
