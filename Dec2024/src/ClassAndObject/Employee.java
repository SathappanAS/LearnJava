package ClassAndObject;

public class Employee {

	//class variable{template variable or global variable}, data member
	String name;
	int age;
	double salary;
	boolean isPermanent;
	char gender;
	
	
	public static void main(String[] args) {
		// Class : Category, Blueprint , template 
		// Object : physical entity

		//class: data members [variable,method] 
		
		//create the object of the class : using new keyword
		
		Employee e = new Employee(); //**Very Important Question**
		//Employee --> 			class name
		//e --> 				object reference name
		//new Employee(); --> 	object 
		
		System.out.println(e.name + " " + e.age);
		System.out.println("****************************");
		e.name="Tom";
		e.age=30;
		e.salary=12.33;
		e.isPermanent=true;
		e.gender='m';
		
		System.out.println(e.name + " " + e.age);
		System.out.println("****************************");
		
		Employee e1 = new Employee();
		System.out.println(e1.name + " " + e1.age);
		System.out.println("****************************");
		
		//object without ref name //anti pattern
		new Employee();
		//		new Employee().name="Ravi";
		//		new Employee().age=30;
		//		System.out.println(new Employee().name="Ravi");
		
		//object with null reference
		Employee obj = new Employee();
		obj =null;
		obj.name="lias";
		System.out.println(obj.name); //Java.lang.NullPointerException
		
		
		//gc
		System.gc(); //calling the GC 	
		
	}

}
