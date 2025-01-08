package ClassandObjects;
/*   Assignment 1
 * 	 Create two student objects and initialize their properties
 * 	 Print the details of each student and the total number of students.
 *   Modify the age of one student and print the update details.
 *   Create another Student object and update the total number of students
 *   Print the details of the new student and the updated total number of students.
 * */
public class assignmentOne {
	
		//Class : BluePrint ; template ; data members [variable,method] 
		//Object :  physical entity
		//Create an object with new keyword
	
		//class variable{template variable or global variable}, data member
		String name;
		int age;
		String DOB;
		char gender;

	public static void main(String[] args) {
		int totalStudent =0;
		
		assignmentOne s1=new assignmentOne();
		s1.name="hari";
		s1.age=10;
		s1.DOB="10-10-2010";
		s1.gender='M';
		
		s1.DOB="09-09-2010";
		totalStudent++;
		System.out.println(s1.age);
	
		System.out.println("*****************************");
		
		assignmentOne s2=new assignmentOne();
		s2.name="ravi";
		s2.age=11;
		s2.DOB="10-11-2010";
		s2.gender='M';
		totalStudent++;
		
		
		
	}
}