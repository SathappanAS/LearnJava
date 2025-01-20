package ConstructorAssignments;
/*Create a Java class named "Employee" with the following instance variables:

id (int)
name (String)
salary (double)
Create a constructor for the Employee class that takes in the id, name, and salary as parameters and initializes the instance variables.

Create getter methods for each of the instance variables.

Create a main method that creates an instance of the Employee class using the constructor, 
prints out the employee's information using the getter methods, and gives the employee a 10% 
raise using the setter method for the salary instance variable.*/


public class Employee {
	
	
	int id;
	String name;
	double salary;
	
	public Employee(int id,String name,double salary) {
		//this.golbal var = new var
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		double newsalary = this.salary+(this.salary*0.10); 
		return newsalary;
	}


	public static void main(String[] args) {
		Employee test=new Employee(369,"testing",4000);
		System.out.println(test.getId());
		System.out.println(test.getName());
		System.out.println(test.getSalary());
		
//		double newSalary = test.salary+(test.salary*0.10);
//		System.out.println(newSalary);
	}
}
