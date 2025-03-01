package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysConcept {
	static WebDriver driver;
	public static void main(String[] args) {
			// webElemet --> sendKeys
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		/*sendKeys method is coming from CharSequence*/
		/*String, StringBuffer, StringBuilder*/
		String FN = "Testing";
		String LN = "Automation";
		StringBuilder sb= new StringBuilder("selenium");
		StringBuilder sbf= new StringBuilder("Learning");
		firstName.sendKeys(FN, " " ,LN,sb,sbf);
		//charsequence behaving like an array.....
		driver.quit();
		
	}

}
