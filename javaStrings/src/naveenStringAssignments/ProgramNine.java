package naveenStringAssignments;
/*Write a program that breaks a whole string into small strings, and prints out its all values . (Hint: split, loop) .*/
public class ProgramNine {

	public static void main(String[] args) {
		
		 // Input string
        String inputString = "This is a sample string";
        
        // Split the string into small strings using space as the delimiter
        String[] smallStrings = inputString.split(" ");
        
        // Loop through the small strings and print each one
        for (String word1 : smallStrings) {
            System.out.println(word1 + ",");
        }
	}
}