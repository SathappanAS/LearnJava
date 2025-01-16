package MethodCalling;

public class Browser {
	
	public void m0() {
		System.out.println("m0 method");
	}
	
	public void m1() {
		System.out.println("m1 method");	
		m2();
	}
	
	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	
	public void m3() {
		System.out.println("m3 method");
		t3();
	}
	
	
	//**************************************
	
	public static void t1() {
		System.out.println("t1 method");
		t2();
	}
	
	public static void t2() {
		System.out.println("t2 method");
		t3();
	}
	public static void t3() { //static
		System.out.println("t3 method");
		Browser bh=new Browser(); //S-->NS: have to create the object
		bh.m1();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser br=new Browser(); //br-local variable 
		br.m1();

		//NS --- NS : direct calling
		//S -- S: Direct calling or class name
		//NS --> S: Direct calling or class name
		//S--> NS: have to use object reference: call by ref

		
	}

}
