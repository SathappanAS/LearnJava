package seleniumsessions;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateURL {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.navigate().to("https://www.amazon.com" );//string
		driver.navigate().to(new URL("https://www.amazon.com"));//URL
		
			
		driver.navigate().refresh();
		
		
		URL baseUrl=new URL("https://www.flipkart.com");
		driver.navigate().to(baseUrl);
		
		
		/*
		 * new ChromeDriver();
		 * new ChromeDriver("https://www.google.com");
		 * */

	}

}
