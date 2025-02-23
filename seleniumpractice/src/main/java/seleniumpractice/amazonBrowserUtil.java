package seleniumpractice;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class amazonBrowserUtil {
	
	private WebDriver driver;
	
	public WebDriver init(String browserName) {
		System.out.println("Name of thhe Browser to launch the webSite : " + browserName);
		
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		case "safari":
			driver=new SafariDriver();
			break;
		default:
			System.out.println("Please pass the right browser name....");
			break;
		}
		
		return driver;
	}
	
	
	public void launchURL(String url) {
		lenghtCheck(url);
		httpCheck(url);
		nullCheck(url);
		driver.get(url);
		
	}
	
	
	public void launchURL(URL url) {
		String appurl=String.valueOf(url);
		lenghtCheck(appurl);
		httpCheck(appurl);
		nullCheck(appurl);
		driver.get(appurl);
		
	}
	
	public String getPageTitle() {
		String title1=driver.getTitle();
		System.out.println("page title is : " + title1);
		return title1;
	}
	
	public void getPageURL() {
		String PageURL = driver.getCurrentUrl();
		System.out.println("page URL is : " + PageURL);
	}
	
	public void closeBrowser() {
		if(driver!=null) {
			driver.close();
			System.out.println("Browser is closed");
		}
	}
	
	public void quidBrowser() {
		if(driver!=null) {
			driver.quit();
			System.out.println("Browser is closed");
		}
	}
	
	
	private void lenghtCheck(String value) {
		if(value.length()==0) {
			System.out.println("Value cannot be blank...");
			throw new amazonBrowserException("------Empty Value------");
		}
	}
	
	
	private void httpCheck(String urlValue) {
		if(urlValue.indexOf("http")!=0) {
			System.out.println("HTTP is not Present..." + urlValue);
			throw new amazonBrowserException("------HTTP is missing ------");
		}
	}
	
	private void nullCheck(String value) {
		if(value==null) {
			System.out.println("HTTP is null..." + value);
			throw new amazonBrowserException("------value  is null ------");
		}
	}
	

}
