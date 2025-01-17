package ConstructorAssignments;
/*Create a Java class named "Rectangle" with the following instance variables:

length (double)
width (double)

Create a default constructor for the Rectangle class that sets both the length and width to 0.0.
Create a constructor for the Rectangle class that takes in the length and width as parameters and initializes the instance variables.
Create a method in the Rectangle class named "calculateArea" that returns the area of the rectangle (length * width).
Create a main method that creates two instances of the Rectangle class using both constructors, calculates and prints out their respective areas.*/
public class assignmentTwo {

	double length;
	double width;
	
	public assignmentTwo() {
		length=0.0;
		width=0.0;
	}
	
	public assignmentTwo(double length,double width ) {
		//this.global var = local var
		this.length=length;
		this.width=width;
	}
	
	public double calculateArea() {
		double areaofRectangle=length*width;
		return areaofRectangle;
	}
	
	public static void main(String[] args) {
		System.out.println("--------------default constructor-----");
		assignmentTwo a2=new assignmentTwo(); // default constructor
		System.out.println(a2.length);
		System.out.println(a2.width);
		
		System.out.println("--------2 parameter constructor-----");
		assignmentTwo a3=new assignmentTwo(10.0,3.0);
		System.out.println(a3.length);
		System.out.println(a3.width);
		
		System.out.println("-----------Method calling-----------");
		double result=a3.calculateArea();
		System.out.println(result);
		
	}

}
