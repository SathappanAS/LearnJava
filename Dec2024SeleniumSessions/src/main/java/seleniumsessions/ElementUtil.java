package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

	private WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		//this.global = local varialble
		this.driver=driver;
	}
	public void nullCheck(CharSequence...value) {
		if(value==null) {
			throw new RuntimeException("===value can not be null====");
		}
	}
		
	public void doSendKeys(By locator,String value) {
		nullCheck();
		getElement(locator).sendKeys(value);
	}
	
	public void doSendKeys(By locator,CharSequence... value) {
		nullCheck();
		getElement(locator).sendKeys(value);
	}
	
	public  void doClick(By locator) {
		getElement(locator).click();
	}
	
	public String doElementGetText(By locator) {
	String eleText = getElement(locator).getText();
	System.out.println("element text =>" + eleText);
	return eleText;
	}
	
	
	public  String getElementDomAttributeValue(By locator,String attrName) {
		nullCheck(attrName);
		return getElement(locator).getDomAttribute("attrName");
	}
	
	public  String getElementDomPropertyValue(By locator,String propName) {
		nullCheck(propName);
		return getElement(locator).getDomProperty("propName");
	} 
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
}
