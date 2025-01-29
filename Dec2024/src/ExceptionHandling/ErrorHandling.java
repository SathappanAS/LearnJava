package ExceptionHandling;

public class ErrorHandling {
	
	public static void test() {
		test(); 
	}

	public static void main(String[] args) {
		
		System.out.println("A");
		
		try {
			test();
		} 
		catch(Error e) {
			System.out.println("Some error is coming");
			e.printStackTrace();
		}
		
		System.out.println("bye!!");

	}

}