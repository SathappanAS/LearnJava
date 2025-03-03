package seleniumsessions;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUseCases {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//		WebElement ele = driver.findElement(By.id("input-email"));
		//		NoSuchElementException
		
		//		List<WebElement> eleList = driver.findElements(By.className("test-naveen"));
		//		System.out.println(eleList);
		//		System.out.println(eleList.size());
		
		//		List<WebElement> eleList = driver.findElements(By.id("input-email"));
		//		System.out.println(eleList.size());
	
		By emailid=By.id("input-email"); //true
		
		System.out.println(checkElementDisplayed(emailid));
		
		By forgotPwdLink = By.linkText("Forgotten Password");
		
		if(checkElementDisplayed(forgotPwdLink, 2)) {
			System.out.println("forgot pwd is coming 2 times on the page");
		}
		
		
		driver.close();
		
	}
	
	public static boolean checkElementDisplayed(By locator) {
		if(getElements(locator).size()==1) {
			System.out.println("element :" + locator + " is displayed on the page one time ");
			return true;
		}
		return false;
	}
	
	public static boolean checkElementDisplayed(By locator, int expElementCount) {
		if(getElements(locator).size() == expElementCount) {
			System.out.println("element : " + locator + " is displayed on the page "+ expElementCount + " times");
			return true;
		}
		return false;
	}
	
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);	
	}
	
}