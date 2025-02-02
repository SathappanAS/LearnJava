package StringAssignments;

public class findthePositionofChar {

	public static void main(String[] args) {
		String name="My name is Sathappan";
		
		int lengthofString=name.length();
		System.out.println(lengthofString);  // 20
		
		int li=0;
		int hi=lengthofString-1;
		
		System.out.println("lowest index of the string " + li); //0
		System.out.println("lowest index of the string " + hi); //19
		
		
		System.out.println(name.charAt(0)); //M
		
		System.out.println(name.indexOf('a')); //4
		
		int firstPosition=name.indexOf('a');
		
		//2nd position of 'a'
		
		int SecondPosition=name.indexOf('a', firstPosition+1);
		System.out.println(SecondPosition);
		
		
		int thirdPosition=name.indexOf("a", SecondPosition)+1;
		System.out.println(thirdPosition);
		
	}

}
