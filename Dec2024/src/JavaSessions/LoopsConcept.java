package JavaSessions;
public class LoopsConcept {
	public static void main(String[] args) {
		//1. while loop
		//1 to 10;
		int i=1;
		while(i<=10) {
			//i++;//2 3 4 5 6 7 8 9 10 11
			System.out.println(i);
			i++;
			//++i;
			//i=i+1;
			//i++;
		}
		while(true) {
			System.out.println("Welcome to Hotel Taj");
			break;
		}
		System.out.println("====================");
		
		int p=1;
		while(p<=10) {
			System.out.println("p");
				if(p==5) {
					System.out.println("Hello Selenium");
					System.out.println("====================");
					break; 
				}
		p++;
		//break;
		}
		System.out.println("====================");
		
		// even
		int t=0;
		while(t<=10) {
			if(t%2 == 0) {
				System.out.println(t + " is a even number");
			}
			t++;
		}
		System.out.println("====================");
		//odd
		int s=0;
		while(s<=10) {
			if(s%2 == 1) {
				System.out.println(s + " is a odd number");
			}
			s++;
		}
		System.out.println("====================");
		 //odd/even
		int g=0;
		while(g<=10) {
			if(g%2==0) {
				System.out.println(g + " is a even number");
			}
			else {
				System.out.println(g + " is a odd number");
			}
			g++;
		}
		System.out.println("====================");

		//forloop : 
		// 1 to 10 :
		for (int k=1;k<=10;k++) {
			System.out.println(k);
			
		}		
		System.out.println("====================");
		
		int n=1;
		for(;n<=10;) {
			System.out.println(n);
			n++;
			//++n;
			//n=n+1;
		}
		System.out.println("====================");
		
		for(;;) { //default true // interview questions very important
			System.out.println("Bye!!"); //output = infinite loop
			break;
		}
		System.out.println("====================");
	
//	   	for(;false;) 
//		System.out.println("Bye!!"); //output = error
//		break;
//	} 
		
		
		for (int d=10;d>=1;d--) {
			System.out.println(d);
		}
		System.out.println("====================");
		
		
		for (int r=1;r<=10;r++) {
			System.out.println(r);
				if(r % 5 ==0) {
					System.out.println("Hello Selenium");
					break;
				}
		}
		System.out.println("====================");		
		
		//Important interview questions
		//a=97;b=98
		
		for(char ch='a';ch<='z';ch++) {
			System.out.println(ch + " = " + (int)ch);
		}
		System.out.println("====================");
		
		for(double d=1.0;d<5.0;d++) {
			System.out.println(d);
		}
		System.out.println("====================");
		
		
		//for loop & while loop//
		//use cases for while loop
		    //When number of iterations are not fixed
			//waiting for the element on the page:  '0',5,10,15 seconds
			//waiting for the page loading :0,5,10,15,20
			//calendar handling: 
			//webtable pagination handling
			//linkedin//fb/insta: infinite scrolling
			//food delivery app:
			//carousel
		
		//use cases for for loop (when number of iterations are fixed
			//drop down: month : 1 to 12:
			//footer links
			// table columns
			//array, ArrayList:	
			//reading excel
			//retry logic: count =3
			//country drop down
			//flight booking/movie ticket
		int count=1;
		for(;;) {
			System.out.println("Bye!!");
			if(count==10) {
				break;
			}
			count++;
		}
		System.out.println("====================");
		
		
		//do-while loop
		//1 to 10:
		
		int j=1;
		do {
			System.out.println(j);// 1 2 3 4 5 6 7 8 9 10
			j++;
		}
		while(j<=10);
			
		//user cases:
		//wait for web element
		//element is on the page : not available
		// do { 
					//wait for the element
					//click on the element
		//} while(!element is displayed)
			
		
	}
}