package naveenStringAssignments;
/*Write a program to verify a word or a character contained in the sentence*/
public class containsStringExample {

	
	
	public static void main(String[] args) {
		
		String p1="My name is sathappan";
		System.out.println(p1.contains("is")); //true
		System.out.println(p1.contains("Is")); //falase
		System.out.println(p1.contains("JAVA")); //false
		
	}

}
