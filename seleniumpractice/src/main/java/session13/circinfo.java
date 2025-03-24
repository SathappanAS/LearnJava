package session13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class circinfo {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/ipl-2025-1449924/chennai-super-kings-vs-mumbai-indians-3rd-match-1473440/full-scorecard");
		
		String wktTakerName = driver.findElement(By.xpath("//span[text()='Ryan Rickelton']/ancestor::td/following-sibling::td")).getText();
		System.out.println(wktTakerName);
		Thread.sleep(4000);

		driver.quit();
	}

}
  