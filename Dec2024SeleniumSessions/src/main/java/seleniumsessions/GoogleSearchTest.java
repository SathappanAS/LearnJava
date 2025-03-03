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
			
			driver.findElement(By.name("q")).sendKeys("Selenium Automation");
			
			Thread.sleep(3000);
			
			List<WebElement> suggList = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
			
			System.out.println(suggList.size());
			
			for(WebElement e : suggList) {
				String text = e.getText();
				System.out.println(text);
					if(text.contains("testing jobs")) {
						e.click();
						break;
					}
			}

	}

}
