package methodAssignments;

import java.util.Scanner;

/*Def﻿ine a program to find out whether a given number is even or odd - return true/false.*/
public class program5 {
	public boolean result(int i) {
		
		if(i%2==0) {
			System.out.println("even number");
			return true;
		}
		
		else {
			System.out.println("old number");
			return false;
		}
	}

	public static void main(String[] args) {
		
		program5 p5=new program5();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int i=sc.nextInt();
		
		boolean prg=p5.result(i);
		System.out.println(prg);
		
		
		}
}
