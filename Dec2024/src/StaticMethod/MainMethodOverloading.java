package StaticMethod;

public class MainMethodOverloading {

	public static void main(int a) {
		System.out.println("hello testing + " + a);

	}
	
	public static void main(int a, int b) {
		System.out.println("hello testing + " + (a+b));

	}
	
	//PSVM(String [])
	public static void main(String a[]) {
		System.out.println("hello testing");
		MainMethodOverloading.main(10);
	}
	
	public static void main(String a[],String b[]) {
		System.out.println("hello testing");

	}

}
