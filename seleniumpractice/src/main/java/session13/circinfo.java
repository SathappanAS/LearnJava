package session13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class circinfo {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/ipl-2025-1449924/chennai-super-kings-vs-mumbai-indians-3rd-match-1473440/full-scorecard");
		Thread.sleep(4000);


	}

}
  