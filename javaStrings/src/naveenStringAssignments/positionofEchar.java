package naveenStringAssignments;

public class positionofEchar {

	public static void main(String[] args) {
		String str="Learn Java and Learn Selenium";
		int i = str.length();
		System.out.println("Lenght of the String : " + i);
		
		//First Position of e
		int FirstE=str.indexOf('e');
		System.out.println(FirstE);//1
		
		int SecondE=str.indexOf('e', FirstE+1);
		System.out.println(SecondE);//16
		
		int ThirdE=str.indexOf('e', SecondE+1);
		System.out.println(ThirdE);//22
	
	}
}