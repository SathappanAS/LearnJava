package StringAssignments;
/*Write a program to verify a word or a character contained in the sentence*/
public class charPrint {

	public static void main(String[] args) {
		String word ="I am coding java daily";
			
		if(word.contains("daily")) {
			System.out.println("true");
		}
		else {
			System.out.println("fail");
		}
		
	}

}
