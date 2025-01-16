package EncapsulationAssignments;

/*Whenever you have public methods and those methods are calling the private data members - is called encapsulation*/
/*Example - Laptop keyboard,screen are public layer ...motherboard,RAM, Hard drive etc..are private data member */

public class Employee {
	//POJO: Plain Old Java Object
	//should not extend and implements
	//should not have any annotations @
	
	//	Constructor is helping as full setter ; Give all the values in one and restrict the object
	//  Getter is helping me to get the latest value of the particular object
	//  Setter is helping me individual value and update the value 
	//  Some **private data member are getting accessed by other public data member of the class** (i,e, accessed by public getter , setter and constructor . this is called Encapsulation 
	// Example of Encapsulation - Page object model
	
	
	private String name; //private data members
	private int age;
	private double salary;
	private boolean isActive;
	

	// const...full setter	
	public Employee(String name, int age, double salary, boolean isActive) {
		if (name.length() != 0) {
			this.name = name;
		} else {
			System.out.println("name can not be blank");
		}

		if (age >= 18) {
			this.age = age;
		} else {
			System.out.println("age should be gr than or eq to 18");
		}

		this.salary = salary;
		this.isActive = isActive;
	}

	// public getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() != 0) {
			//this.global = local variable
			this.name = name;
		} else {
			System.out.println("name can not be blank");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 18) {
			this.age = age;
		} else {
			System.out.println("age should be gr than or eq to 18");
		}
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
