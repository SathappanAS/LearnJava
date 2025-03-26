package seleniumsessions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserBlankWindowTab {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String PWID = driver.getWindowHandle();
		
		//selenium 4.x:
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());//google
		driver.close();
		
		driver.switchTo().window(PWID);
		
		System.out.println(driver.getTitle());//open cart
		
		
	}

}