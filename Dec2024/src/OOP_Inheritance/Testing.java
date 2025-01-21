package OOP_Inheritance;

public class Testing {

	public static void main(String[] args) {
		
		System.out.println("-----------Top casting----------");	
	//child class object can be referred by parent class reference variable : Yes
	//Top/Up Casting
	//c ---> car class object reference
	//new BMW() -->
	Car c=new BMW();
	c.start();
	c.info();
	c.stop();
	c.refuel();
	c.engine();
	//c.autoParking() = BMW - Individual method can't be accessed by 'c' object reference . (Ref type check) will fail
	//ref type check
	
	System.out.println("---------Top casting---------");
	
	Vehicle v = new BMW();
	v.engine();
	
	
	System.out.println("--------Down casting------------");
	//parent class object can referred by child class variable
	//Down casting:	
	BMW b= (BMW) new Car();// ClassCastException
	
	//BMW b= (BMW) new Vehicle(); 
	
	//Audi au=(Audi) new BMW();
	
	}
}
