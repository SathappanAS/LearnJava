package seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//launch browser: chrome
		//ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		EdgeDriver driver=new EdgeDriver();
		
		//enter the url:
		driver.get("https://www.google.com");
		
		//get the title of the page:
		String actTitle=driver.getTitle();
		System.out.println("page title : " + actTitle);
		
		//checkpoint/validation point/assertions
		if(actTitle.equals("Google")) {
			System.out.println("title is correct: PASS");
		}
		else {
			System.out.println("title is not correct: FAIL");
		}
		
		//Automations steps + Checkpoint ==>Automation testing
		
		//Close the browser:
		driver.quit();

	}

}
