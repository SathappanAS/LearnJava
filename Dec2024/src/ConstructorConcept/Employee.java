package ConstructorConcept;

public class Employee {
	
	//class variable //instance variable 
	String name;
	int age;
	double salary;
	String dob;
	
	//Constructor:
	//name: className
	//const... is having the same name as the class name
	//const...will be called you create the object
	//const..is not a function
	//const .. can not return anything, can not be void also, there is no return trype
	//const.. can be overloaded
	
	
	public Employee() { //0 para const.. this is called default constructor
		System.out.println(" Default 0 param const... ");
	}
	
	public Employee(int i) {
		System.out.println(" 1 param const..." + i);
	}
	
	public Employee(int i,String p) {
		System.out.println(" 2 param const..." + i);
	}
	
	public Employee(String p,int i) {
		System.out.println(" 2 param const..." + i);
	}

	public static void main(String[] args) {
		Employee e1=new Employee(10);
		Employee e2=new Employee();
		Employee e3=new Employee(100, "Selenium");
		Employee e4=new Employee("Selenium", 100);	
	}
}