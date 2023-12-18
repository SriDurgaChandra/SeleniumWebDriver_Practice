package fundmentalFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenBrowserAndLoginApp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver w = new EdgeDriver();
		w.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		WebElement emailTextbox = w.findElement(By.id("Email")); //By -> interface
		emailTextbox.clear();
		emailTextbox.sendKeys("admin@yourstore.com");
		
		WebElement passwordTextbox = w.findElement(By.id("Password"));
		passwordTextbox.clear();
		passwordTextbox.sendKeys("admin");
		
		w.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
		//Thread.sleep(5000);
		 WebElement actualTitleEle= w.findElement(By.xpath("/html/head/title"));
		 
		 String actualTitleStr = actualTitleEle.getAttribute("innerHTML");//w.getTitle();
		//String actualTitle = w.findElement(By.tagName("title")).getText();
		System.out.println("Actualtitle : " +actualTitleStr);
		String expectedTitle = "Dashboard / nopCommerce administration";
		
		if(expectedTitle.equals(actualTitleStr)) {
			System.out.println("title validation passed");
		} else {
			System.out.println("title validation failed");
		}
		
	}

}
