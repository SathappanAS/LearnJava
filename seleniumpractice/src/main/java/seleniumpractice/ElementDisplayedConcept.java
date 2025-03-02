package seleniumpractice;

import org.openqa.selenium.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayedConcept {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement firstName=getElement(By.id("input-firstname"));
		
		boolean b1=firstName.isDisplayed();
		System.out.println(b1);

		By fn=By.id("input-firstname11");
		
		if(isElementDisplayed(fn)) {
			System.out.println("ele is displayed -- PASS");
		}
		else {
			System.out.println("ele is not displayed -- FAIL");
		}
		
		driver.close();
	}
	
	
	public static boolean isElementDisplayed(By locator) {
		try {
		return driver.findElement(locator).isDisplayed();
		}
		catch(NoSuchElementException e) {
			System.out.println("element is not found " + locator);
			return false;
		}
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
