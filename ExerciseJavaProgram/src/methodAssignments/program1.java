package methodAssignments;
/*Write a program to print the addition/subtraction/division/multiplication of two numbers by defining your own method*/
public class program1 {

	
	public int addition(int a,int b) {
		int c=a+b;
		System.out.println("add " + c);
		return c;
	}
	
	public int subtraction(int a,int b) {
		int c=a-b;
		System.out.println("sub " + c);
		return c;
	}
	
	public int division(int a,int b) {
		int c=a/b;
		System.out.println("division " + c);
		return c;
	}
	
	public int multiplication(int a,int b) {
		int c=a/b;
		System.out.println("multiplication " + c);
		return c;
	}
	
	public static void main(String[] args) {
		
		program1 cal=new program1();
		cal.addition(31, 30);
		cal.subtraction(31, 30);
		cal.division(10,5);	
		cal.multiplication(2, 5);
		
	}

}
