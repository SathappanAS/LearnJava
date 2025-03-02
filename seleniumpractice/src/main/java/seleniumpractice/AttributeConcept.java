package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeConcept {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement firstName = getElement(By.id("input-firstname"));
		String tagName = firstName.getDomAttribute("placeholder"); //First Name
		System.out.println(tagName);
		
		WebElement baseURL = getElement(By.xpath("/html/body/header/div/div/div[1]/div/a/img"));
		String baseURI = baseURL.getDomProperty("baseURI"); //https://naveenautomationlabs.com/opencart/
		System.out.println(baseURI);
		
		//WebElement --> 1. Attribute && 2. property
		quitBrowser();	
	}

	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String getDomValue(By locator, String attrName) {
		return driver.findElement(locator).getDomAttribute(attrName);
	}
	
	public static void quitBrowser() {
		if (driver != null) {
			driver.quit();
			System.out.println("browser is closed");
		}
	}
	
}
