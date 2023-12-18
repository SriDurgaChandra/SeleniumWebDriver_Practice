package WebElements;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertOrPopUpsWithOKAndCancel {

	public static void main(String[] args) {
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		wd.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
		
		
		WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(3));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent()); //alertIsPresent() , internally calls wd.switchTo().alert()
		//Alert alert = wd.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
	}

}
