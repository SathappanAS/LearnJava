package ConstructorConcept;
public class User {

		//class variable //instance variable 
		String name;
		int age;
		double salary;
		String dob;
		
		//const...is used to initialize the instance variables with the local variables
		//const... it is helping to construct the object
		//const...is helping to avoid to create unnecessary object
		
		public User(String name, int age) { //2 param const.. local variables
			//Global = local
			//this.global = local
			// this keyword helping to get the current class object value
			this.name=name;
			this.age=age;
		}
	
		public User(String name, int age,double salary) { //2 param const.. local variables
			this.name=name;
			this.age=age;
			this.salary=salary;
		}
		
		public static void main(String[] args) {
			User u1=new User("jaya",30);
			System.out.println(u1.name + " " + u1.age + " " + u1.salary + "  " + u1.dob);
			
			User u2=new User("tom",40,99.99);
			System.out.println(u2.name + "  " + u2.age + " " + u2.salary + " " + u2.dob);	
			
		}		
}