package session20;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffMailAlertPopups {

		public static void main(String[] args) throws InterruptedException {

			WebDriver driver = new ChromeDriver();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			
			driver.findElement(By.xpath("//button[text()='Log In']")).click();
			
			Alert alert=driver.switchTo().alert();
			
			String text = alert.getText();
			System.out.println(text);
			
			alert.accept();

	}

}
