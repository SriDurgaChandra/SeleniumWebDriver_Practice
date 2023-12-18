package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://docs.oracle.com/javase/8/docs/api/");
		
		wd.switchTo().frame("packageListFrame");
		wd.findElement(By.linkText("java.sql")).click();
		wd.switchTo().defaultContent();// 
		wd.switchTo().frame("packageFrame");
		wd.findElement(By.linkText("SQLNonTransientException")).click();
		wd.switchTo().defaultContent();
		wd.switchTo().frame("classFrame");
		wd.findElement(By.linkText("//div[@class='bottomNav']//a[normalize-space()='Overview']")).click();
	}

}
