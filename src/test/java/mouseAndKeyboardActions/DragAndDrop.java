package mouseAndKeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://jqueryui.com/droppable/");
		
		Actions act = new Actions(wd);
		wd.switchTo().frame(0);
		WebElement source = wd.findElement(By.id("draggable"));
		WebElement target = wd.findElement(By.id("droppable"));
		
		//act.dragAndDrop(source, target).build().perform();
		act.clickAndHold(source).moveToElement(target).release().build().perform();
	}

}
