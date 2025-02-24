package seleniumsessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AttributeConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		
		//getAttribute - Deprecated
		//String placeholderVal = firstName.getAttribute("placeholder");
		//System.out.println(placeholderVal);
		
		String placeholderVal = firstName.getDomAttribute("placeholder");
		System.out.println(placeholderVal);

	}

}
