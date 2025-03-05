package seleniumsessions;

public class CustomXpath {

	public static void main(String[] args) {
		//xpath : address of the element in the html DOM
		//not an attribute
		
		//1. absoulte xpath: / (start with - single forward slash)
		// /html/body/div/div[2]/ul/li[2]/div/div/input
		
		//2. relative xpath/custom xpath: // (starts with two forward slash)
		//htmltag[@attr='value']
		//input[@placeholder='Email Address']
		//input[@value='Login']
		
		//htmltage[@attr1='value' and @attr1='value]
		//input[@type='text' and @name='email']
		//input[@type='text' and @name='email' and @placeholder='E-Mail Address']
		
		//input[@name and @type and @placeholder] //invalid xpath
		
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
		
		
		
		
		
	}

}
