package FunctionsConcept;

public class Browser {
	//Acceptance criteria 
	// launch a browser
	// function name : launchBrowser (String browserName) : ch/ff/safari/edge
	//return : true/false: boolean 
	// ch/ff/safari/edge : print a message and return true
	//ie: print an erroe message and return false
	
	public boolean launchBrowser(String browserName) {
		System.out.println("checking the browser...." + browserName);
		
		if(browserName.trim().equalsIgnoreCase("chrome")) {
			System.out.println("chrome is launched...");
			return true;
		}
		else if(browserName.trim().equalsIgnoreCase("firefox")) {
			System.out.println("ff is launched...");
			return true;
		}
		else if(browserName.trim().equalsIgnoreCase("safari")) {
			System.out.println("safari is launched...");
			return true;
		}
		else if(browserName.trim().equalsIgnoreCase("edge")) {
			System.out.println("safari is launched...");
			return true;
		}
		else {
			System.out.println("please pass the right browser...");
			return false;
		}

	}
	
	
	
	
	
	
	public boolean intiBrowser(String browserName) {
		System.out.println("checking the browser...." + browserName);
		
		boolean flag = true; //local variable in stack memory
		
		switch(browserName.trim().toLowerCase()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch ff");
			break;	
		case "edge":
			System.out.println("launch edge");
			break;
		default:
			System.out.println("browser is not found.." + browserName);
			flag=false;
			break;
		}	
		return flag;
	}
	

	public static void main(String[] args) {
		Browser br=new Browser();

		boolean fg=br.intiBrowser("opera");
		System.out.println(fg); //false
		
		
		boolean flag=br.launchBrowser(" chrome ");
		
		if(flag) {
			System.out.println("enter the url");
		}
		else {
			System.out.println("enter the correct url");
		}
		

	}

}
