package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementJava {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By FirstName = By.id("input-firstname");
		By LastName = By.id("input-lastname");
		By Email = By.id("input-email");
		By Telephone = By.id("input-telephone");
		By Password = By.id("input-password");
		By ConfirmPassword = By.id("input-confirm");
		
	

	}

	
	
	
}
