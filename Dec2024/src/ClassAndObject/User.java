package ClassAndObject;

public class User {
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		
		User u1=new User();
		u1.name="sam";
		u1.age=30;
		u1.city = "Pune";

		User u2=new User();
		u2.name="sriram";
		u2.age=40;
		u2.city = "tamil nadu";
		
		User u3=new User();
		u3.name="java";
		u3.age=35;
		u3.city = "New York";
		
		System.out.println(u1.name+ " " + u1.age + " " + u1.city);
		System.out.println(u2.name+ " " + u2.age + " " + u2.city);
		System.out.println(u3.name+ " " + u3.age + " " + u3.city);
		System.out.println("============================");
		
		System.out.println("u1=u2");
		u1=u2;
		System.out.println(u1.name+ " " + u1.age + " " + u1.city);
		System.out.println(u2.name+ " " + u2.age + " " + u2.city);
		System.out.println(u3.name+ " " + u3.age + " " + u3.city);
		System.out.println("============================");
		
		System.out.println("u2=u3");
		u2=u3;
		System.out.println(u1.name+ " " + u1.age + " " + u1.city);
		System.out.println(u2.name+ " " + u2.age + " " + u2.city);
		System.out.println(u3.name+ " " + u3.age + " " + u3.city);
		System.out.println("============================");
		
		System.out.println("u3=u1");
		u3=u1;
		System.out.println(u1.name+ " " + u1.age + " " + u1.city);
		System.out.println(u2.name+ " " + u2.age + " " + u2.city);
		System.out.println(u3.name+ " " + u3.age + " " + u3.city);
		System.out.println("============================");
		
		//one object can have multiple object reference
	}

}
