package seleniumsessions;

import org.openqa.selenium.*;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chromium.*;

public class LaunchTest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); //session id : 123
		driver = new ChromeDriver(); //session id : 456
		driver = new ChromeDriver(); //session id : 789
		driver.get("https://www.google.com"); //session id : 789
		driver.quit(); //session 789 - third browser will be closed

	}

}