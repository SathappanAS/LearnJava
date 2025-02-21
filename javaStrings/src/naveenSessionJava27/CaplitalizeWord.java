package naveenSessionJava27;

import java.util.Arrays;

public class CaplitalizeWord {
	
	public static String capWord(String str) {
		
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
		
		
		String words[]=str.split(" ");
		String result="";
		
		System.out.println(Arrays.toString(words));
		for(int j=0;j<words.length;j++) {
			String w=words[j];
			String first=w.substring(0, 1).toUpperCase();
			String restString=w.substring(1);
			result= result + first + restString + " ";
		}
		return result.trim();
	}
	
	public static void main(String[] args) {
		
		String caps = "testing string java";
		String s1=CaplitalizeWord.capWord(caps);
		System.out.println(s1);
	}	

}
