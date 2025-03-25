package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class AuthPopUpHandle {

	public static void main(String[] args) {

		// handle auth pop:
		// basic authentication: username/password

		String username = "admin";
		String password = "admin";

		WebDriver driver = new ChromeDriver();
		//it will not work if un/pwd contains @:
		//driver.get("https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth");

		//selenium 4.x:
		// basic auth: it will work for any un/pwd : with @ also
		//it will work only for chroium based browsers: chrome, edge
		((HasAuthentication) driver).register(() -> new UsernameAndPassword(username, password));

		driver.get("https://the-internet.herokuapp.com/basic_auth");

		String mesg = driver.findElement(By.xpath("//div[@id='content']//p")).getText();
		System.out.println(mesg);

	}

}