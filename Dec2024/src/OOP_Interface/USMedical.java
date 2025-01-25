package OOP_Interface;

public interface USMedical extends WHO{
	
	//abstract method:
	//no method body, only method declaration
	//only method prototype
	//can not create the object of the Interface
	
	public void dentalServices();
		
	public void entServices();
	
	public void physioServices();
	
	public void emergencyServices();
	
	//public int test(int i,int j);
	
	public void orthoServices();
	
	
	//after JDK1.8, TWO Major changes:
	
	//1. static method with method body: but not abstract
	//cannot be overridden
	public static void billing() {
		System.out.println("USM--billing");
	}
	
	//2. default method with body : not a static and not a abstract
	//can be overrideen
	default void medicalPolicy() { //keyword default is onlt for interface
		System.out.println("USM--medical policy");
	}
	
	
}