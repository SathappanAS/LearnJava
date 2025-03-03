package seleniumpractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalMenuLink {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.discover.com/");
		
//		By linkDiscoverCheck = By.tagName("a");
//		
//		List<WebElement> totalLinks = getallElements(linkDiscoverCheck);
//		getTotalElementsCount(linkDiscoverCheck);
//		
//		
//		//
//		for( WebElement e : totalLinks) {
//			
//			String text = e.getText();
//			if(text.length()!=0) 
//			{
//			System.out.println(text);
//			}
//		}
//		
//		Thread.sleep(1000);
//		driver.quit();
		
		
		By menuLinks = By.className("footer-nav");
		
		getTotalElementsCount(menuLinks);
		
		
		List<String> result = getElementTextLink(menuLinks);
		System.out.println(result);
		
		driver.close();
		

	}

	public static List<String> getElementTextLink(By locator) {
		
		List<WebElement> footerlink = getallElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		//Top casting - child class object is referred by parent class interface
		//Good pratice - always top cast with the interface 
		//Physical capaciy(PC) = 0
		//We can't use staticArray - Because we need to provide the size
		
		
		for( WebElement e : footerlink) {
			String text = e.getText();
			
			if(text.length()!=0) 
			{
				//System.out.println(text);
				eleTextList.add(text);
				
				
			}
		}
		return eleTextList;
		
	}
	
	
	public static List<WebElement> getallElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static int getTotalElementsCount(By locator) {
		int elecount= getallElements(locator).size();
		System.out.println(elecount);
		return elecount;
	}
	
	
}
