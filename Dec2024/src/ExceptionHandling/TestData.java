package ExceptionHandling;

public class TestData {
	
	//chrome//firefox//edge
	public static void launchBrowser(String browserName) {
		System.out.println("launching browser");
		
		switch(browserName.trim().toLowerCase()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		default:
			System.out.println("wrong browser..." +browserName);
			throw new BrowserException("INVALID Browser");
			}
		
	}
	
	public static void main(String[] args) {
		
		TestData.launchBrowser("naveen");
		System.out.println("enter the url");
		
	}
	
}