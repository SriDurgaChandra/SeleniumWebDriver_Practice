package scenarios;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeFullPageScreenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://demo.nopcommerce.com/");
		
		TakesScreenshot ts = (TakesScreenshot)wd;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("C:\\Users\\anith\\eclipse-workspace\\seleniumWebDriverProject\\src\\test\\java\\images\\fullScreenshot.png");
		FileUtils.copyFile(scr, trg);

	}

}
