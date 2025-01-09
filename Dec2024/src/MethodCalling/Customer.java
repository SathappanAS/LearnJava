package MethodCalling;

public class Customer {
	
	public void m1() {
		System.out.println("m1 method");
	}
	/***************************************/
	public static void t1(Customer ob) {
		System.out.println("t1 method");
		ob.m1();
//		Customer c=new Customer();
//		c.m1();
		
		
	
	}

	public static void main(String[] args) {
		
		Customer obj=new Customer();
		obj.m1();
		Customer.t1(obj);//call by reference
		
	}

}
