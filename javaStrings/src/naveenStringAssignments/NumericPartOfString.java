package naveenStringAssignments;
/*String s = "your transaction id is: 12345 and reference id is 34567";*/
public class NumericPartOfString {
	
	
	public static String numeric(String str) {
		
		int strLenght = str.length();
		System.out.println("Lenght of the string: " + strLenght); 
		System.out.println(str.charAt(0));
	
		String result ="";
		
		for(int i=0;i<strLenght;i++) {
			
		if(str.charAt(i)=='1' || str.charAt(i)=='2' || str.charAt(i)=='3' || str.charAt(i)=='4' || str.charAt(i)=='5' || str.charAt(i)=='6' ||  str.charAt(i)=='7') {
			
			result = result + str.charAt(i) + " ";
		 }
		
		}
		System.out.println(result.trim());
		return result;
	}


	public static void main(String[] args) {
		String s = "your transaction id is: 12345 and reference id is 34567";
		NumericPartOfString.numeric(s);
	}

}
