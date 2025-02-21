package naveenSessionJava27;

public class palindrome {
	
	public static String palindromeTest(String str) {
		
		str=str.toLowerCase();
	
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
		
		if(str.equals(rev)) {
			System.out.println("Entered string is Palindrome " + str);
		}
		else {
			System.out.println("Entered string is not Palindrome ");
		}
		
		return rev;
		
	}
	

	public static void main(String[] args) {
		
		String res=palindrome.palindromeTest("Level"); //O(n)--Worst Case
		System.out.println(res);

	}
}