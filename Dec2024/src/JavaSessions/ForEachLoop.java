package JavaSessions;

public class ForEachLoop {

	public static void main(String[] args) {
		String browser[]=new String[5]; //0-4
		
		browser[0]="chrome";
		browser[1]="firefox";
		browser[2]="ie";
		browser[3]="safari";
		browser[4]="edge";
		
		
		for (String ll : browser) {
			System.out.println(ll);
		}
		
		System.out.println("**************************");
		
		//Extra variable 
		int count =0;
		for(String name : browser) {
			System.out.println(count + " = " + name);
			count++;
		}
		
		System.out.println("**************************");
		
		//Reverse an array: index based loop
		for(int k=browser.length-1;k>=0;k--) {
			System.out.println(browser[k]);
		}
		System.out.println("**************************");
		
		//Reverse an array : for each loop
		int c=browser.length-1; //4
		for(String e1 : browser) {
			System.out.println(browser[c]);
			c--;
		}
		System.out.println("**************************");
		
	}

}
