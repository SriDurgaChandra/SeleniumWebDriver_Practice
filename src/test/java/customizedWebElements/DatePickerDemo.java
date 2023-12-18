package customizedWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) {
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://jqueryui.com/datepicker/");
		//approach1 - where senKeys() work
		wd.switchTo().frame(0);
		//wd.findElement(By.id("datepicker")).sendKeys("12/05/2023");
		
		//approach2 - without using sendKeys()
		//future date
		wd.findElement(By.id("datepicker")).click();
		String day = "12";
		String month = "December";
		String year = "2022";
		
		
		
		while(true) {
			String currentMonth = wd.findElement(By.className("ui-datepicker-month")).getText();
			String currentYear = wd.findElement(By.className("ui-datepicker-year")).getText();
			if(month.equals(currentMonth)
					&& year.equals(currentYear)) {
				break;
			}
			//wd.findElement(By.xpath("//span[.='Next']")).click(); //for future date
			wd.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //for past date
		}
		
		int rowCount = wd.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr")).size();
		System.out.println("row count :" +rowCount);
		int colCount = wd.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//thead//th")).size();
		System.out.println("col count :" +colCount);
		for(int r=1; r<rowCount;r++) {
			for(int c=1; c<colCount; c++) {
				WebElement date = wd.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr["+r+"]//td["+c+"]"));
				String val = date.getText();
				if(day.equals(val)) {
					date.click();
					break;
				}
				//System.out.println(val + "  ");
			}
			System.out.println();
		}
	}

}
