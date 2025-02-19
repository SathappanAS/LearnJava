package StringManipulation;
/*Very Important Interview Question*/
public class StringBuilderVsStringBuffer {

	public static void main(String[] args) {
		
		
		//Immutability - Immutable, once created cannot be changed
		//Thread-Safe due to immutability
		String s1="hello";
		s1.concat(" Automation");
		System.out.println(s1); //hello
		System.out.println(s1.concat(" Automation")); //hello Automation
		
		//Mutable, content can be changed
		//Not thread-safe, ideal for single-threaded scenarios
		StringBuilder sb = new StringBuilder("hello ");
		sb.append("Automation"); //helloautomation
		System.out.println(sb);
			
		//Mutable, content can be changed
		//Thread-safe, synchronized for multi-threaded scenarios
		StringBuffer sbf=new StringBuffer("testing");
		sbf.append(" selenium");
		System.out.println(sbf); //testing selenium
		
		
	}

}