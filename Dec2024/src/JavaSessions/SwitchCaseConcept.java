package JavaSessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		
		String browser = " Chrome ";
		double version=131.22;
		
		switch (browser.toLowerCase().trim()) { // In the compile time , already it will decide in which case need to go for run
		case "chrome": //case is not something which will check and proceed //case is not a condition  
			// case is not useful without break statement.
			System.out.println("launch chrome");
			if (version==131.22) {
				System.out.println("use 131.22 version");
				break;
			}
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
			break;
		case "ie":
			System.out.println("ie");
			break;
		}
		System.out.println("-----******---------********--------");
		// int
		int marks = 10;
			switch (marks) {
				case 90:
					System.out.println("90");
					break;
				default:
					System.out.println("invalid marks");
					break;}
			System.out.println("-----******---------********--------");

		// byte, short
		short number = 10;
			switch (number) {
				case 10:
					break;
				default:
					break;}

				// not allowed: long, float, double
		
		/*SWITCH allowed for int,byte and short*/// String is allowed
		/*long,float and double is not allowed*/ // Important interview question
		
		/*Char is allowed*/
		
		char alpha = 'a'; //If change it Uppercase 'A' it will not work because java is case sensitive
		// toLowerCase toUpperCase method only applicable to strings
		//a e i o u
		switch (alpha) {   // Interview question - You have to supply the alphabet a to z and you have to the particular alphabet is vowel or consonant 
		case 'a':
			System.out.println(alpha + " is a vowel");
			break;
		case 'e':
			System.out.println(alpha + " is a vowel");
			break;	
		case 'i':
			System.out.println(alpha + " is a vowel");
			break;
		case 'o':
			System.out.println(alpha + " is a vowel");
			break;	
		case 'u':
			System.out.println(alpha + " is a vowel");
			break;
		default:
			System.out.println(alpha + " is a consonant");
			break;
		}	
		System.out.println("-----******---------********--------");
		
		
		char alphatest = 'a';
		switch (String.valueOf(alphatest).toLowerCase()) {   //"a" -- This line converting the character to string so we are maintaining the case in string with ""
		case "a":
			System.out.println(alphatest + " is a vowel");
			break;
		case "e":
			System.out.println(alphatest + " is a vowel");
			break;	
		case "i":
			System.out.println(alphatest + " is a vowel");
			break;
		case "o":
			System.out.println(alphatest + " is a vowel");
			break;	
		case "u":
			System.out.println(alphatest + " is a vowel");
			break;
		default:
			System.out.println(alphatest + "  is a consonant");
			break;
		}	
		System.out.println("-----******---------********--------");
		
		
		char top = 'u';
		switch (top) {
		case 'a', 'e', 'i', 'o', 'u':
//		case 'e':
//		case 'i':
//		case 'o':
//		case 'u':
		System.out.println(top + " is a vowel");
		break;
		default:
			System.out.println(top + " is a consonant");
			break;
		}
		System.out.println("-----******---------********--------");
/*Real Time Use Cases of SWITCH Case*/	
//cross browser logic : chrome/firefox/edge/ie
//Ecomm App : Product Categories
//RBAC(RoleBase Access Control): User roles: admin, customer, partner, seller, vendor, distributor
//Cross OS/Platforms: MAc,Windows, Linux
//Multi Environment Setup: dev, qa, stage, uat, prod
//Payment: UPI, CC, Paypal, NetBanking, other
//Month: 12 month: Jan to Dec
//Uber Booking: 
//Web Page: Link, Image, text field, button, checkbox, radio button
		
//
		String paymentMode="CreditCard";
		switch (paymentMode.toLowerCase().trim()) {
		case "CreditCard":
			System.out.println("payment via cc");
			break;
//		case "CreditCard": //Duplicate case not allowed
//			System.out.println("payment via cc");
//			break; 
		default:
			break;
		}
		System.out.println("-----******---------********--------");

//boolean: not allowed
//		boolean flag = true;
//		switch (flag) {
//		case true:
//			
//			break;
//
//		default:
//			break;
//		}
		
//		int price = 90;
//		switch (price == 90) { // This is not allowed
		//switch (price)
//		case 90:
//			
//			break;
//
//		default:
//			break;
//		}

		System.out.println("-----******---------********--------");	
		String os = "win";
		String ps = "RAM";
		switch (os) {
		case "":
			
			break;

		default:
			break;	}
		
	}
}