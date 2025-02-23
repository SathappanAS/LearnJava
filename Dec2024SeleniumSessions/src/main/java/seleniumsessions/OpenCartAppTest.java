package seleniumsessions;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;

public class OpenCartAppTest {

	public static void main(String[] args) {
		
		BrowserUtil btUtil = new BrowserUtil();
		//
		WebDriver driver=btUtil.initDriver("chrome");
	    // btUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	    
		URL url;
		try {
			url = new URL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			btUtil.launchURL(url);

		} catch (MalformedURLException e) {
			System.out.println("https is missing");
			e.printStackTrace();
			throw new RuntimeException("http is mising");
		}

	    //
	    String actTitle=btUtil.getPageTitle();
	    if(actTitle.equals("Account Login")) {
	    	System.out.println("Title is correct -- PASS");
	    }
	    else {
	    	System.out.println("Title is not correct -- FAIL");
	    
	    //
	    String actUrl = btUtil.getPageURL();
		if(actUrl.contains("route=account/login")) {
			System.out.println("login page url is correct -- PASS");
		}
		else {
			System.out.println("login page url is correct -- FAIL");
		} 
		
		btUtil.quitBrowser();   
	}
}}