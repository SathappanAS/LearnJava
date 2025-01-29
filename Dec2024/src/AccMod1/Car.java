package AccMod1;

public class Car {
	
	public void start() {
		System.out.println("car---start");
	}
	
	protected void stop() {
		System.out.println("car---start");
	}
	
	
	void refuel() {
		System.out.println("car---refuel");
	}
	
	
	public String name;
	int price; //default is only intergace
	protected String color;
	private String licenseNumber;

	public static void main(String[] args) {
		
		Car c = new Car();
		c.name = "test";
		
		

	}

}
