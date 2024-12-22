package LoopsExercise;
/*Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.*/
public class loopExerciseTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (char ch='a'; ch<='z';ch++) {
			if (ch=='a') {
				System.out.println(ch + " = " + (int)ch);
			}
			else if (ch=='e') {
				System.out.println(ch + " = " + (int)ch);
			}
			else if (ch=='o') {
				System.out.println(ch + " = " + (int)ch);
			}
			else if (ch=='i') {
				System.out.println(ch + " = " + (int)ch);
			}
			else if (ch=='u') {
				System.out.println(ch + " = " + (int)ch);
			}
		}
		System.out.println("******************");
		
		char vo ='a';
		while(vo<='z') {
			if (vo=='a') {
				System.out.println(vo + " = " + (int)vo);
			}
			else if (vo=='e') {
				System.out.println(vo + " = " + (int)vo);
			}
			else if (vo=='o') {
				System.out.println(vo + " = " + (int)vo);
			}
			else if (vo=='i') {
				System.out.println(vo + " = " + (int)vo);
			}
			else if (vo=='u') {
				System.out.println(vo + " = " + (int)vo);
			}
			vo++;
		}
	}
}