package ExceptionHandling;
/*Doesn't matter exception is coming or not
 * it must be executed
 * */
public class FinallyBlock {

	public static void main(String[] args) {
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		try {
			int i=9/0;
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming...");
			e.printStackTrace();
		}
		finally{
			System.out.println("finally block");
		}
	}	
}