package ExceptionHandling;
public class User {
	public static void div(int a,int b) {
		System.out.println("div method");
		int d=0;
		try 
		{
		d=a/b;
		}
		catch(ArithmeticException e) 
		{
			//reporting/logging/screenshot/fail/validation message
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("div done" +  d);
	}
	
	public static void main(String[] args) {
		div(10,0);
		System.out.println("bye");
	}
}

/*div method
java.lang.ArithmeticException: / by zero
	at Dec2024/ExceptionHandling.User.div(User.java:8)
	at Dec2024/ExceptionHandling.User.main(User.java:18)
div done0
bye
*/