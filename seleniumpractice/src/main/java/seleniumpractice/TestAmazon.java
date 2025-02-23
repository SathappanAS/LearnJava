package seleniumpractice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;

public class TestAmazon {

	public static void main(String[] args) {
		
		amazonBrowserUtil test=new amazonBrowserUtil();
		
		WebDriver driver=test.init("chrome");
		
		test.launchURL("https://www.amazon.com/");
		
		
		String LaunchURL=test.getPageURL();
		if(LaunchURL.equals("https://www.amazon.com/")) {
			System.out.println("URL is correct===Pass");
		}
		else {
			System.out.println("URL is not correct===Pass");
		}
	
		
		
		String actTitle=test.getPageTitle();
		if(actTitle.equals("Amazon.com. Spend less. Smile more.")) {
			System.out.println("Title is correct===Pass");
		}
		else {
			System.out.println("Title is not correct===fail");
		}
		
		
		
		test.quidBrowser();

	}

}
