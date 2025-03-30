package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//browser - chrome
		
		//page
				driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");//page
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']")).click();
				
				Thread.sleep(3000);

				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
				
				driver.findElement(By.id("RESULT_TextField-1")).sendKeys("testing frame");
				
				//switch back to the main page:
				driver.switchTo().defaultContent();
				
				String header = driver.findElement(By.cssSelector("h3.details__form-preview-title")).getText();
				System.out.println(header);

	}

}
