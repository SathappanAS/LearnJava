package SuperVsThisKeyword;

public class Vehicle {

	int min_speed=50;
	
	public Vehicle() {
		System.out.println("Vehicle----default const...");
	}
	
	public Vehicle(int i ) {
		System.out.println("Vehicle----one const..." + i );
	}
}