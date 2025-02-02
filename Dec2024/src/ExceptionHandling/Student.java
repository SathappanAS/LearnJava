package ExceptionHandling;

public class Student {
	
	public static int getMarks(String studentName) {
		System.out.println("getting marks for : " + studentName);
		
		if(studentName.equals("divya")) {
			
					try 
					{
					int i=9/3;
					return 90;
					}
					catch(ArithmeticException e) 
					{
						return 80; //80 will returned
					}
					finally {
						System.out.println("Hi");
						//return 65; 
					}
			//Note : If you have written "return keyword" in the finally block , it return that value only
		}
		else if(studentName.equals("pritesh")) {
			return 100;
		}
		else if(studentName.equals("pritesh")) {
			return 95;
		}
		else {
			return -1;
		}
		
	}

	public static void main(String[] args) {
		int m = Student.getMarks("divya");
		System.out.println(m);

	}

}
