package StaticMethod;

public class Testing {

	public int add(int a, int b) {
		System.out.println("adding");
		return a+b;
	}
	
	//PSVM(String [])
	//caller method: user method
	//we will never the business logic in the main
	public static void main(String[] test) {
		System.out.println("hello world");
		System.out.println(test.length);
		System.out.println(test[0]);//black of length of array
		//return 100;
		//System.out.println(test.length);
	}	
}