package JavaSessions;

public class IFELSEConcept {

	public static void main(String[] args) {
		
		// == comparison operator to compare two primitive data types
		// = assignment operator
		// to compare two Strings(non primitive) data types -- we have to use .equals()
		
		int a = 10;
		int b = 10;
		
		if (a==b) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		//if(true) {
		//	System.out.println("hi");
		//}
		//else {
		//	System.out.println("bye");/*Open the Java > Compiler > Errors/Warnings preference page and highlight the problem to configure its severity.
                                     //  Problem: Dead code*/
		//}
		
		System.out.println("-----------------------------------------------");
		boolean flag = true;
		
		if (flag) {   // Line number 32 to 37 - Depend on the flag Variable so Dead Code Warning will come because, variable can be changed any time to false or true.
			System.out.println("Hi");
		}else {
			System.out.println("Bye");
		}
		//Note : With one single if statement , we can write only one else statement
		
		System.out.println("-----------------------------------------------");
		// if--if--if--else--if--else --else = This is called nested if else condition
		int number = 0;
			if(number<=100) {
				if(number>=95) {
					System.out.println("Grade A");
					if (number==100) {
						System.out.println("Grade A++");
						System.out.println("Eligible of MBA");
					}
				}
				else {
					if (number>=70) {
						System.out.println("Grade B");
					}
					else
					{
						System.out.println("Grade C");
						System.out.println("-----------------------------------------------");
					}
				}
			}
			else {
				System.out.println("...invalid marks...");
				System.out.println("-----------------------------------------------");
				}	
			
//			String browser = "chrome";
			
//			if (browser.equals("chrome")) {
//				System.out.println("launch chrome");
//			}
//			if (browser.equals("edge")) {
//				System.out.println("launch edge");	
//			}
//			if (browser.equals("firefox")) {
//				System.out.println("launch firefox");	
//			}
//			if (browser.equals("safari")) {
//				System.out.println("launch safari");	
//			}
//			else { // this else is Associated with only one above if statement
//				System.out.println("invalid browser...pls pass the right browser name..");
//			}
			//output:- launch chrome
			//output:- invalid browser...pls pass the right browser name..
			//the problem with the above code is major performance issue that checking all the condition even if one is satisfied	
			// break cannot be used outside of a loop or a switch 
			
			String browser = "safari";
			if (browser.equals("chrome")) {
						System.out.println("launch chrome");
			}
			else if (browser.equals("edge")) {
						System.out.println("launch edge");}
			else if (browser.equals("firefox")) {
						System.out.println("launch firefox");}
			else if (browser.equals("safari")) {
				System.out.println("launch safari");}
			else { 
					System.out.println("invalid browser...pls pass the right browser name..");}
}
}