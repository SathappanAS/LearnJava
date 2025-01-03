package StaticKeyword;

public class Employee {

	//instance vars:
	String name;
	int empId;
	double salary;
	String deptName;
	
	//class variables or static variable
	static String compName;
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		System.out.println(e1.name);
		System.out.println(Employee.compName);
	}

}
