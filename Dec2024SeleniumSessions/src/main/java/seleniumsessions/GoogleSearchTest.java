package seleniumsessions;

import org.openqa.selenium.WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
//Perform the google search and search automation search
	
		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {

			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			
//			driver.findElement(By.name("q")).sendKeys("Selenium Automation");
//			
//			Thread.sleep(3000); //HardWait {Thread-class; sleep:static method}
//			
//			List<WebElement> suggList = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
//			
//			System.out.println(suggList.size());
//			
//			for(WebElement e : suggList) {
//				String text = e.getText();
//				System.out.println(text);
//					if(text.contains("testing jobs")) {
//						e.click();
//						break;
//					}
//			}
			
			By loc=By.xpath("//div[@class='wM6W7d']/span");
			
			GoogleSuggList(loc,"Selenium Automation","jobs");

	}

		//
		
		public static void GoogleSuggList(By locator, String value, String value2) throws InterruptedException {
			
			driver.findElement(By.name("q")).sendKeys(value);
			Thread.sleep(3000);
			List<WebElement> suggList =  getElements(locator);
			
			for(WebElement e : suggList) {
				String text = e.getText();
				System.out.println(text);
					if(text.contains(value2)) {
						e.click();
						break;
					}
			}
			
		}
		
		
		public static List<WebElement> getElements(By locator) {
			return driver.findElements(locator);	
		}
}