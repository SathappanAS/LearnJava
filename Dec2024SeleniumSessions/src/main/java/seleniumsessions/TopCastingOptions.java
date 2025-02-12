package seleniumsessions;
import org.openqa.selenium.*;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chromium.*;

public class TopCastingOptions {
	public static void main(String[] args) {
		
		//1. CD = CD
		/*ChromeDriver driver=new ChromeDriver();*/
		
		//2. WD d = new CD
		//Valid and recommended
		//only for local exeuction
		//WebDriver driver = new ChromeDriver();
		
		//3. SC d = new CD()'
		//Valis but not recommended
		//SearchContext driver = new ChromeDriver();
		
		//4. WD d = new RWD();
		//valid and recommended; only for remote execution
		//used when we want to run test cases in remote machine, cloud, aws, grid
		//WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);//os/browser
		
		//5. SC d = new RW();
		//valid and recommended; only for remote executionvalid and recommended; only for remote execution
		//SearchContext driver =new RemoteWebDriver(remoteAddress, capabilities);//os/browser
		
		
		//6.  RWS d = new CD();
		//local execution 
		//valid and recommended
		//RemoteWebDriver driver = new ChromeDriver();
	
		//7. ChromiumDriver d = new ChromeDriver();
		//local
		//only for chrome driver
		//Valid and not recommended: works only for chrome based browser: chrome/edge
		//ChromiumDriver d = new ChromeDriver();
		
		//8. RWD d = RWD
		//not top casting
		//only for remote exeuction
		//RemoteWebDriver driver = new RemoteWebDriver(new URL("192.178.11.2/wd/"),capabilities);//os/browser
		
	}
}