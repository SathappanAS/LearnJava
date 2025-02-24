package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebElementConcept.driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//create a webElement(FE) + perform action(click,sendKeys, isDisplayed, getText..)
		
		// 1.
		// driver.findElement(By.id("input-email")).sendKeys("tom@gmail.com");
		// driver.findElement(By.id("input-password")).sendKeys(By.id("input-password"));
		
		//2. (Reusability)
		//WebElement email=driver.findElement(By.id("input-email"));
		//WebElement password=driver.findElement(By.id("input-password"));
			
		//email.sendKeys("tom@gmail.com");
		//password.sendKeys("tom@123");
		
		//3. By locator: (Reusability and no error)
		//By emailField = By.id("input-email");
		//By pwdField = By.id("input-password");
		
		
		//WebElement email =driver.findElement(emailField);
		//WebElement passoword = driver.findElement(pwdField);	
		
		//email.sendKeys("tom@gmail.com");
		//passoword.sendKeys("tom@123");
		
		//4. By locator + generic function to get the element.
		//By emailField = By.id("input-email");
		//By pwdField= By.id("input-password");
		//		
		//getElement(emailField).sendKeys("tom@gmail.com");
		//getElement(pwdField).sendKeys("tom@123");
		
		//5.  By locator + generic function to get the element and perform actions.
				By emailField = By.id("input-email");
				By pwdField= By.id("input-password");
				
				doSendKeys(emailField,"tom@gmail.com");
				doSendKeys(pwdField,"password");
		
	}
	
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}