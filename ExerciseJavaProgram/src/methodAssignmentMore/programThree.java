package methodAssignmentMore;
/*Method with Return Value (boolean) and with Parameter (String, String)*/
/*Assignment : Write a method to compare two strings and return true if they are equal, false otherwise*/
/*Signature: public boolean compareStrings(String str1,String str2)*/
public class programThree {

	public boolean compareStrings(String str1 , String str2) {
		if(str1.equalsIgnoreCase(str2)) {
			return true;
		}
		else {
			return false;
		}
		}
		
	
	public static void main(String[] args) {
		programThree p3=new programThree();
		boolean result = p3.compareStrings("testing", "TesTing");
		System.out.println(result);
		
		programThree p4=new programThree();
		boolean resultOne = p4.compareStrings("test", "TesTing");
		System.out.println(resultOne);
	}

}