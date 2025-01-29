package ExceptionHandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class FileTest {
	public static void main(String[] args) {
		
		System.out.println("file test");
		//		int i=9/0; // runtime exception - AE // Checked Exception
		
		//		int []a=new int[2];
		//		a[4]=35; //ArrayIndexOutOfBoundsException // runtime exception - Unchecked Exception
		
		// FileInputStream ip=new FileInputStream(file);
		
		File file=new File("c:\\documents\\test.xls"); //compile-time exception //checked exception 
		try {
			FileInputStream ip=new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		//Thread.sleep(5000); complie-time exception
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("file closed");
		
		/*Error are runtime exception*/
		/*Runtime Exception & it's sub classes and Error & it's sub-classes are unchecked Exception;*/
		/*All other exceptions are checked Exception*/
		
		/*Complie time exception example : thread.sleep and filenotfoundexception*/
	}
}