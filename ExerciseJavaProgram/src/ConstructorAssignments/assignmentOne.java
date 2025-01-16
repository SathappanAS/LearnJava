package ConstructorAssignments;
/*Assignment 1:
Assignment 1:
		Create a Java class named "Person" with the following instance variables:
		name (String)
		age (int)
		gender (char)
		height (double)

		Create a constructor for the Person class that takes in the name, age, gender, and 
		height as parameters and initializes the instance variables.
		
		Create a main method that creates two instances of the Person class using the constructor and prints out their information.
 */
public class assignmentOne {

	String name;
	int age;
	char gender;
	double height;
	
	public assignmentOne(String name,int age,char gender,double height) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.height=height;
	}
	
	public static void main(String[] args) {
		
		assignmentOne Person = new assignmentOne("naveen", 30, 'M', 6.53);
		System.out.println(Person.name + " " + Person.age + " " + Person.gender + Person.height);
		
	}

}
