package StaticMethod;

public class Employee {

	public void sendMail() {
		System.out.println("send mail");
	}

	public static void readMail() {
		System.out.println("read mail");
	}

	public static void main(String[] args) {

		//1. how to access non static methods: create the object of the class
		Employee e = new Employee();
		e.sendMail();
		
		//2. how to access static methods:
		//a. call it directly:
		readMail();
		
		//b. using class name: recommeded
		Employee.readMail();
		
		//c. can use ref variable :
		e.readMail();//The static method readMail() from the type Employee should be accessed in a static way		
		
		TestUtil.readFile();
		
		TestUtil util = new TestUtil();
		util.writeFile();
		
	}

}