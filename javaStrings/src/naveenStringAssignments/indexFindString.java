package naveenStringAssignments;
/*Write a method which gives an index of (-1) if string is not available. 
It should return integer. If string is present, then it should return the specific index*/
public class indexFindString {

	public static void main(String[] args) {
		
		String str="My name is the sathappan";
		
		System.out.println(str.indexOf('z')); //-1
		System.out.println(str.indexOf('a')); //4

	}

}
