package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementClick {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		ElementUtil elUtil = new ElementUtil(driver);
		
		//create web element + action(click)
		//button, link, checkbox, radiobutton, image
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("agree")).click();
		
		By registerLink=By.linkText("Register");
		By agreeCheckBox=By.name("agree");
		
		elUtil.doClick(registerLink);
		elUtil.doClick(agreeCheckBox);
		
		
	}
	
//	public static void doClick(By locator) {
//		getElement(locator).click();
//	}
	
	
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}

}
