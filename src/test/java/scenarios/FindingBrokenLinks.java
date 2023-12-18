package scenarios;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingBrokenLinks {

	public static void main(String[] args) throws IOException {
		
		WebDriver wd = new ChromeDriver();
		wd.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links = wd.findElements(By.tagName("a"));
		int noOfBrokenLinks=0;
		for(WebElement l : links) {
			String link = l.getAttribute("href");
			if(link != null && !link.isEmpty()) {
				try {
				URL url = new URL(link);
				HttpURLConnection httpConn = (HttpURLConnection)url.openConnection();
				httpConn.connect();
				
				int responseCode = httpConn.getResponseCode();
				if(responseCode >= 400) {
					System.out.println("Link: " + link +" is broken");
					noOfBrokenLinks++;
				} else {
					System.out.println("Link: " + link +" is not broken");
				}
				} catch(Exception e) {
					e.printStackTrace();
					continue;
				}
			}
		}
		System.out.println("Total no. of broken links : " +noOfBrokenLinks);
	}

}
