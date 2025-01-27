package ExceptionHandling;

public class Employee {

	String name;
	
	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		try {
			
		int p[]=new int[2];
		p[5]=100; //AIOB
	
		int i=9/0; 		/*Exception in thread "main" java.lang.ArithmeticException:*/ 
		
		Employee obj=new Employee();
		obj =null;
		obj.name="naveen"; //NullPointerException
		//--
		//--
		//100
		}
		
		catch(ArithmeticException e) {
			System.out.println("AE is coming....");
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			System.out.println("NPE is coming....");
			e.printStackTrace();
		}
		catch (RuntimeException e) {
			System.out.println("some exception is coming");
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("some exception is coming");
			e.printStackTrace();
		}
		catch (Throwable e) {
			System.out.println("some exception is coming");
			e.printStackTrace();
		}
		System.out.println("Bye");
	}
}