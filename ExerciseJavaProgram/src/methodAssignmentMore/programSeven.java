package methodAssignmentMore;
/* Method without Return value (void) and with parameters (int, int[]):
 * Assignment : Write a method to print each element of an int array multiplied by a given factor.
 * Signature: public void printArrayWithFactor(int Factor,int[] array)
 * */
public class programSeven {
	public void printArrayWithFactor(int Factor,int[] array) {
		int num=1;
		
		for(int i=1;i<=array.length;i++) {
			num=i*Factor;
			System.out.println(num);
		}
		
	
	}
	
	public static void main(String[] args) {
		
		programSeven p7=new programSeven();
		int []array= {1,2,3,4,5};
		p7.printArrayWithFactor(2,array);

	}

}
