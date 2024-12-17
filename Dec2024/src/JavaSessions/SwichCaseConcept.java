package JavaSessions;

public class SwichCaseConcept {

	public static void main(String[] args) {
		
		String browser = " Chrome ";
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch chrome");
			break;
		case "safari":
			System.out.println("launch chrome");
			break;
		case "edge":
			System.out.println("launch chrome");
			break;
		default:
			System.out.println("invalid browser...please pass the right browser");
		
		}

	}

}
