package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazonElementUtil {

	 WebDriver driver;
	
	public amazonElementUtil(WebDriver driver) {
		this.driver=driver;
	}
	 
	public String doGetElementText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
