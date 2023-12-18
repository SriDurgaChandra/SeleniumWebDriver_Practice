package scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowserTesting {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		//co.addArguments("--headless");
		co.addArguments("--incognito");
		WebDriver wd = new ChromeDriver(co);
		
		wd.get("https://www.google.com/");
		System.out.println(wd.getTitle());
		System.out.println(wd.getCurrentUrl());
		

	}

}
