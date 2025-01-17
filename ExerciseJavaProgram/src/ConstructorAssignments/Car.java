package ConstructorAssignments;
/*Create a Java class named "Car" with the following instance variables:
make (String)
model (String)
year (int)

Create a constructor for the Car class that takes in the make, model, and year as parameters and initializes the instance variables.
Create a default constructor for the Car class that sets the make, model, and year to "Unknown".
Create a main method that creates three instances of the Car class using both constructors and prints out their information.*/

public class Car {
	String make;
	String model;
	int year;
	
	public Car(String make,String model,int year) {
		this.make=make;
		this.model=model;
		this.year=year;
	}
	
	public Car() {
		
	}
	
	public static void main(String[] args) {
		Car c1=new Car();
		System.out.println("------------------Default Constructor--------------------");
		System.out.println(c1.make + " " + c1.model + " " + c1.year);
		
		Car c2=new Car("Tesla","ModelY",2025);
		System.out.println("-------------------Parameter Constructor-------------------");
		System.out.println(c2.make + " " + c2.model + " " + c2.year);
	}
}