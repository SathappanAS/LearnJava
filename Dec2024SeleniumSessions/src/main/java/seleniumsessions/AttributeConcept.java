package seleniumsessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AttributeConcept {
	static WebDriver driver;
	public static void main(String[] args) {
	
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		
		//getAttribute - Deprecated
		//String placeholderVal = firstName.getAttribute("placeholder");
		//System.out.println(placeholderVal);
		
		String placeholderVal = firstName.getDomAttribute("placeholder");
		System.out.println(placeholderVal);
		
		//webelement
		//1. attribute
		//2. property
		
		String tagName=firstName.getDomProperty("tagName");
		System.out.println(tagName);
		
		String isDisabled = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]")).getDomProperty("diabled");
		System.out.println(isDisabled);
		
		String defaultValue = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]")).getDomProperty("defaultValue");
		System.out.println(defaultValue);	
	}
	
//	public static String getElementDomAttributeValue(By locator,String attrName) {
//		return getElement(locator).getDomAttribute("attrName");
//	}
//	
//	public static String getElementDomPropertyValue(By locator,String propName) {
//		return getElement(locator).getDomProperty("propName");
//	} 
//	
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}	
}