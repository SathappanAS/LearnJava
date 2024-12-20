package SwitchCaseUseCasesExercise;
/*WAP to launch browsers using If-ElseIf and Switch Case.
Browser: Chrome/Firefox/IE/Safari
If user passes wrong browser, print please pass the right browser name*/
public class LaunchBrowsers {
	public static void main(String[] args) {
		String browser ="chrome";
		double browserVersion = 11.4;
		double ChromeVersion1 = 10.1;
		double ChromeVersion2 = 10.2;
		double ChromeVersion3 = 10.3;
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			if(ChromeVersion1>=ChromeVersion2) {
			System.out.println("launch chrome v1"); 
			//break;
			}		
			else if(ChromeVersion2<=ChromeVersion3) {
			System.out.println("launch chromev2"); 
			//break;
			}		
			else {
			System.out.println("launch chromev3");
			//break;
			}
		break;	
		case "firefox":
			if (browserVersion==11.4) {
				System.out.println("launch firefox");
				break;
			}
			break;
		case "ie":
			System.out.println("launch ie");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		default:
			System.out.println("invalid browser");
			break;
		}
		
	}
}