package seleniumpractice;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class CustomXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.discover.com/");
		boolean b1 = driver.findElement(By.xpath("((//footer//div//div[contains(@class,'footer-nav')])[last()]//a)[last()]")).isDisplayed();
		System.out.println(b1);

}}

