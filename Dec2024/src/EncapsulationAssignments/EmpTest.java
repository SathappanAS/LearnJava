package EncapsulationAssignments;
public class EmpTest {

	public static void main(String[] args) {

			// Create -- POST
			Employee e1 = new Employee("zain", 10, 34.44, true);

			// Read -- GET
			System.out.println(e1.getName());
			System.out.println(e1.getAge());
			System.out.println(e1.getSalary());

			// Update -- PUT
			e1.setAge(30);
			e1.setSalary(45.44);

			// Read -- GET
			System.out.println(e1.getName());
			System.out.println(e1.getAge());
			System.out.println(e1.getSalary());
		}
}	