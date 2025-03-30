package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//browser

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");//page
		Thread.sleep(2000);
		
		//total number of frames:
		int frameCount = driver.findElements(By.tagName("frame")).size();
		System.out.println(frameCount);
		
		//switch driver to frame;
		//driver.switchTo().frame(2); //index will be 0,1,2
		//driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));
		
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
	}

}