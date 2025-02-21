package naveenStringAssignments;
/*Write a program to check two different strings equality*/
public class stringsEquality {

	public static void main(String[] args) {
		
		String s1="test";
		String s2="test";
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2)); //true
		
		String s3=new String("test");
		String s4=new String("test");
		System.out.println(s3==s4); //false
		System.out.println(s3.equals(s4)); //true
		
		System.out.println(s1==s3); //false
		
		System.out.println(s1.equals(s4));  //true
	}

}
