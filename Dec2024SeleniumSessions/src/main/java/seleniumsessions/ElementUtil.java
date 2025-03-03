package seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

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
	
	public boolean isElementDisplayed(By locator) {
		try {
			return getElement(locator).isDisplayed();
		} 
		catch (NoSuchElementException e) {
			System.out.println("element is not present on the page using : " + locator);
			return false;
		}
	}
		
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	//***************find Elements Utils*********//
	public  List<String> getElementTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>(); //TopCasting //Physical capacity =0
		//List - interface
		//Top casting - child class object is referred by parent class interface
		//Good pratice - always top cast with the interface 
		//Physical capaciy(PC) = 0
		//We can't use staticArray - Because we need to provide the size
		for ( WebElement e : eleList) {
			String text=e.getText();
			if(text.length()!=0) {
				System.out.println(text);
				eleTextList.add(text);
			}}
		return eleTextList;
	}
	
	
	public  int getElementsCount(By locator) {
		int elecount=getElements(locator).size();
		System.out.println("element count ==>" + elecount);
		return elecount;
	}
	
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);	
	}
	
	
}
