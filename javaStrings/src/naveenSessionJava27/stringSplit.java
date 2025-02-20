package naveenSessionJava27;

public class stringSplit {
	
	public static String split(String str) {
		
		String words[]=str.split(" ");
		
		String Word ="";
		for(int i=0;i<words.length;i++) {
			
			Word = words[i];
			System.out.println(Word);
		}
		
		return "";
	}

	public static void main(String[] args) {
		
		String name="testing automation selenium";
		
		String result=stringSplit.split(name);
		System.out.println(result);
	}

}
