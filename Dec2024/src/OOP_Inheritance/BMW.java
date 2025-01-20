package OOP_Inheritance;

//method overriding : 
//When you have a method in parent class and the same method in child class:
//1. with the same name
//2. with the same number of parameters
//3. with the same return type	


//IS - A relationship
public class BMW extends Car{
	
	@Override
	public void start() {
		System.out.println("BMW --- start");
	}
	 
	public void autoParking() {
		System.out.println("BMW --- autoParking");
	}
	
	@Override
	public void engine() {
		System.out.println("BMW----engine");
		Truck tr=new Truck();
		tr.transport(); //composition: HAS -- A relationship
	}
	
	
	
	public static void billing() {
		System.out.println("BMW----billing"); 
		//Static method can't have overridden but can have same method in both class
	}
	
	
//	private void rating() {
//		System.out.println("BMW -- rating");
//	}
	
}



