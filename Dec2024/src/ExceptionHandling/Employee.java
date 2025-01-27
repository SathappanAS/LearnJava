package ExceptionHandling;

public class Employee {

	String name;
	
	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		try {
		int i=9/0; 		/*Exception in thread "main" java.lang.ArithmeticException:*/ 
		
		Employee obj=new Employee();
		obj =null;
		obj.name="naveen"; //NullPointerException
		}
		
		catch(ArithmeticException e) {
			System.out.println("AE is coming....");
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			System.out.println("NPE is coming....");
			e.printStackTrace();
		}
		System.out.println("Bye");
	}
}