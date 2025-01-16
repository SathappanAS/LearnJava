package EncapsulationAssignments;

public class Person {

	private String name;
	private int age;
	private String gender;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	public void printInfo() {
		System.out.println("Name : " + getName());
		System.out.println("Age : " + getAge());
		System.out.println("Gender : " + getGender());
	}


	public static void main(String[] args) {
		Person p1=new Person();
		
		p1.setName("testing");
		p1.setAge(10);
		p1.setGender("M");
		
		p1.printInfo();
		

	}

}
