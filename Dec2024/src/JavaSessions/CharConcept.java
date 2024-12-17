package JavaSessions;

public class CharConcept {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(b/a);
		System.out.println("---------------");
		
		char c1 = 'a';
		char c2 = 'b';
		System.out.println(c1); // output : a ASCII Table a=97 
		System.out.println(c2); // output : b ASCII Table b = 98
		System.out.println(c1+c2); // ASCII Table a+b = 97+98 = 195
		System.out.println(c1+c2); // -1 {97-98}
		System.out.println("---------------");
		//ASCII Values :
		// a-z = 97 to 122
		// A-Z = 65 to 90
		// 0-9 = 48 to 57
		
		System.out.println('a'+'0');//97+48 = 145
		System.out.println("---------------");
		
		char c3=' '; //one single space allowed
		System.out.println((byte)c3); //32
		System.out.println("---------------");
		
		char c5='a';
		System.out.println((byte)c5);  //97
		System.out.println((byte)'1'); //49
		System.out.println(c5);  //c5
		System.out.println('1'); //1
		System.out.println("---------------");
		
		int p='a'; // It depends what we are printing ..
		System.out.println(p);//97 - Very famous interview question
		System.out.println("---------------");
		
		int q=66; // We can store char data type inside the int data type
		System.out.println((char)q);
		System.out.println("---------------");
		
		char t = 67; // In char data type== numbers can be stored without single quote
		System.out.println(t);//C
		
		System.out.println("---------------");
		char t1 = 8377;
		System.out.println(t1);//₹
		
		System.out.println("---------------");
		
		System.out.println((char)66);//B
		System.out.println((char)(46+20));//B
		System.out.println((char)(c1+c2));//Ã
		//unicode --> ascii codes + other symbolic + special chars
		
		System.out.println("---------------");
		char m1='D';
		System.out.println(m1);
		
		char m2 = 'a';
		System.out.println(m2);
	}

}
