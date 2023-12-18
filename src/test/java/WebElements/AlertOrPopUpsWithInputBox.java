package WebElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertOrPopUpsWithInputBox {

	public static void main(String[] args) {
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		wd.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
		
		Alert alert = wd.switchTo().alert();
		alert.sendKeys("Welcome");
		
		alert.accept();
		alert.getText();
		
		String completeExpectedTxt = wd.findElement(By.xpath("//p[@id='result']")).getText();
		if(completeExpectedTxt != null) {
			String[] expectedTxtArr = completeExpectedTxt.split(": ");
			String expectedTxt = expectedTxtArr[1];
			String actTxt = "Welcome";
			if(expectedTxt.equals(actTxt)) {
				System.out.println("Alert txt validation passed");
			} else {
				System.out.println("Alert txt validation failed");
			}
		}
	}

}
