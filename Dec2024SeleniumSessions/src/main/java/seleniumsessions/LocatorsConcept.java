package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1. id: unique attribute: - I
		driver.findElement(By.id("input-firstname")).sendKeys("Java");
		
		//2. name: attribute: can be duplicate - II
		driver.findElement(By.name("lastname")).sendKeys("testing");
		
		//3. class name: attribute: can be duplicate (most of the time) -- III (should be unique)
		//driver.findElement(By.className("form-control")).sendKeys("java@gmail.com");
		//img-responsive --> 1 of 1
		//form-control: 1 of 7 : .img-responsive
		//driver.findElement(By.className("img-responsive")).click();
		
		//4. xpath: is not attribute. address of the element in the DOM
		//dynamic elements handling
		driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).sendKeys("98765432123");
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
		
		//5. cssSelector: is not attribute.
		//dynamic elements handling
		driver.findElement(By.cssSelector("#input-password")).sendKeys("test@123");
		driver.findElement(By.cssSelector("#input-confirm")).sendKeys("test@123");
		
		//6. linkText: only for links:
		//htmltag: <a>
		driver.findElement(By.linkText("Login")).click();
		//driver.findElement(By.linkText("Forgotten Password")).click();
		
		//7. partialLinkText: only for links:
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		//Forgotten Password
		//Forgotten Username
		
		//8. tagName:
//		String header = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header);
			

	}

}
