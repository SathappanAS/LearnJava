package methodAssignments;

import java.util.Scanner;

/*Define a method that returns the product of two double numbers*/
public class program2 {
	
	public double product(double a,double b) {
		double c=a+b;
		System.out.println(c);
		return c;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of first elements :  ");
		double a=sc.nextDouble();
		
		System.out.println("Enter the value of second elements :  ");
		double b=sc.nextDouble();
	
		program2 p1=new program2();
		
		System.out.println("Additon of two double :  ");
		double c=p1.product(a, b);
		
	}

}
