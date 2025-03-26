package seleniumsessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserMultipleWindowHandle {

	// abc.com---> 4 tabs==> 5 tabs/windows

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/30-day-free-trial");// parent

		String parentWindowId = driver.getWindowHandle(); // partent id

		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();

		WebElement fb_ele = driver.findElement(By.xpath("//img[@alt='facebook logo']"));
		WebElement li_ele = driver.findElement(By.xpath("//img[@alt='linkedin logo']"));
		WebElement yt_ele = driver.findElement(By.xpath("//img[@alt='youtube logo']"));

		fb_ele.click();
		li_ele.click();
		yt_ele.click();

		Set<String> handles = driver.getWindowHandles();
		// set is another interface in java
		// set is order less collection, doesnot maintain any index
		// it always maintain the unique values and it can't have the duplicate value

		Iterator<String> it = handles.iterator();
		// Iterator is another interface in java

		while (it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			System.out.println(driver.getTitle());
			Thread.sleep(1500);
			if (!windowId.equals(parentWindowId)) {
				driver.close();
			}
		}

		// driver is lost
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window title:" + driver.getTitle());

	}
}