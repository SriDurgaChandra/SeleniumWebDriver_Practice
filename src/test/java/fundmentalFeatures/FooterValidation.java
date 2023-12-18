package fundmentalFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterValidation {

	public static void main(String[] args) {
		
		WebDriver w = new ChromeDriver();
		w.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		List<WebElement> footerHeadingsEle = w.findElements(By.xpath("//div[@class='footer-upper']/descendant::strong"));
		List<String> act_headers = new ArrayList<String>();
		for(WebElement e : footerHeadingsEle) {
			String heading = e.getText();
			System.out.println(heading);
			act_headers.add(heading);
		}
		
		List<String> exp_headers = new ArrayList<String>();
		exp_headers.addAll(Arrays.asList("Information", "Customer service", "My account", "Follow us", "Newsletter"));
		
		if(act_headers.containsAll(exp_headers)) {
			System.out.println("Header validation passed");
		} else {
			System.out.println("Header validation failed");
		}
	}

}
