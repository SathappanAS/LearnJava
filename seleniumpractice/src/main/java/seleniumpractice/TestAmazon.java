package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestAmazon {

	public static void main(String[] args) {
		WebDriver driver;
		
		amazonBrowserUtil test=new amazonBrowserUtil();
		driver=test.init("chrome");
		amazonElementUtil elUtil = new amazonElementUtil(driver);
		
	
		
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
		
		
		
		By amazonBasisElement = By.xpath("/html/body/div[1]/header/div/div[4]/div[2]/div/div/a[4]");
		
		String text=elUtil.doGetElementText(amazonBasisElement);
		System.out.println("text of the amazonElement: " + text);
		if(text.equals("Amazon Basics")) {
			System.out.println("True");
		}
		else {
			System.out.println("false");
		}
		
		//System.out.println("text of the amazonElement: " + text);
		
		test.quidBrowser();

	}

}
