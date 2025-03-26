package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserWindowPopUpHandling {

	public static void main(String[] args) throws InterruptedException {

		// window handler api: tab/window: browser window pop up
		// url, title, webelements

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial"); // parent window

		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();

		driver.findElement(By.linkText("OrangeHRM")).click();// child

		// 1ST : fetch the window IDs
		Set<String> handles = driver.getWindowHandles();
		// set is another interface in java
		// set is order less collection, doesnot maintain any index
		// it always maintain the unique values and it can't have the duplicate value
		Iterator<String> it = handles.iterator();
		// Iterator is another interface in java

		String parentWindowID = it.next();
		System.out.println("parent window id: " + parentWindowID);

		String childWindowID = it.next();
		System.out.println("child window id: " + childWindowID);

		// 2nd: switching work:
		driver.switchTo().window(childWindowID);
		System.out.println("child window title : " + driver.getTitle());

		Thread.sleep(4000);
		// close the child window:
		driver.close();

		// driver is lost:

		// switch back to parent window:
		driver.switchTo().window(parentWindowID);
		System.out.println("parent window title : " + driver.getTitle());

		// driver.quit();

	}

}
