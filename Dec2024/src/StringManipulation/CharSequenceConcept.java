package StringManipulation;

public class CharSequenceConcept {
	
	public static void sendKeys(CharSequence t) {
		System.out.println(t);
	}

	public static void main(String[] args) {
		
		//interview questions
		// What is the parent interface for String, StringBuilder, StringBuffer ? CharSequenceConcept Interface
		
		//CharSequenceConcept(I) ---> String, StringBuilder, StringBuffer
		
		String name = "Prity";
		String city = "Pune";
	
		StringBuilder sb=new StringBuilder("123, pune, india");
		StringBuffer sbf=new StringBuffer("456, chennai, india");
		
		CharSequenceConcept.sendKeys(name);
		CharSequenceConcept.sendKeys(city);
		CharSequenceConcept.sendKeys(sb);
		CharSequenceConcept.sendKeys(sbf);
		
	}

}
