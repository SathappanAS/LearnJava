/*throws - not handling the exception. It purpose of the throws 
keyword is just to deligate the exception from its caller method*/
//What are way to handle the exception ? only one way try catch block
package ExceptionHandling;
public class Browser {
	//amazon : portal 
	public void m1(){
		System.out.println("m1");
		m2();
	}
	
	//amazon: OMS
	public void m2() throws ArithmeticException{
		System.out.println("m2");
		
		try {
		m3(10,0);}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}
	
	//--------------------------//
	//external system: bank method
	public void m3(int a, int b) throws ArithmeticException {
		System.out.println("m3");
		int i=a/b;
	}
	
	//user/caller method:
		public static void main(String[] args){
		Browser obj=new Browser();
		obj.m1();
		System.out.println("bye!!!");
	}
}