package JavaSessions;

public class SwichCaseConcept {

	public static void main(String[] args) {
		
		String browser = " Chrome ";
		
		switch (browser.toLowerCase().trim()) { // In the compile time , already it will decide in which case need to go for run
		case "chrome": //case is not something which will check and proceed //case is not a condition  
			// case is not useful without break statement.
			System.out.println("launch chrome");
			break; //Break statement will improve the performance of the program
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		default:
			System.out.println("invalid browser...please pass the right browser");
		}
	}
}