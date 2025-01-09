package methodAssignments;

import java.util.Scanner;

/*Write a program to print the circumference and area of a circle of radius entered by user by defining your own method. */

public class program3 {

	public double areaofaCricleofRadius(double r) {
		
		int i=2;
		double pi=3.14;
		double circle = i*pi*r*r;
		return circle;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius : " );
		double r=sc.nextDouble();
		
		program3 p3=new program3();
		double result = p3.areaofaCricleofRadius(r);
		System.out.println("Area of the circle: " +result);
		
		
	}

}
