package session13;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricinfoIpl {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/ipl-2025-1449924/delhi-capitals-vs-lucknow-super-giants-4th-match-1473441/full-scorecard");
		
//		String getWkTaker = driver.findElement(By.xpath("//span[text()='Nicholas Pooran']/ancestor::td/following-sibling::td")).getText();
//		System.out.println(getWkTaker);
		getWktTakerMethod("Nicholas Pooran");
		
		
		/***********************/
	
		
//		List<WebElement> scoreDetails = driver.findElements(By.xpath("//span[text()='Nicholas Pooran']/ancestor::td/following-sibling::td[contains(@class, 'ds-text-right')]"));
//		
//		for (WebElement e : scoreDetails) {
//		
//			String text=e.getText();
//			System.out.println(text);
//			
//		}
//		
		scoreDetails("Nicholas Pooran");
		
		driver.quit();
		
	}
	
	
	public static String getWktTakerMethod(String playerName) {
		String getWkTaker = driver.findElement(By.xpath("//span[text()='"+playerName+"']/ancestor::td/following-sibling::td")).getText();
		System.out.println(getWkTaker);
		return getWkTaker;
	}
	
	
	public static List<WebElement> scoreDetails(String playerName) {

		List<WebElement> scoreDetails = driver.findElements(By.xpath("//span[text()='"+playerName+"']/ancestor::td/following-sibling::td[contains(@class, 'ds-text-right')]"));
		
		for (WebElement e : scoreDetails) {
			List<String> scoreCardList = new ArrayList<String>();
			String text=e.getText();
			System.out.println(text);
			scoreCardList.add(text);
		}
		
		return scoreDetails;
	}
	

}
