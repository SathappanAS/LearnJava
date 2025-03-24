package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementClassConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login/legacy");
		
		Thread.sleep(4000);
		
		
		//1. invalid -- InvalidSelectorException
		//driver.findElement(By.className("form-control private-form__control")).sendKeys("test@gmail.com");
		
		
		//2. valid
		//driver.findElement(By.cssSelector("input.form-control.private-form__control")).sendKeys("test@gmail.com");
		
		
		//3. valid
		driver.findElement(By.xpath("//input[@class='form-control private-form__control']")).sendKeys("test@gmail.com");
		
		
		//4. valid
		driver.findElement(By.className("private-form__control")).sendKeys("test@gmail.com");
		
		//5. InvalidSelectorException: invalid selector:
		//driver.findElement(By.xpath("///[@@id,'naveen']")).click();
		
		
		
	}

}