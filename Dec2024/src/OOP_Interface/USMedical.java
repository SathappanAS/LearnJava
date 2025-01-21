package OOP_Interface;

// abstract method:
// no method body, only method declaration
// only method prototype 
// can not create the object of the Interface


public interface USMedical extends WHO{
		
	public void dentalServices();
	
	public void entServices();
	
	public void physioServices();
	
	public void emergencySercies();
	
	public void orthoServices();
	
	
	//public int test(int i);
	
	// after JDK 1.8, two major changes:
	// 1. static method with method body : but not abstract:
	// 2. Can't be overridden
	public static void billing() {
		System.out.println("USM----billing");
	}
	
	// 2. default method with body: not a static
	//It can be overridden also
	default void medicalPolicy() {
		System.out.println("USM-----medical policy");
	}
	
	
	
}