package AccMod1;

public class BMW extends Car{

	@Override
	public void start() {
		System.out.println("BMW---start");
	}
	
	@Override
//	protected void stop() {
//		System.out.println("BMW---start");
//	}
//  (or) - 
	public void stop() {
		System.out.println("BMW---start");
	}
	
	@Override
	//default, protected, oublic
	void refuel() {
		System.out.println("bmw---refuel");
	}
	
	// can't override
	private void billing() {
		System.out.println("car---billing");
	}
	
	public static void main(String[] args) {
		
		BMW b=new BMW();
		b.color="Yellow";
		

	}
}
