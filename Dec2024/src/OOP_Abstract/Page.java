package OOP_Abstract;

public abstract class Page {
	
	//abstract class: can not have the object
	//can have:
		//Only abstract methods : 100% abstract
		//only non-abstract methods : 0% abstract
		//Both abstract + non-abstract methods also : partical abstract
		// 0 to 100% abstraction
	
	
	// can not create the object of the abstract class 
	//but we can create the constructors of the abstract class
	//it will be called when we create the object of the child class 
	
	public Page() {
		System.out.println("Page-----page constructiors");
	}
	
	
	public Page(int i) {
		System.out.println("Page-----one param constructiors" +  i);
	}
	
	public Page(int i,int j) {
		System.out.println("Page-----two param constructiors" +  i + j);
	}
	
	
	
	/*Importance Interview Question*/
	//Whenever we have parent class and the child class ,parent default construtor will called first
	
	
	public abstract void title(); //abstract keyword is mandatory whereas abstract keyword is not mandatoryin interface

	public abstract void url();
	
	//normal method can be present in abstract class
	public final void displayLogo() {
		System.out.println("display logo");
	}
	
	public void timeOut() {
		System.out.println("time out: 10 secs");
	}
	
//	public final void testFinal() {     Note: Final Method can't be overridden
//		System.out.println("time out: 10 secs");
//	}
	
	public static void displayFooter() {
		System.out.println("page---footer");
	}
	
}
