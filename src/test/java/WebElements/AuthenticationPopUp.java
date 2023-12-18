package WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) {
		
		WebDriver wd = new ChromeDriver();
		//https://the-internet.herokuapp.com/
		//https://admin:admin@the-internet.herokuapp.com/
		wd.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
