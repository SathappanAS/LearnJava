package SwitchCaseUseCasesExercise;

public class VowelCharacterExecise {

	public static void main(String[] args) {
		
		char alpha = 97;
		
		switch (alpha) {
		case 97:
			System.out.println(alpha + " is a vowel " + (int)alpha);
			break;
		case 101:
			System.out.println(alpha + " is a vowel" + (int)alpha);
			break;
		case 105:
			System.out.println(alpha + " is a vowel" + (int)alpha);
			break;
		case 111:
			System.out.println(alpha + " is a vowel" + (int)alpha);
			break;
		case 117:
			System.out.println(alpha + " is a vowel"+ (int)alpha);
			break;
		default:
			System.out.println(alpha + " is not a vowel"+ (int)alpha);
			break;
		}
	}
}
