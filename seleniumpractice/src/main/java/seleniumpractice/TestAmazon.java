package seleniumpractice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;

public class TestAmazon {

	public static void main(String[] args) {
		
		amazonBrowserUtil test=new amazonBrowserUtil();
		
		WebDriver driver=test.init("chrome");
		
		test.launchURL("https://www.amazon.com/");
		test.getPageTitle();
		test.getPageURL();
		test.quidBrowser();

	}

}
