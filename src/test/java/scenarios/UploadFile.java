package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		WebElement chooseFile = driver.findElement(By.xpath("//input[@name='upfile']"));
		//chooseFile.click();
		chooseFile.sendKeys("C:\\Users\\anith\\Downloads\\Day31.txt");
		driver.findElement(By.xpath("//input[@value='Press']")).click();

	}

}
