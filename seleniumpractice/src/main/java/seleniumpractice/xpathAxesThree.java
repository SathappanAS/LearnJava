package seleniumpractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAxesThree {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(4000);

		
		
		if(columfind("Joe.Root").contains("Enabled")) {
			System.out.println("PASS");
		}
		
		driver.close();
		
	}

	public static List<String> columfind(String usrName) {
		
		List<WebElement> columns= driver.findElements(By.xpath("//a[text()='"+ usrName +"']/parent::td/following-sibling::td"));
		
		List<String> colList = new ArrayList<String>();
		
		for(WebElement e:columns ) {
			String result=e.getText();
			System.out.println(result);
			colList.add(result);
		}
		return colList;
		
	}
	

	
}
