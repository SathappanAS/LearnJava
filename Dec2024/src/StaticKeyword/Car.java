package StaticKeyword;

public class Car {
	//class variables:
	
	//1. instance variables
	String name;
	int price;
	String licenseNumber;
	
	//2. static variables/class variables: will never be part of the object
	//JVM will create only one common copy for the static variables
	//CMA: Common Memory Allocation/Permanent Generation --->Metaspace
	static final int wheels =4;
	//final static int wheels =4;
	
	public static void main(String[] args) {
		
		Car c1=new Car();
		c1.name = "BMW";
		c1.price = 25;
		c1.licenseNumber="Honda1234";
		
		//how to access static variables:
		//1. use it directly:
		System.out.println(wheels); //4
		//2. using it by class name:
		System.out.println(Car.wheels);
		
		
		//how to access non static(object variables): using by object reference name:
		System.out.println(c1.name);
		System.out.println(c1.name + " " + c1.price + " " + c1.licenseNumber +  " " + Car.wheels);
		
		
		//3. can I access static variables using the object reference name ? : Yes
		// Warning: The static field car.wheels should be accessed in a static way
		System.out.println(c1.wheels);
		
		Car c2=new Car();
		c2.name = "AUDI";
		c2.price = 125;
		c2.licenseNumber="Honda9753";
		System.out.println(c2.name + " " + c2.price + " " + c2.licenseNumber +  " " + Car.wheels);
		
		Car c3=new Car();
		c3.name = "Honda";
		c3.price = 20;
		c3.licenseNumber="Honda922753";

	}

}
