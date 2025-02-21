package naveenSessionJava27;



public class stringReversal {
	
	public static String Reversal(String str) {
		
		//null check
		if(str== null) {
			throw new RuntimeException("str is null");
		}
		
		//Lenght check
		if(str.length()== 1) {
			return str;
		}
		
		//length check==0
		if(str.length()== 0) {
			return str;
		}
		
		//reversal
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		
		return rev;
	}
	

	public static void main(String[] args) {
		
		//Test Cases: With different data
				String res=stringReversal.Reversal(""); //O(1) --BEST Case
				System.out.println(res);
				
				res=stringReversal.Reversal("t"); //O(1)--BEST Case
				System.out.println(res);
				
				res=stringReversal.Reversal(" "); //O(1)--BEST Case
				System.out.println(res);
				
				res=stringReversal.Reversal("testing"); //O(n)--Worst Case
				System.out.println(res);
				
				res=stringReversal.Reversal("1234"); //O(n)--Worst Case
				System.out.println(res);
				
				res=stringReversal.Reversal("testing automation with selenium"); //O(n)--Worst Case
				System.out.println(res);
				
				res=stringReversal.Reversal(null); //O(1)--BEST Case
				System.out.println(res);
				//		StringBuilder sb=new StringBuilder("selenium");
				//		System.out.println(sb.reverse());
		

	}

}
