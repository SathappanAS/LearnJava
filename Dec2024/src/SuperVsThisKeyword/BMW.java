package SuperVsThisKeyword;

public class BMW extends Car {
	
	int min_speed=200;
	
	public BMW() {
		System.out.println("BMW --- default cons...");
	}
	
	
	public BMW(int i) {
		super(); 
		System.out.println("BMW --- one Param cons..." + i);
	}
	
	public BMW(int i,int j) {
		System.out.println("BMW --- two Param cons..." + i + j);
	}
	
	
	@Override
	public void start() {
		System.out.println("BMW-----Start");
		//start(); //calling the same method in BMW;
		super.start();
		stop();
	}

	public void displaySpeed() {
		System.out.println(min_speed);
		System.out.println(super.min_speed);
		int carSpeed=super.min_speed;
		System.out.println(carSpeed);
	}
}
