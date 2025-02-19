package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.app.box.com/notes/1720417859323");
		
		//create a webElement(FE) + perform action(click,sendKeys, isDisplayed, getText..)
		
		//1.
		// driver.findElement(By.id("input-email")).sendKeys("tom@gmail.com");
		// driver.findElement(By.id("input-password")).sendKeys(By.id("input-password"));
		
		//2.
		WebElement email=driver.findElement(By.id("input-email"));
		WebElement password=driver.findElement(By.id("input-password"));
		
		//3. By locator:
		

	}

}
