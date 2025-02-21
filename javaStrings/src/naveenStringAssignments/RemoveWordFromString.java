package naveenStringAssignments;
/*Write a program that will printout the last character and first character of a word*/
public class RemoveWordFromString {

	public static void main(String[] args) {
		String h1="THelloT   EverSyoneS";
		System.out.println(h1.length());
		
		System.out.println(h1.charAt(0)); //first character of a word
		System.out.println(h1.charAt(h1.length()-1)); //last character of a word
		
		String h2=h1.replaceFirst("T", ""); //Replace first character of a word T
		System.out.println(h2);
		
		String h3=h2.substring(0, h1.length()-2) + ""; //Replace last character of a word S
		
		System.out.println(h3);
	}

}
