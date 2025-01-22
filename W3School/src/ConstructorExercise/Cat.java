package ConstructorExercise;
/*Write a Java program to create a class called “Cat” with instance 
 variables name and age. Implement a default constructor that initializes the name to 
 "Unknown" and the age to 0. Print the values of the variables.*/

public class Cat {
	
	private String name;
	private int age;

	public Cat(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void myCatMethod() {
		System.out.println("Cat's Name:  " + name);
		System.out.println("Cat's Age: " + age);
	}
	
	
	public static void main(String[] args) {
		 Cat myCat = new Cat("Unknown",10);
		
		System.out.println("Cat's Name:  " + myCat.getName());
		System.out.println("Cat's Age: " + myCat.getAge());
		System.out.println("===Display the ans using method===");
		myCat.myCatMethod();
	}

}
