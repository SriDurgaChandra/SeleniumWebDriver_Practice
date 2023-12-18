package customizedWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicTable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wd =new ChromeDriver();
		wd.get("https://demo.opencart.com/admin/");
		
		wd.findElement(By.id("input-username")).sendKeys("demo");
		wd.findElement(By.id("input-password")).sendKeys("demo");
		wd.findElement(By.xpath("//button[@type='submit']")).click();
		WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(3));
		WebElement popUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn-close']")));
		boolean isPopUpDisplayed = popUp.isDisplayed();
		if(isPopUpDisplayed) {
			popUp.click();
		}
		
		wd.findElement(By.xpath("//a[normalize-space()='Customers'][@class='parent collapsed']")).click();
		wd.findElement(By.xpath("//ul[@id='collapse-5']//a[normalize-space()='Customers']")).click();
		
		String totalPagesTxt = wd.findElement(By.xpath("//div[contains(@class, 'text-end')][starts-with(text(), 'Showing')]")).getText();
		//Showing 1 to 10 of 16682 (1669 Pages)
		String totalPages = totalPagesTxt.substring(totalPagesTxt.indexOf('(')+1, totalPagesTxt.indexOf(" Pages"));
		System.out.println("Total pages :" +totalPages);
		JavascriptExecutor e = (JavascriptExecutor) wd;
		for(int p=1; p<=5; p++) {
			if(p>1) {
				WebElement currentPage = wd.findElement(By.xpath("//ul[@class='pagination']//a[text()="+p+"]"));
				System.out.println(currentPage.getText());
				e.executeScript("arguments[0].click();", currentPage);
				Thread.sleep(3000);
				//currentPage.click();
			}
			int rowCount = wd.findElements(By.xpath("//table//tbody//tr")).size();
			System.out.println("Total row count :"+rowCount);
			
			for(int r=1;r<=rowCount;r++) {
				String custName = wd.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
				String email = wd.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
				System.out.println(custName + "     " +email);
			}
			System.out.println("---------------------------------------------------------------------------");
		}
		
		
	}

}
