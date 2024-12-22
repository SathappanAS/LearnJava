package LoopsExercise;
/*Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop*/


public class loopExerciseEight {

	public static void main(String[] args) {
	
		
		for(char ch='A';ch<='Z';ch++) {
			System.out.println(ch + " = " + (int)ch);
		}
		System.out.println("====================");
		
				char cha='a';
				while(cha<='z') {
					System.out.println(cha + " = " + (int)cha);
					cha++;
				}
				System.out.println("====================");
		
		char letter='0';
		while (letter<='9') {
			System.out.println(letter + " = " + (int)letter);
			letter++;
		}
	}

}
