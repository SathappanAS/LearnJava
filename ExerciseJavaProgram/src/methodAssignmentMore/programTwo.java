package methodAssignmentMore;

/*Method with Return Value (int) and with Parameters(int,int):
 * Assignment : Write a method to add two integers and return the result:
 * Signature : public int add(int num1,int num2) 
 * */


public class programTwo {
	
	public int add(int a,int b) {
		int sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		programTwo p2=new programTwo();
		int sum=p2.add(10, 10);
		System.out.println(sum);
	}
}
