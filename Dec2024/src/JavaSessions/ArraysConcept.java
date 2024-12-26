package JavaSessions;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
		/*               array             */
		//array : static array //Homogeneous (disadvantages)
		//1. new keyword
		//2. array literals
		
		//int array:
		int i[]=new int[4]; //new keyword //16bytes storage (4*4=16 Bytes)
		//length of the array = 3
		
		//i[-1]=500; //AIOB - Negative index not allowed in java
		i[0]=100;
		i[1]=200;
		i[2]=300;
		i[3]=400;
		//i[4]=500; //AIOB //RunTime Error
		
		//System.out.println(i); //[I@2dda6444 {Address of the memory}
		
		System.out.println(Arrays.toString(i)); //Arrays - class
		System.out.println("*********************************************");
		System.out.println(i[0]);
		System.out.println(i[3]);
		//System.out.println(i[4]); // ArrayIndexOutOfBoundsException //AIOB
		
		System.out.println(i.length);
		System.out.println("*********************************************");
		int len = i.length;
		System.out.println("Li = " + 0);
		System.out.println("Hi = " + (len-1));
		System.out.println("length = " + (len));
		
		System.out.println("*********************************************");
		
		
		int p[]=new int[4];
		p[0]=10;
		p[2]=20;
		p[3]=30;
		System.out.println(p[1]); //0 Default value of integer will be 0(ZERO)
		System.out.println(Arrays.toString(p));
		
		System.out.println("*********************************************");
		
		
		//print all the value of the array, iterate the array : using for loop:
		
		int price[]=new int[4];
		price[0]=100;
		price[1]=200;
		price[2]=300;
		price[3]=400;
		
		System.out.println(Arrays.toString(price));
		
		for(int k=0;k<price.length;k++) {
			System.out.println(price[k]);
			if(price[k]==200) {
				System.out.println("bye!!");
				//break;
			}
		}
		System.out.println("*********************************************");
		//double array:
		double d[]=new double[2]; //16 bytes (8*2 = 16bytes)
		d[0]=12.33;
		//d[1]=23.44;
		System.out.println(Arrays.toString(d));
		
		//char array:
		System.out.println("*********************************************");
		char ch[]=new char[3]; //0-2
			//		ch[0]='a';
			//		ch[1]='b';
			//		ch[2]='c';
		System.out.println(Arrays.toString(ch));
		
		
		System.out.println("*********************************************");
		//boolean array
		boolean fg[]=new boolean[2];
		//System.out.println(Arrays.toString(fg)); //Default value will be false
		
		fg[0]=true;
		fg[1]=false;
		System.out.println(Arrays.toString(fg));
		
		/*Default value*/
		//int,short, byte, long: 0
		//double,float : 0
		//boolean = false
		//char = space 
		
		/*Use Case*/
		//Gender, Month, Week
		
		
		
		
		//String array
		String browser[]=new String[4];
		System.out.println(Arrays.toString(browser)); // null
		browser[0]="chrome";
		browser[1]="chrome";
		browser[2]="chrome";
		browser[3]="chrome";
		
		System.out.println(Arrays.toString(browser));
		
		//
		// n --> n/2
		/*  n/4  */
		
		//n/k; k=2 (Binary Search)
		// T=N/K
		//log T = log(n/k)
		//log T = log n - log k; base k=2
		//log T= log n - 1
		//log T = log n
		// T= log n // with the base T
		// T=0(log n)
		
	}

}