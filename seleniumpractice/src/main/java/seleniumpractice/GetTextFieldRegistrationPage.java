package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldRegistrationPage {

static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement firstName=getElement(By.id("input-firstname"));
		firstName.sendKeys("Sathappan");
		
		String firstNameResult=getDomPro(By.id("input-firstname"),"value");
		System.out.println(firstNameResult);
		
		WebElement lastName = getElement(By.id("input-lastname"));
		lastName.sendKeys("Annamalai");
		
		String lastNameResult=getDomPro(By.id("input-lastname"),"value");
		System.out.println(lastNameResult);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		browserclose();
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void browserclose() {
		if(driver != null) {
			driver.close();
		}
	}
	
	public static String getDomPro(By locator, String attValue) {
		return getElement(locator).getDomProperty(attValue);
	}
	
}
