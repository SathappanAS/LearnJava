package OOP_Inheritance;

//method overriding : 
//When you have a method in parent class and the same method in child class:
//1. with the same name
//2. with the same number of parameters
//3. with the same return type

public class BMW extends Car{
	
	@Override
	public void start() {
		System.out.println("BMW---start");
	}
	
	public void autoParking() {
		System.out.println("BMW---auto parking");
	}
}