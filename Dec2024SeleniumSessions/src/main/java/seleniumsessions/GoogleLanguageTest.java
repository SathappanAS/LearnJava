package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Very Importance Questions*/
public class GoogleLanguageTest {	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		 List<WebElement> langlinkList = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		System.out.println(langlinkList.size());
		By langLocator = By.xpath("//div[@id='SIvCob']/a");
		clickElement(langLocator, "मराठी");
		driver.close();
	}
	
	public static void clickElement(By locator, String value) {
		List<WebElement> eleList = driver.findElements(locator);
		System.out.println("total number of elements: " + eleList.size());
		for (WebElement e : eleList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(value)) {
				e.click();
				break;
			}}}
	
}
