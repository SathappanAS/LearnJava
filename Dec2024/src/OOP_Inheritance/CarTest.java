package OOP_Inheritance;

public class CarTest {

	public static void main(String[] args) {
		
		BMW b1=new BMW();
		b1.start(); // overridden method
		b1.stop(); // inherited method
		b1.refuel(); // inherited method
		b1.autoParking(); //individual method 
	}

}
