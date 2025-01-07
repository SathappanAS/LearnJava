package FunctionsConcept;

public class Employee {
	// duplicate functions are not allowed in them same class
	
	//poly(many) + morphism(forms) --> compile time(static)(fixed)
	//method overloading: when you have multiple method in the same class:
	//1. with the same name
	//2. with the different number of parameters and different types of params
	//3. with the different sequence of parameters
	//4. return  type does not matter
	//5. method body (total lines of code) doesn't matters
	
	
	
	public void test(int a) { //1 param
		System.out.println("test method1");
	}
	
	public void test (String a) { //1 param
		System.out.println("test method2");
	}
	
	public void test (int a, int b) { //2 param
		System.out.println("test method3");
	}
	
	public void test (int c, String d) { //2 param
		System.out.println("test method5");
	}
	
	public void test (String c, int d) { //2 param
		System.out.println("test method5");
	}
	
	
	//login:
	public void login() {
		
	}
	
	public void login(String un,String pwd) {
		
	}
	
	public void login(String um, String pwd, int otp) {
		
		
	}
	
	
	public void login(String um, String pwd, int otp, String reCaptcha) {
		
		
	}
	
	//search:
	public void search() {
		
	}
	
	public void search(String productName) {
		
	}
	
	public void search(String productName, int price) {
		
	}
	
	public void search(String productName,int price, String color) {
		
	}
	
	//payments:
	public void doPayment(String upi) {
		
	}
	
	public void doPayment(String cc,int cvv) {
		
	}
	
	public void doPayment(String cc,int cvv,int discount) {
		
	}
	
	
	//uber: booking feature:
	
	public void booking(String carType,String stPoint, String endPoint) {
		
	}
	public void booking(String stPoint, String endPoint) {
		
	}
	public void booking(String carType,String stPoint,String endPoint, String bookingType) {
		
	}
	
	//selenium link
	
	public void click(String element) {
		
	}
	
	public void click(String element, int x,int y ) { //corner of the screem x&y
		
	}
	
	//interview questions
	public void yum(byte a) {
		System.out.println("hi byte");
	}
	public void yum(short a) {
		System.out.println("hi byte");
	}
	public void yum(int a) {
		System.out.println("hi byte");
	}
	public void yum(long a) {
		System.out.println("hi byte");
	}
	
	
	public static void main(String[] args) {
		Employee e1=new Employee();
		
		
		e1.yum(10);
		e1.yum(10L);
		e1.yum((short)10);
		
		e1.test(10);
		e1.test(100,"naveen"); //call by value

	}

}
