package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementEnabledDisabledSelected {
	static WebDriver driver;
	public static void main(String[] args)  {
		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		WebElement password = driver.findElement(By.id("pass"));
		
		boolean f1=password.isDisplayed();
		System.out.println(f1); //true
		boolean f2=password.isEnabled();
		System.out.println(f2); //false
		
		
		driver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement privacyCheckBox = driver.findElement(By.name("agree"));
		System.out.println(privacyCheckBox.isSelected()); //false
		privacyCheckBox.click();
		System.out.println(privacyCheckBox.isSelected()); //true
		driver.quit();
	}
	

}