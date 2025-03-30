package selenium22Frame;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlePratice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//browser

		driver.get("https://toolsqa.com/");//page
		Thread.sleep(2000);
		
		//total number of frames:
		int frameCount = driver.findElements(By.tagName("frame")).size();
		System.out.println(frameCount);
		
		driver.quit();
	}

}
