package methodAssignmentMore;
/*
 * Method without Return Value (void) and with Parameters (String, boolean):
 * Assignment: Write a method to print a message based on a boolean value (true for success, false for
failure).
Signature: public void printStatusMessage(String message, boolean isSuccess)
*/
public class programEight {
	public void printStatusMessage(String message, boolean isSuccess) {
		System.out.println("Getting an message" + " " + message);
		isSuccess=true;
		if(message.trim().equalsIgnoreCase("learningjava")) {
			System.out.println(message + " " + isSuccess);
		}
		else {
			System.out.println(message + " " + false);
		}
		
		
	}
	public static void main(String[] args) {
		programEight p8=new programEight();
		p8.printStatusMessage("LearningJava", true);
		
		

	}

}
