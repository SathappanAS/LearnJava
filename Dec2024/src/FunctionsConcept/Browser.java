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
	public static void main(String[] args) {
		Browser br=new Browser();
		boolean flag=br.launchBrowser(" chrome ");
		
		if(flag) {
			System.out.println("enter the url");
		}
		else {
			System.out.println("enter the correct url");
		}
		

	}

}
