package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver=brUtil.initDriver("chrome");
		
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailField = By.id("input-email");
		By pwdField= By.id("input-password");
		
		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.doSendKeys(emailField, "tom@gmail.com");
		elUtil.doSendKeys(pwdField, "password");	
	}	
}