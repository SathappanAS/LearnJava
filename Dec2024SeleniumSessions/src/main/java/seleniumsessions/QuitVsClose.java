package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); //sid =123
		driver.get("https://www.google.com"); //sid =123
		
		String title = driver.getTitle();//Google //sid =123
		System.out.println(title);
		
		
		String url=driver.getCurrentUrl(); //sid =123
		System.out.println(url);
		
		driver.close(); //123
		
		System.out.println(driver.getTitle()); //123 //invalid session id
		
		//driver.quit(); //123
		// sid=null
		//NoSuchSessionException : Session ID is null. 
		//Using WebDriver after  after calling quit();
		//Exception in thread "main" org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
		//		driver = new ChromeDriver();
		//		driver.get("https://www.google.com");
		//		System.out.println(driver.getTitle());
		
		
	}

}
