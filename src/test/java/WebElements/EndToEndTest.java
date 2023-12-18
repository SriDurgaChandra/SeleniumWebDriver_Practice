package WebElements;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEndTest {

	public static void main(String[] args) {
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://blazedemo.com/reserve.php");
		//sort prices
		List<WebElement> prices = wd.findElements(By.xpath("//table//tbody//td[6]"));
		String [] pricesStr = new String[prices.size()];
		for(int i=0; i<prices.size(); i++) {
			String price = prices.get(i).getText().replace("$", "");
			pricesStr[i] = price;
		}
		Arrays.sort(pricesStr);
		System.out.println(Arrays.toString(pricesStr));
		
		//get the location of 'choose the loc' button corresponding to low price
		int rowCount = wd.findElements(By.xpath("//table//tbody//tr")).size();
		for(int r=1; r<=rowCount; r++) {
			String p = wd.findElement(By.xpath("//table//tbody//tr["+r+"]//td[6]")).getText().replace("$", "");
			if(p.equals(pricesStr[0])) {
				wd.findElement(By.xpath("//table//tbody//tr["+r+"]//td[1]")).click();
				break;
			}
		}
		
	}
}
