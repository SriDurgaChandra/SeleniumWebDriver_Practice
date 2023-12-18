package seleniumWebDriverProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectDropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
		//.findElement(By.linkText("Register")).click();
		//WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(30));
		//WebElement register_btn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-black navbar-btn']")));
		//register_btn.click();
		Thread.sleep(5000);
		WebElement selDropDown = wd.findElement(By.id("country-list"));
		Select sel = new Select(selDropDown);
		
		
		//sel.selectByVisibleText("France");
		
		//sel.selectByValue("2");
		
		//sel.selectByIndex(1);
		
		
		List<WebElement> options = sel.getOptions();
		for(WebElement op : options) {
			if("France".equals(op.getText())) {
				System.out.println(op.getText());
				op.click();
			}
		}
		
		for(int i=0; i<options.size(); i++) {
			String option = options.get(i).getText();
			if("India".equals(option)) {
				options.get(i).click();
			}
		}

	}

}
