package SwitchCaseUseCasesExercise;
/*WAP to run your test cases in a specific environment like: QA, Stage, Dev, UAT, Prod using using Switch - Case*/

public class specificEnvironmentSwitchCaseUseCase {

	public static void main(String[] args) {
		
		String Environment = "Stage";
		
		switch (Environment.toLowerCase().trim()) {
		case "qa":
			System.out.println("launch QA");
			break;
		case "stage":
			System.out.println("launch Stage");
			break;
		case "dev":
			System.out.println("launch Dev");
			break;
		case "uat":
			System.out.println("launch UAT");
			break;
		default:
			System.out.println("invalid browser, can't be lanuched");
			break;
		}
	}
}