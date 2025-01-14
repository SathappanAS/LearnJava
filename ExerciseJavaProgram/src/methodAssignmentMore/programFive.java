package methodAssignmentMore;
/* Method with Return Value(String) and with Parameters(String[]):
 * 
 * Assignment : Write a method to concatenate all strings in a string array and return the concatenated string.
 * Signature:public String concatenateStrings(String[] strings)
 * */
public class programFive {
	public static String concatenateStrings(String[] myStr) {

		String finalStr ="";
		
		for(int i=0;i<myStr.length;i++) {
			finalStr = finalStr + myStr[i] + " "	;
		}	
		
		return finalStr ;
	}
	
	public static void main(String[] args) {
		String str[]= {"Automation","testing","learn","java","selenium"};
		String s = concatenateStrings(str);
		System.out.println(s);
	}
}