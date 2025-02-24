package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPageTest {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver=brUtil.initBrowser("chrome");

		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By FirstName = By.id("input-firstname");
		By LastName = By.id("input-lastname");
		By Email = By.id("input-email");
		By Telephone = By.id("input-telephone");
		By Password = By.id("input-password");
		By ConfirmPassword = By.id("input-confirm");
		
		ElementUtil elUtil=new ElementUtil(driver);
		elUtil.doSendKeys(FirstName, "Sathappan");
		elUtil.doSendKeys(LastName, "Annamalai");
		elUtil.doSendKeys(Email, "sathappan.a.s@gmail.com");
		elUtil.doSendKeys(Telephone, "9940213455");
		elUtil.doSendKeys(Password, "testing");
		elUtil.doSendKeys(ConfirmPassword, "testing");
		
		brUtil.quitBrowser();
		
		
	}

}
