package EncapsulationAssignments;

public class BrowserTest {

	public static void main(String[] args) {

		Browser br = new Browser();
		br.launchBrowser();
		
		
		//public click()-->
				//-->private check locator()-->wait()-->elementPresent()-->runJS()-->click on the element
		
		
		//public sendKeys() --> private 1 to 10 --> 
		
		
		Util.checkLatestUpdates();
		Util.checkOSCompatible();
		
	}

}