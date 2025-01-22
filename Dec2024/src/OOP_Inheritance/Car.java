package OOP_Inheritance;

//final class -- can not be a parent: preventing inheritance / no extends
public class Car extends Vehicle {

	//method is declared with final keyword, can we override the final method? No
	//interview question 
	
	public final void info() {
		System.out.println("Car---info");
	}
	public void start() {
		System.out.println("car ---- start");
	}
	
	public void stop() {
		System.out.println("car--------stop");
	}
	
	public void refuel() {
		System.out.println("car------refuel");
	}
	
	@Override
	public void engine() {
		System.out.println("CAR----engine");
	}
	
	//static method can't be overridden
	//method hiding: static method i parent class and same in the child class //interview question
	public static void billing() {
		System.out.println("Car----billing");
	}
	
	public static void taxation() {
		System.out.println("Car----taxation");
	}
	
	
	
	
	private void rating() {  //encapsulation
		System.out.println("Car -- rating");
	}
	
	public void r1() { //encapsulation
		rating();
	}
		

	public void carRating() {
		rating();
	}
	
}