package naveenStringAssignments;



public class printMiddleWords {
	
	
	public static String Middle(String str) {
		
		String[] st = str.split(" ");
		int index = st.length/2;
		return st[index];
	}

	public static void main(String[] args) {
		
		
		
		String result = printMiddleWords.Middle("Sat Annamalai Sat");
		
		
		
		System.out.println(result);

	}

}
