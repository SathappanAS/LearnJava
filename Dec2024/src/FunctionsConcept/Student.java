package FunctionsConcept;
	//WAF- AC: 0 to 100
	// getStudentMarks(String studentName)
	// if student is available: return student marks (int)
	// else: return : int : -1
public class Student {
	public int getStudentMarks(String studentName) {
		
		int marks=-1;
		
		switch(studentName.trim().toLowerCase()) {
		case "hari":
			marks=90;
			break;
		case "dev":
			marks=30;
			break;
		case "zain":
			marks=40;
			break;
		case "pooja":
			marks=60;
			break;
			
		default:
			System.out.println("Student is not found.." +studentName);
			break;
		}
		
		return marks;
		}
	
public int getStudentScore(String studentName) {
		System.out.println("getting the marks for student: " + studentName);
		switch(studentName.trim().toLowerCase()) {
		case "hari":
			return 90;
		case "dev":
			return 30;
		case "zain":
			return 40;
		case "pooja":
			return 60;
			
		default:
			System.out.println("Student is not found.." +studentName);
			return -1;
		}}
	//return and break can't be together
public static void main(String[] args) {
		Student st=new Student();
		int m1=st.getStudentMarks("hari");
		System.out.println(m1);
		if(m1>=0) {
			System.out.println("print the mark sheet");
		}
		int n1=st.getStudentScore("zari");
		System.out.println(n1);	
	}
}
