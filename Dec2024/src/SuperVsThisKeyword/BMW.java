package SuperVsThisKeyword;


public class BMW extends Car {
	
	int min_speed=200;
	
	
	public BMW() {
		System.out.println("BMW--default const...");
	}
	
	public BMW(int i) {
		super(i);
		System.out.println("BMW--one param const..." + " " +i);
	}
	
	public BMW(int i,int j) {
		super(i,j);
		System.out.println("BMW--two param const..." + i + " " + j);
	}
	
	@Override
	public void start() {
		System.out.println("BMW-----Start");
		super.start(); //parent car method calling
		stop();
	}
	
	public void displaySpeed() {
		System.out.println(min_speed); //200
		System.out.println(super.min_speed); //100
		/*Super keyword used to call parent class variable and method, when the 
		 * method/variables are common between child/parent class */
		//int carSpeed = super.min_speed;
	}
}
