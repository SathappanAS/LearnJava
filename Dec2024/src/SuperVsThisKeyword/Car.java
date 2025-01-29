package SuperVsThisKeyword;

public class Car extends Vehicle {
	
	//int min_speed=100;
	
	public Car() {
		System.out.println("car--default const...");
	}
	
	public Car(int i) {
		System.out.println("car--one param const..." + " " +i);
	}
	
	public Car(int i,int j) {
		this();
		System.out.println("car--two param const..." + i + " " + j);
	}
	
	public void start() {
		System.out.println("Car-----Start");
	}
	
	public void stop() {
		System.out.println("Car-----Stop");
	}
	
}

//super keyword will not create any memory in the heap like object
//super keyword is one of the way to call the parent class method or variable