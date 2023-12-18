package inbuiltMethodUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) {
		
		WebDriver wd = new ChromeDriver();
		wd.navigate().to("https://www.amazon.in/");
		System.out.println(wd.getCurrentUrl());
		wd.navigate().to("https://www.flipkart.com/");
		System.out.println(wd.getCurrentUrl());
		wd.navigate().back();
		System.out.println(wd.getCurrentUrl());
		wd.navigate().forward();
		System.out.println(wd.getCurrentUrl());
		wd.navigate().refresh();
		System.out.println(wd.getCurrentUrl());
		
	}

}
