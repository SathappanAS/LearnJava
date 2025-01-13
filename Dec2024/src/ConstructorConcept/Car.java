package ConstructorConcept;
public class Car {
	String name;
	int price;
	String licenseNum;
	double mileage;
	boolean isAvailable;
	
//AC:
//no unnecessary car in the system
//create the car details with the following combinations:
//1.name, price
//2.name, licenseNum
//3.name, price, licenseNum
//4. name, price, licenseNum, mileage, isAvailable
	
	
/* --------------------------CONSTRUCTOR VS FUNCTION --------------------------*/
//Const... can not return anything, no void also but function may or may not return
//Const... can be overloaded, so function can also be overloaded
//Const... name is always as same as class name but function name can be anything
//we should not write any business logic inside the const...because there is not return
//function should have the business logic or functionality
//const.. is used to init the instance var with local var
//const .. is helping to create the required object, and helping to avoid unnecessary objects
//const... will be called when you create the object of the class
//but function will be called using the obj ref name
// const... can not be static but function can be static
// can const.. call another const..? using this keyword---later(next class)
// can we call a function from a const...?: Yes
//can we call a const from a function ..?: Yes(just create the object)
		
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
		sendMail();
		Car.readMail();
	}

	
	public Car(String name, String licenseNum) {
		this.name = name;
		this.licenseNum = licenseNum;
	}


	public Car(String name, int price, String licenseNum) {
		this.name = name;
		this.price = price;
		this.licenseNum = licenseNum;
	}


	public Car(String name, int price, String licenseNum, double mileage, boolean isAvailable) {
		this.name = name;
		this.price = price;
		this.licenseNum = licenseNum;
		this.mileage = mileage;
		this.isAvailable = isAvailable;
	}
	
	public void sendMail() {
		System.out.println("SendMail");
		Car c7=new Car("just call",90);
	}
	
	public static void readMail() {
		System.out.println("readMail");
	}

	//caller method / user method
	public static void main(String[] args) {
		Car c1=new Car("BMW X1", 50);
		
		//CRUD - Create; Retrieve ; Update ; Delete 
		Car c2=new Car("Honda",30,"licasd"); // Create - post 
		Car c3=new Car("Honda",30,"asad",12.33,true);
		
		//Retrieve--GET
		System.out.println(c2.name+ " "+c2.price + " "+c2.licenseNum+ " "+c2.mileage+ " "+c2.isAvailable);
		
		//update --PUT/PATCH
		//update the mileage and isAvailable
		c2.mileage=12.11;
		c2.isAvailable=true;
		
		//Retrieve--GET
		System.out.println(c2.name+ " "+c2.price + " "+c2.licenseNum+ " "+c2.mileage+ " "+c2.isAvailable);
	}
}