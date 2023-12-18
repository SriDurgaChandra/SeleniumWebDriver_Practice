package fundmentalFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SplitText {

	public static void main(String[] args) {
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.freshworks.com/");
		
		String text = wd.findElement(By.xpath("//h1[contains(text(), 'easy software')]")).getText();
		System.out.println(text);
	}

}
