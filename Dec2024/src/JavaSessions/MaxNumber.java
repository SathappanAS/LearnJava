package JavaSessions;

public class MaxNumber {

	public static void main(String[] args) {
		
		
		int x=100;
		int y=00;
		int z=600;
		
		
		//&& -- short circuit operator
		//&
		
		if(x>y && x>z) { //F &&
			System.out.println("x is the greatest number");
		}
		else if(y>z) {
			System.out.println("y is the greatest number");
		}
		else {
			System.out.println("z is the greatest number");
		}
		
//		if(10>5 && 10>7 && 10<20 && 10>30) {
//			//t && t & t & f 
//			System.out.println("hi");
//		}
//		else {
//			System.out.println("bye");
//		}
	}
}