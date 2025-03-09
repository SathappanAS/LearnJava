package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(4000);

		// parent to child:

		// parentTag[@attr='value']/childtag[@attr='value']
		// parentTag[@attr='value']//childtag[@attr='value']

		// parentTag[@attr='value']/child::childtag[@attr='value']

		// (//div[@class='form-group'])[1]/child::input[@id='input-email']

		// div[@class='form-group']/child::input[@id='input-email']
		// div[@class='form-group']/input[@id='input-email']

		// select[@id='Form_getForm_Country']/child::option[contains(text(),'Armenia')]
		
		// child to parent: backward traversing:
		// input[@id='input-email']/../../../../../../../../../..

		// option[contains(text(),'Armenia')]/..
		// input[@id='input-email']/parent::div/parent::form/parent::div

		// child to ancestor:
		// input[@id='input-email']/ancestor::form/ancestor::div[@id='content']
		
		// sibling:
		// input[@id='input-email']/preceding-sibling::label
		// label[@for='input-email']/following-sibling::input

		// option[contains(text(),'Armenia')]/preceding-sibling::option -- 10
		// option[contains(text(),'Armenia')]/following-sibling::option --- 222

		// (//option[contains(text(),'Armenia')]/following-sibling::option)[1] --- 1

		// 1st path:
		// a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
		// a[text()='John.Smith']/parent::td/preceding-sibling::td/input[@type='checkbox']

		// 2nd path:
		// a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']

//		driver.findElement(By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//a[text()='John.Smith']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();

		selectUser("Joe.Root");
		selectUser("John.Smith");
		
		if(getUserDetails("Joe.Root").contains("Enabled")) {
			System.out.println("PASS");
		}

	}

	//[ESS, Joe Root, Enabled]--3
	public static List<String> getUserDetails(String userName) {
		List<WebElement> colDataList = driver
				.findElements(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td"));

		System.out.println(colDataList.size());
		List<String> colList = new ArrayList<String>();//pc=0, []
		
		for (WebElement e : colDataList) {
			String text = e.getText();
			System.out.println(text);
			colList.add(text);
		}
		return colList;
	}

	public static void selectUser(String userName) {
		driver.findElement(
				By.xpath("//a[text()='" + userName + "']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
				.click();
	}
		
		
	}

