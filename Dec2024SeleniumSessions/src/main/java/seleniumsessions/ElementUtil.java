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
	
	public void doSendKeys(By locator,String value) {
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
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
}
