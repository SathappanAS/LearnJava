package selenium22Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFramePratice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//browser - chrome
		
		//page
				driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");//page
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']")).click();
				Thread.sleep(3000);
				
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
				
				driver.findElement(By.id("RESULT_TextField-1")).sendKeys("testing frame");

				driver.findElement(By.id("RESULT_TextField-3")).sendKeys("Arizona");
				
				driver.switchTo().defaultContent();
				
				Thread.sleep(3000);
				
			//	driver.quit();
				
	}

}
