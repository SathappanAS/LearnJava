package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeysConcept {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement firstName=getElement(By.id("input-firstname"));
		
//		firstName.sendKeys("sathappan", " " ,"annamalai", " " , "sathappan");
		
		SendKeysCon(By.id("input-firstname"),"sathappan" , " " , "annamalai");
		
		Thread.sleep(1000);
		
		driver.close();
	}
	
	public static void SendKeysCon(By locator,CharSequence... value) {
		getElement(locator).sendKeys(value);
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
