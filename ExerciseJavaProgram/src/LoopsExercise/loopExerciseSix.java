package LoopsExercise;
/*print all old and even numbers between 1 to 100*/
public class loopExerciseSix {
	public static void main(String[] args) {
		
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				System.out.println("Even Number " + i);
			}
			else {
				System.out.println("Old  Number " + i);
			}
		}

	}
}