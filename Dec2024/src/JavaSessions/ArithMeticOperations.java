package JavaSessions;

public class ArithMeticOperations {

	public static void main(String[] args) {
		
		System.out.println(10 + 20); //30
		System.out.println(20 / 10); //2
		System.out.println(9 / 2); //4 (Note: .5 will be ignored because of 9&2 are integer value)
		System.out.println(9.0/2); //4.5 (Note: .5 will be displayed because of 9 or 2 (any one of them should be double or floating))
		
		System.out.println(9.0 / 3.0);// 3.0
		
		//System.out.println(9/0);//AE(ArithmeticException)(PureNumber)
		System.out.println(0 / 9);// 0
		
		System.out.println(9.0 / 0);// Infinity (Very famous interview question)(Infinity-Java Keyword)
		System.out.println(9 / 0.0);// Infinity 
		System.out.println(9.0 / 0.0);// Infinity
		
		// System.out.println(0/0);//AE

		System.out.println(0.0 / 0);// NaN - not a number
		System.out.println(0 / 0.0);// NaN
		System.out.println(0.0 / 0.0);// NaN

		// System.out.println('a'/0);//AE

		System.out.println(3.4f / 0);// Infinity
		
		
		System.out.println(0.1+0.4);//0.5
		System.out.println(0.1+0.2);//0.30000000000000004  (Very famous interview question)
		System.out.println(0.2+0.6);//0.8
		
		//src code --.class --machine code(010101)---> output
		//0.0001100110011001101 + 0.00110011001100110011 ==> large binary number--> double(64 bits)
		//x --> loss of precision error in floating point numbers
		
		System.out.println(9%3); // (Reminder is 0 )
		System.out.println(9%2); // (Reminder is 1 )
		System.out.println(9/3); // (quotient is 3)
		System.out.println(9/2); // (quotient is 4)
		
	}

}
