package seleniumsessions;
////span[text()='Venkatesh Iyer']/ancestor::td/following-sibling::td/span//span
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class CricinfoWebTable {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/icc-champions-trophy-2024-25-1459031/australia-vs-india-1st-semi-final-1466426/full-scorecard");
		Thread.sleep(4000);

		getWktTakerName("Alex Carey");
		getWktTakerName("Glenn Maxwell");
		getWktTakerName("Virat Kohli");
		
		
		System.out.println(getScoreCard("Virat Kohli"));
		System.out.println(getScoreCard("Axar Patel"));

		driver.quit();

	}

	public static List<String> getScoreCard(String playerName) {
		List<WebElement> scoreList = driver.findElements(By.xpath(
				"//span[text()='"+playerName+"']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));

		System.out.println(scoreList.size());
		List<String> scoreCardList = new ArrayList<String>(); //[]
		for (WebElement e : scoreList) {
			String text = e.getText();
			System.out.println(text);
			scoreCardList.add(text);
		}
		return scoreCardList;
	}

	public static String getWktTakerName(String playerName) {
		String wktTakerName = driver
				.findElement(By.xpath("//span[text()='" + playerName + "']/ancestor::td/following-sibling::td"))
				.getText();
		System.out.println(wktTakerName);
		return wktTakerName;

	}

}