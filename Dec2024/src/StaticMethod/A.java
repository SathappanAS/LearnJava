package StaticMethod;

public class A {

	public static void main(String[] a) {
		System.out.println("hello A");
		
		//a: String array[]
		System.out.println(a.length);//0
		System.out.println(a[0]);//AIOB
		
		B.main(a);

	}

}
