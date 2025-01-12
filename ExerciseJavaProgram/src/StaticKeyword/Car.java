package StaticKeyword;

public class Car {
	
	//instance variable
	String carName;
	int YearoftheModel;
	String color;
	
	static int wheels=4;

	public static void main(String[] args) {
	//instance of the class
	Car user1=new Car();
	user1.carName="BMW";
	user1.YearoftheModel=2025;
	user1.color="Red";
	
	System.out.println(wheels);
	System.out.println(Car.wheels);
	
	final int wheels=23; //local variables
	Car.wheels=9;
	//wheels=9;
	System.out.println(Car.wheels);	
	System.out.println(wheels);	
	
	
	
	}

}
