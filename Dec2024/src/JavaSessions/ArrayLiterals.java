package JavaSessions;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {
		// literals : data is already with us
		int a[] = {10,20,30,40,50};
		
		System.out.println(a.length);
		System.out.println(a[2]);
		System.out.println(Arrays.toString(a));
		System.out.println("*********************************************");
		
		//a[5]=60;
		//	System.out.println(a[5]); //AIOB //Static arrays
		
		int i[]=new int[40];
		i[0]=10;
		i[2]=20;

		
		String lang[]= {"Java","JS","Python","TS"};
		System.out.println(Arrays.toString(a));
		System.out.println(lang.length);
		lang[0]="Ruby";
		System.out.println(Arrays.toString(lang));
		
		//Interview Questions
		//ecomm application
		//Static array
	}

}