package seleniumsessions;
import java.util.ArrayList;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class TotalMenuLinks {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		
//		@Nullable
//		String title = driver.getTitle();
//		System.out.println(title);
//		
//		List<WebElement> menuLinksList = driver.findElements(By.className("list-group-item"));
//		System.out.println(menuLinksList.size());
//		//command+shift+2
//	
//		
//		for(WebElement e : menuLinksList) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("Forgotten Password")) {
//				e.click();
//				break;
//			}
//		}
		
		
		By menuLinks = By.className("list-group-item");
		if(getElementsCount(menuLinks)==13){
			System.out.println("menu links count is correct: " + " PASS ");
		}
		else {
			System.out.println("menu links count is correct: " + " FAIL ");
		}
		
		List<String> actMenuList = getElementTextList(menuLinks);
		
		if(actMenuList.contains("My Account")) {
			System.out.println("PASS");
		}
		if(actMenuList.contains("Reward Points")) {
			System.out.println("PASS");
		}
		
	}
	
	public static List<String> getElementTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>(); //TopCasting //Physical capacity =0
		//List - interface
		
		for ( WebElement e : eleList) {
			String text=e.getText();
			if(text.length()!=0) {
				System.out.println(text);
				eleTextList.add(text);
			}}
		return eleTextList;
	}
	
	
	public static int getElementsCount(By locator) {
		int elecount=getElements(locator).size();
		System.out.println("element count ==>" + elecount);
		return elecount;
	}
	
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);	
	}
	
	
	
	
	

}
