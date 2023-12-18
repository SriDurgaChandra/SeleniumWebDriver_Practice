package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutSelectTag {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		Thread.sleep(5000);
		wd.findElement(By.xpath("//button[contains(@class,'dropdown-toggle')]")).click();
		List<WebElement> dropDown = wd.findElements(By.xpath("//ul[contains(@class, 'multiselect')]//label"));
		
		for(WebElement option : dropDown) {
			String optText =  option.getText();
			if("Java".equals(optText) || "MS SQL Server".equals(optText)) {
				option.click();
			}
		}
		System.out.println("Automation script ends");
	}

}
