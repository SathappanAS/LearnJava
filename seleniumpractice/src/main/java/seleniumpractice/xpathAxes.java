package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAxes {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(4000);
		
		// //a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
		
		selectCheckbox("Joe.Root");
		
	}
	
	public static void selectCheckbox(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox'])")).click();
	}

}
