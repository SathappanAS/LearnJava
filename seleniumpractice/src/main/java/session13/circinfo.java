package session13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class circinfo {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/ipl-2025-1449924/chennai-super-kings-vs-mumbai-indians-3rd-match-1473440/full-scorecard");
		
//		String wktTakerName = driver.findElement(By.xpath("//span[text()='Ryan Rickelton']/ancestor::td/following-sibling::td")).getText();
//		System.out.println(wktTakerName);
	
		
		getWktTakerName("Ryan Rickelton"); //b Ahmed
		getWktTakerName("MS Dhoni"); // not out
		
		Thread.sleep(4000);
		
		//command+shift+2
		List<WebElement> scoreList = driver.findElements(By.xpath("//span[text()='Rachin Ravindra']/ancestor::td/following-sibling::td[contains(@class, 'ds-text-right')]"));
		System.out.println(scoreList.size());
		
		for(WebElement e : scoreList) {
			String text=e.getText();
			System.out.println(text);
		}
		
		driver.quit();
	}
	
	
	public static void getWktTakerName (String playerName) {
		String wktTakerName = driver.findElement(By.xpath("//span[text()='"+playerName+"']/ancestor::td/following-sibling::td")).getText();
		System.out.println(wktTakerName);
	}
	


	
}
  