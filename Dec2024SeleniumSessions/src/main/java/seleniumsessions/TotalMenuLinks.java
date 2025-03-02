package seleniumsessions;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class TotalMenuLinks {


	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		List<WebElement> menuLinksList = driver.findElements(By.className("list-group-item"));
		System.out.println(menuLinksList.size());

		
		
		driver.close();
	}

}
