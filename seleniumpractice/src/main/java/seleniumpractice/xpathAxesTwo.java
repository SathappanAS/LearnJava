package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAxesTwo {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(4000);
		
		// //a[text()='John.Smith']/parent::td/following-sibling::td
		
		List<WebElement> columns= driver.findElements(By.xpath("//a[text()='John.Smith']/parent::td/following-sibling::td"));
		
		for(WebElement e:columns ) {
			String result=e.getText();
			System.out.println(result);
		}
		
	}

	
	
	
}
