package seleniumsessions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.*;

public class CustomXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//xpath : address of the element in the html DOM
		//not an attribute
		
		//1. absoulte xpath: / (start with - single forward slash)
		// /html/body/div/div[2]/ul/li[2]/div/div/input
		
		//2. relative xpath/custom xpath: // (starts with two forward slash)
		/*htmltag[@attr='value']*/
		//input[@placeholder='Email Address']
		//input[@value='Login']
		
		/*htmltage[@attr1='value' and @attr1='value]*/
		//input[@type='text' and @name='email']
		//input[@type='text' and @name='email' and @placeholder='E-Mail Address']
		
		//input[@name and @type and @placeholder] 
		
		//parent to child:
		//direct : / --> only direct
		//indirect : // --> direct+indirect
		
		//form/input -->3
		//form//input -->5
		
		
		//div[@id='content']/form//input[@id='input-firstname']
		
		//select[@id='Form_getForm_Country']/option
		
		//footer:
		//footer//h5
		//footer//a
				
		//text(): p, links, label, span, div , header h1 h2 h3
		//htmltage[text()='value']
		
		//h2[text()='New Customer']
		//h2[text()='Returing Customer']
		//a[text()='Register']
		//label[text()='E-mail Address']
		
		//text() and attribute:
		//htmltag[@attr='value' and text()='value']
		//label[@for='input-email' and text()='E-Mail Address']
		//a[@class='list-group-item' and text()='Address Book']
		
		//htmltag[text()='value' and @attr='value']
		
		//htmltag[@attr1='value' and @attr2='value' and @attr3='value' and text()='value']

		//footer:
		//footer//h5
		//footer//a
		
		
		//contains(): partial attribute, partial text value
		//htmltag[contains(text(),'value')]
		
		//h1[contains(text(),'Register Account')]
		//h2[contains(text(),'Returning')]
		//h2[contains(text(),'New')]
		//p[contains(text(),'shop faster')]
		
		
		//htmltag[contains(@attr,value) and contains(text(),'value')]
		//a[contains(@href,'account/order') and contains(text(),'Order')]
		
		//htmltag[contains(@attr1,'value') and @attr2='value']
		//a[contains(@href,'account/recurring') and @class='list-group-item']
				
		//htmltag[contains(@attr1,'value') and @attr2='value' and contains(text(),'value')]
		//a[contains(@href,'account/recurring') and @class='list-group-item' and contains(text(),'Recurring')]
		//a[contains(@href,'?route=account/recurring') and @class='list-group-item' and contains(text(),'Recurring')]
		
		
		//dynamic attributes/text:
		//		<input id="first_123">
		//		<input id="first_345">
		//		<input id="first_678">
		
		By.id("first_123\"");//won't work
		By.xpath("//input[contains(@id,'firstname_')]");
		
	
		//<div>your order id is 12345</div>
		By order = By.xpath("//a[contains(text(),'your order id is')]");
		String orderText = driver.findElement(order).getText();
		// orderText = your order id is 12345
		
		//starts-with():
		//htmltag[starts-with(@attr,'value')]
		//input[starts-with(@placeholder,'E-Mail')]
				
		//htmltag[starts-with(text(),'value')]
		//p[starts-with(text(),'By creating an account')]
					
		//starts-with() and contains()
		//htmltag[starts-with(text(),'value') and contains(@attr,'value')]
		//a[starts-with(text(),'Recurring') and contains(@href,'?route=account/recurring')]
				
		//ends-with(): NA in xpath:
		
		
		
				//index in xpath:
				// (//a[text()='Forgotten Password'])[2]
				//driver.findElement(By.xpath("(//a[text()='Forgotten Password'])[2]")).click();
				
				// (//form//input[@class='form-control'])[1]
				// (//form//input[@class='form-control'])[position()=1]
				
				// (//form//input[@class='form-control'])[last()]
				// (//form//input[@class='form-control'])[last()-1]
				// (//form//input[@class='form-control'])[position()=last()]
				
				//capture group:
				// ((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()]
				// ((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()-1]
				// ((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[1]
		
		
		/*Interivew Question*/
		boolean b1 = driver.findElement(By.xpath("((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()]")).isDisplayed();
		System.out.println(b1);
		
		
		
				// (//a[@class='list-group-item'])[last()]
				
				// (//select[@id='Form_getForm_Country']/option)[last()]
				
				
				//*[@id="input-email"]: 200 --> 50th
				//input[@id="input-email"] ---> 20 --> 
		
		
	
		
		
		
		
	}

}
