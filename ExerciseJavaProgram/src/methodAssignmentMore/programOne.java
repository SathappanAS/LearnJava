package methodAssignmentMore;
/*Methods without return value(void) and without parameters*/
/*Assignment : Write a method to print "Hello, World" to the console without taking any input */
public class programOne {
	
	public void print() {
		System.out.println("Hello,World");
	}

//	public static void printOne(programOne c) {
//		System.out.println("Print Static");
//		c.print();
//	}
	
	public static void main(String[] args) {	
		programOne p1=new programOne();
		p1.print();
		//printOne(p1); //cal by ref
	}

}
