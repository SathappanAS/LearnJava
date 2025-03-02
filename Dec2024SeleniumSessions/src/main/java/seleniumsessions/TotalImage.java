package seleniumsessions;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImage {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		List<WebElement> imageList=driver.findElements(By.tagName("img"));
		System.out.println("total images :" + imageList.size() + " ");
		
		for(WebElement e : imageList) {
			//Web Scraping
			String altVal=e.getDomAttribute("alt");
			String srcVal=e.getDomAttribute("src");
			System.out.println(altVal + " : "+ srcVal );
			
		}

	}

}
