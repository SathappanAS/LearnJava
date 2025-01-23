package SuperVsThisKeyword;

public class Car {
	
	
	public Car() {
		System.out.println("Car --- default cons...");
	}
	
	
	public Car(int i) {
		System.out.println("Car --- one Param cons..." + i);
	}
	
	public Car(int i,int j) {
		System.out.println("Car --- two Param cons..." + i + j);
	}

	int min_speed=100;
	
	public void start() {
		System.out.println("Car-----Start");
	}
	
	public void stop() {
		System.out.println("Car-----Stop");
	}
	
}
