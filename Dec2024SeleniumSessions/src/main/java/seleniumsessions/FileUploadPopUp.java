package seleniumsessions;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class FileUploadPopUp {

		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://practice.expandtesting.com/upload");
			
			//htmltag = anything: input, button, div
			//attribute: type = file: 99.99% 
			driver.findElement(By.id("fileInput")).sendKeys("/Users/naveenautomationlabs/Documents/userresponse.json");

		}

	}




