package JavaSessions;
public class DataTypes {
	public static void main(String[] args) {		
		// data types : strict type (Strictly you have to provide the type of the data )	
		//1. primitive data type : no object is needed : direct/fixed memory allocation
				//memory : bytes/bits : 1 byte = 8 bits
				// Values are pre-defined in Java
				
				// Integral family :
					// Integer : byte, short, int, long
		
					//floating-point : float, double
					// character : char {single digit}
					//boolean : true/false		
		//2. Non-primitive data type : object is needed : class, arrays, collections, Interface, String
		
		//1. byte: 
				/*byte - java keyword*/
				/*size : 1 byte = 8 bits*/ // -2^7 to 2^7-1 //
				/*range -128 to 127*/
				// Where you will use the byte data type in production - Example age of the human//  	
		byte b=10;
		b=20;
		System.out.println(b); //20
		byte c = 0;
		byte c1 = 91;
		byte c2=-127;
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		
		//2. Short :
				/*size : 2 byte = 16 bits*/
				/*range : -32768 to  32767 */  // -2^15 to 2^15-1 //
				// Where you will use the short data type in production - Example birth year of the human//
		short s = 500;
		System.out.println(s);
		short a1 = 1;
		System.out.println(a1);
		short a2=130;
		System.out.println(a2);
		
		//3. int :
				/*size 4 byte = 32bits*/
				/*range: -2147483648 to 2147483647 */ //-2^31 to 2^31-1//
				// where you will use the int data type in production - Employee Salary, Price , Student Mark, Billing amount
		int i = 1928344;
		int age=10;//memory allocation and memory optimization is very important in programming//we can use byte data type.
		System.out.println(i);
		System.out.println(age);
		
		// 4. long
				/*size 8 byte = 64bits */
		   		/*-2^63 to 2^63-1*/
				// Where you will use the long data type in production - Distance b/w two place, blood cells, world population
		long m = 989898;
		long distance = 12345678910l ; //The L suffix is required to write when the values to be stored is out of range of integer to tell compiler its long value
		long mobile = 9842498424l;
		System.out.println(m);
		System.out.println(distance);
		System.out.println(mobile);
		//Note : We should not use account number, ssn, Aadhaar card number,vehicle number,home number in integer family // 
		//we should store this number in string format because we are not doing any mathematical operation in static data type.//
		//we need to use primitive data type(byte,short,int,long) only we are performing any calculation //
		
		//5. float:
		/*size: 4 byte - 32bits(4*8) */
		/*range: after . it can take up to  6 to 7 digit */
		float t=12.33f;
		float t1=(float)12.33;
		System.out.println(t);
		System.out.println(t1);
		// Where you will use the long data type in production - pi value
		
		//6. Double
		/*size: 8 byte - 64bits */
		/*range: after . it can take up to 15 digit */
		// Where you will use the long data type in production = Interest calculation
		double d=12.3333333;
		double d1=-90.2345;
		double d2=-90.234d;
		System.out.println(d);
		System.out.println(d1);
		System.out.println(d2);
		
		
		//7.char: single digit value
		/*size: 2 byte = 16bits*/
		/* unicode  ASCII*/
		// Where you will use the char data type in production = Gender identification, execution (yes or no)
		char ch = 'a'; // a to z
		char ch1 = '7'; // 0 to 9
		char ch2 = 'A'; // A to Z
		char ch3 = '$';
		
		char gender = 'm';
		char execute = 'Y';
		char ch4 = ' '; //Only one single space is allowed
		char ch5 = 65;  /*ASCII VALUE*/
		
		System.out.println(ch);
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(gender);
		System.out.println(execute);
		
		
		//8. boolean: true/false literals 
		/*size only 1bit */ //approx 1 bit
		// any conditional operator we will use boolean, ex : if, if else, loops
		boolean bb = true;
		boolean cc = false;
		System.out.println(bb);
		System.out.println(cc);
		
		char ch6 = 65;
		System.out.println(ch6);
	}

}
