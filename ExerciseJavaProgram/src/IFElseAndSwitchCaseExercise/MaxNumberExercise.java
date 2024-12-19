package IFElseAndSwitchCaseExercise;
public class MaxNumberExercise {
	public static void main(String[] args) {
		int a=25;
		int b=100;
		int c=87;
		int d=97;
		// && Short circuit operator
		if (a>b && a>c && a>d) {//F && NO(Don't this condition
			System.out.println("a is biggest number");
		}
		else if (b>c && b>d) {
			System.out.println("b is biggest number");
		}
		else if (c>d) {
			System.out.println("c is biggest number");
		}
		else {
			System.out.println("d is biggest number");
		}
	}
}