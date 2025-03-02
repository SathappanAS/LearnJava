package seleniumsessions;
import java.util.List;
/*Very famous interview questions*/
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
/*How many links on the page and how many images on the page*/
public class TotalLinks {

	public static void main(String[] args) {
		// find total number of links on the page
		// print the text of each link on the console if text is not empty
		// html tag = <a>
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		List<WebElement> linksList=driver.findElements(By.tagName("a"));
		//findElements already predefined
		//List - will maintaining the order 
		
		//Why they gave List insteady of Static Array
		//Application is dynamic because links will be increased
		//StaticArray will work only for fixed size
		
		System.out.println("total links " + linksList.size()); //total links 437
		
		//index loop
		for(int i=0;i<linksList.size();i++) {
			String text=linksList.get(i).getText();
				if(text.length()!=0) {
			System.out.println(i+ " = " + text);	
			}
		}
		
		System.out.println("===========");
		
		//for each loop
		
		for(WebElement e : linksList) {
			String text=e.getText();
				if(text.length()!=0) {
				System.out.println(text);	
				}
		}
		
		driver.close();
	}
}
