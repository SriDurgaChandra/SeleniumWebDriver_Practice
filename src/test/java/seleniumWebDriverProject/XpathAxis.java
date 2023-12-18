package seleniumWebDriverProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxis {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
		//self
		WebElement selfNode = driver.findElement(By.xpath("//a[normalize-space()='NIIT Ltd.']/self::*"));
		
		System.out.println("Self node text : " +selfNode.getText());
		
		//parent
		WebElement parentNode = driver.findElement(By.xpath("//a[normalize-space()='NIIT Ltd.']/parent::*"));
		System.out.println("parent node is " +parentNode.getTagName());
		
		//child
		List<WebElement> childNodes = driver.findElements(By.xpath("//a[normalize-space()='NIIT Ltd.']/ancestor::tr/child::*"));
		System.out.println("no of child nodes = " +childNodes.size());
		
		//descendant and ancestor
		List<WebElement> descendantNodes = driver.findElements(By.xpath("//a[normalize-space()='NIIT Ltd.']/ancestor::tr/descendant::*"));
		System.out.println("no of descendant nodes : " + descendantNodes.size());
		
		//following
		List<WebElement> followingNodes = driver.findElements(By.xpath("//a[normalize-space()='NIIT Ltd.']/ancestor::tr/following::*"));
		System.out.println("No of following nodes : " +followingNodes.size());
		
		//followingSibling
		List<WebElement> followingSibling = driver.findElements(By.xpath("//a[normalize-space()='NIIT Ltd.']/ancestor::tr/following-sibling::*"));
		System.out.println("No of following sibling nodes :" + followingSibling.size());
		
		//preceding
		////a[normalize-space()='NIIT Ltd.']/ancestor::tr/preceding::*
		
		//preceding-sibling
		////a[normalize-space()='NIIT Ltd.']/ancestor::tr/preceding-sibling::*
		
		


	}

}
