package naveenSessionJava27;

public class stringExamplePart2 {

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
		
		String words[]=str.split(" ");
		
		String word="";
		String rev="";
		
		for(int j=0;j<words.length;j++) {
			word=words[j];
				String reversedWord = "";
					for(int i=word.length()-1;i>=0;i--) {
						reversedWord=reversedWord+word.charAt(i);
					}
				rev = rev + reversedWord + " ";
		}
		
		return rev.trim();
	}
	
	public static void main(String[] args) {
		
		String name="testing automation selenium level";
		
		String result=stringExamplePart2.StringReverse(name);
		System.out.println(result);

	}

}
