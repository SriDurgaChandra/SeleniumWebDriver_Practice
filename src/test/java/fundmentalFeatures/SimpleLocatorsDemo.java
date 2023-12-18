package fundmentalFeatures;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleLocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		
		wd.findElement(By.linkText("Desktops")).click();
		
		wd.findElement(By.partialLinkText("PC ")).click();
		
		List<WebElement> links = wd.findElements(By.tagName("a"));
		System.out.println("Total number of links : " +links.size());
		
		for(WebElement link : links) {
			String href = link.getAttribute("href");
			System.out.println("link : "+href);
		}
		
	}

}
