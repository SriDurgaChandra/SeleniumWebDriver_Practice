package mouseAndKeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {

	public static void main(String[] args) {
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		
		JavascriptExecutor je = (JavascriptExecutor)wd;
		//click using jse
		je.executeScript("arguments[0].click();", wd.findElement(By.xpath("//button[text()='Log in']")));

		//draw border
		je.executeScript("arguments[0].style.border='3px solid red'", wd.findElement(By.id("Email")));
		//scroll
		je.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		//get titleof page
		String title = je.executeScript("return document.title").toString();
		System.out.println(title);
		
		//scroll into view
		je.executeScript("arguments[0].scrollIntoView(true)", wd.findElement(By.xpath("//button[text()='Register']")));
		
		//sendKeys using jse
		je.executeScript("document.getElementById('Email').value='abc@123@gmail.com'");
	}

}
