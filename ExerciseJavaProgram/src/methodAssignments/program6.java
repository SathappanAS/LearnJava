package methodAssignments;

import java.util.Scanner;

/*
 * A person is eligible to vote if his/her age is greater than or equal to 18.
 Define a method to find out if he/she is eligible to﻿ vote. - return true/false
 * 
 * */
public class program6 {

	public boolean voteeligible(int age) {
		if(age>=18) {
		return true;}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.print("Enter the age : ");
		Scanner sc=new Scanner(System.in);
		int i =sc.nextInt();
		program6 p1=new program6();
		System.out.println(p1.voteeligible(i));
		
	}
}