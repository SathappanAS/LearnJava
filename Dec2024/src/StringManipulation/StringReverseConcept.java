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
		
		//Test Cases: With different data
		String res=StringReverseConcept.StringReverse(""); //O(1) --BEST Case
		System.out.println(res);
		
		res=StringReverseConcept.StringReverse("t"); //O(1)--BEST Case
		System.out.println(res);
		
		res=StringReverseConcept.StringReverse(" "); //O(1)--BEST Case
		System.out.println(res);
		
		res=StringReverseConcept.StringReverse("testing"); //O(n)--Worst Case
		System.out.println(res);
		
		res=StringReverseConcept.StringReverse("1234"); //O(n)--Worst Case
		System.out.println(res);
		
		res=StringReverseConcept.StringReverse("testing automation with selenium"); //O(n)--Worst Case
		System.out.println(res);
		
		res=StringReverseConcept.StringReverse(null); //O(1)--BEST Case
		System.out.println(res);
		//		StringBuilder sb=new StringBuilder("selenium");
		//		System.out.println(sb.reverse());

	}

}