package seleniumsessions;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCSSSelectors {

public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login/legacy");
		

		//1. id: #id or tag#id
		//2. class: .class or tag.class
		
		//		#input-email
		//		input#input-email
		
		// .list-group-item
		// a.list-group-item
		// img.img-responsive
		By image = By.cssSelector("img.img-responsive");
		
		//3. tag#id.class
		// input#input-email.form-control
		
		//4. tag.class#id
		// input.form-control#input-email
		
		//5. .c1.c2.c3.c4...cn
		// .form-control.private-form__control
		
		//6. tag.c1.c2.c3.c4...cn
		// input.form-control.private-form__control
		//button.uiButton.private-button.private-button--primary.private-button--default.private-button--block.private-button--non-link

		//7. input.form-control.private-form__control#username
		//8. input#username.form-control.private-form__control
		
		//other attributes:
		// htmltag[attr='value']
		// input[name='email'] -- css
		//input[@name='email'] -- xpath
		
		// input[id='input-email']
		// input[placeholder='E-Mail Address']
		
		// htmltag[attr1='value'][attr2='value']
		// input[name='email'][placeholder='E-Mail Address']
		// input[name='email'][placeholder='E-Mail Address'][id='input-email']
		// input[name='email'][placeholder='E-Mail Address']#input-email
		// input[name='email'][placeholder='E-Mail Address']#input-email.form-control
		// input#input-email.form-control[name='email'][placeholder='E-Mail Address']
		
		//contains:
		// tag[attr *= 'value']
		// input[placeholder *= 'Address']
		// input[placeholder *= 'Address']#input-email
		// input[placeholder *= 'Address']#input-email[name *= 'email']
		
		//starts-with:
		// tag[attr ^= 'value']
		// input[placeholder ^= 'E-Mail']
		
		//ends-with:
		// tag[attr $= 'value']
		// input[placeholder $= 'Address']
		
		//text in css: NA
		
		//parent to child:
		//direct child: >
		//parent tag > child tag
		// div.list-group > a
		
		//direct+indirect: space
		//parenttag childtag
		
		// div#content input -- 11 (direct + indirect child)
		// div#content > input -- 0 (direct child)
		
		//child to parent: NA -- backward traversing is not supported with CSS
		
		//sibling:
		//immediate sibling: +
		// label[for='input-email'] + input
		// option[value='Algeria'] + option
		
		//all following siblings:
		// option[value='Algeria'] ~ option
		
		
		//indexing:
		// select#Form_getForm_Country > option:nth-of-type(2) --2nd index child
		// select#Form_getForm_Country > option:nth-of-type(n) -- all elements
		
		// select#Form_getForm_Country > option:first-child -- first child
		// select#Form_getForm_Country > option:last-child -- last child
		
		// select#Form_getForm_Country > option:nth-child(5)
		// select#Form_getForm_Country > option:nth-last-child(3)
		// select#Form_getForm_Country > option:nth-last-child(n) ---- all elements
		
		// select#Form_getForm_Country > option:nth-child(n+5)
		// select#Form_getForm_Country > option:nth-child(4n)
		
		//odd/even in css:
		// select#Form_getForm_Country > option:nth-child(even)
		// select#Form_getForm_Country > option:nth-child(odd)
		
		//odd/even in xpath:
		//select[@id='Form_getForm_Country']/option[position() mod 2 = 0] -- even
		//select[@id='Form_getForm_Country']/option[position() mod 2 = 1] --odd
				
		//comma in css:
		
		//input#username,input#password,input#remember,button#loginBtn
		
		By loginFields = By.cssSelector("input#username,input#password,input#remember,button#loginBtn");
		
		int loginFieldsCount = driver.findElements(loginFields).size();
		System.out.println(loginFieldsCount);
		
		if(loginFieldsCount == 4) {
			System.out.println("login imp fields are available on the page... PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		//not in css:
		// input.form-control:not(input[name='search']) -- exclude only 1
		// input.form-control:not(input[name='search'], input#input-firstname)  -- exclude 2 elements
		
		//space in xpath:
		//option[normalize-space()='Angola']
		
		
		//                   xpath          vs               css: 
		//1. syntax:         complex                         simple
		//2. performance:    good							 good
		//3. text:           yes							 NA
		//4. child to parent:yes                             NA
		//5. parent to child:yes							 yes
		//6. preceding-sibling:yes                           NA
		//7. following-sibling:yes                           yes
		//8. dynamic elements: yes                           yes
		//9. ends-with:        NA                            yes
		//10. space:           yes                           NA
		//11. comma:           NA                            yes
		//12. not:             yes                           yes
		//13. index:           yes                           yes(+1)
		//14. dot(.):          yes                           NA
		//15. SVG:             yes                           NA
		//16. SHADOW DOM:      NA                            yes		
	}

}