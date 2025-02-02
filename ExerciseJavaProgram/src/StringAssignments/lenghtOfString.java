package StringAssignments;

public class lenghtOfString {

	public static void main(String[] args) {
		 		  //012345
		String len="testingtst";
		
		int size=len.length();
		System.out.println(size); //10

		char charI=len.charAt(0);
		System.out.println(charI); //t
		
		int firstt=len.indexOf('t');	
		System.out.println(firstt); //0
		
		int second=len.indexOf('t')+1;
		System.out.println(len.indexOf('t', second));//3
		
		int third=len.indexOf('t', second)+1;
		System.out.println(len.indexOf('t', third));//3
		
	}

}
