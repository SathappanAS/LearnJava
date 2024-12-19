package IFElseAndSwitchCaseExercise;

public class MaxNumber {

	public static void main(String[] args) {
		int x=25;
		int y=78;
		int z=87;
		if(x>y && x>z) { //F &&
			System.out.println("x is the greatest number");
		}
		else if(y>z) {
			System.out.println("y is the greatest number");
		}
		else {
			System.out.println("z is the greatest number");
		}
	}

}
