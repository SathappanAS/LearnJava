package StringManipulation;
/*Very importannt interview question*/
public class StringReverseConcept {
	
	
	public static String StringReverse(String str) {
		//null check
		if(str== null) {
			throw new RuntimeException("str is null");
		}
		
		//length check
		if(str.length() == 1) {
		return str;
		}
	
		//length check==0
		if(str.length() == 0) {
		return str;
		}
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		
		return rev;
	}
	
	

	public static void main(String[] args) {
		
		String s1="selenium"; 
		String res=StringReverseConcept.StringReverse(s1);
		System.out.println(res);
		
		
		//		StringBuilder sb=new StringBuilder("selenium");
		//		System.out.println(sb.reverse());


	}

}
