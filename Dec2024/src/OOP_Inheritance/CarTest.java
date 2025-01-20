package OOP_Inheritance;

public class CarTest {

	public static void main(String[] args) {
		
		BMW b=new BMW();
		b.start(); // overridden method
		b.stop(); // inherited method 
		b.refuel(); //inherited method 
		b.autoParking(); // individual 
		b.engine(); //Overidden method
		b.loading(); //inherited method
		BMW.billing();
		BMW.taxation(); //inherited static method //interview question
		Car.taxation();
		
		/**/
		
		System.out.println("-----------------------");
		Audi au=new Audi();
		au.start(); //Overidden method
		au.refuel(); // inherited method 
		au.stop(); // inherited method 
		au.theftSafety(); // individual method
		au.autoParking(); 
		
		System.out.println("-----------------------");
		//
		Car c = new Car();
		c.start(); 
		c.refuel();
		c.stop();
		c.engine(); //Overidden method 
		c.loading(); // inherited method
		Car.billing();
		// c.autoParking(); Parent can't take anything from child class (Multiple inheritance (Diamond Problem)
		
		
		
		
	}

}