package scenarios;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSpecificItemScreenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://demo.nopcommerce.com/");
		
		WebElement featuredPrds = wd.findElement(By.cssSelector("div.product-grid"));
		File scr = featuredPrds.getScreenshotAs(OutputType.FILE);
		File trg = new File("C:\\Users\\anith\\eclipse-workspace\\seleniumWebDriverProject\\src\\test\\java\\images\\FeaturedProductsSS.png");
		FileUtils.copyFile(scr, trg);
	}

}
