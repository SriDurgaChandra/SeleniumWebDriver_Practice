package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementExceptionDemo {

	public static void main(String[] args) {
		//
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://ui.vision/demo/webtest/frames/");
		
		WebElement frame3 = wd.findElement(By.xpath("//frame[@src='frame_3.html']"));
		wd.switchTo().frame(frame3);
		wd.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("frame3.....");
		
		wd.switchTo().frame(0);
		wd.findElement(By.xpath("//span[.='I am a human']")).click();
		
		wd.switchTo().frame(frame3);//throws org.openqa.selenium.StaleElementReferenceException
	}

}
