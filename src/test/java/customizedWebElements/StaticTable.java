package customizedWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		WebDriver wd = new ChromeDriver();
		wd.get("https://testautomationpractice.blogspot.com/");
		//rows count
		List<WebElement> rows = wd.findElements(By.xpath("//table[@name='BookTable']//tr"));
		//or
		//wd.findElements(By.tagName("tr")); // if there is only one table in the page.
		System.out.println("Total no. of rows : " +rows.size());
		
		
		//columns count
		int colSize = wd.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Total no. of columns : " +colSize);
		
		
		//print all the table values
		//List<WebElement> colVal = wd.findElements(By.xpath("//table[@name='BookTable']//tr//td"));
		
		
		for(int i=2;i<=rows.size();i++) {
			for(int j=1; j<=colSize; j++) {
				String val = wd.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(val + " ");
			}
			System.out.println();
		}
		
		//print book names whose author is amit
		for(int r=2;r<=rows.size();r++) {
			String val = wd.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			if("Amit".equals(val)) {
				String bookName = wd.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(bookName);
			}
		}
		
		//sum of prices
		int sum = 0;
		for(int r=2;r<=rows.size();r++) {
			String val = wd.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			int price = Integer.parseInt(val);
			sum = sum+price;
		}
		System.out.println(sum);
	}

}
