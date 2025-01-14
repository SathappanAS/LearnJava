package methodAssignmentMore;
/* Method with Return Value(Object[]) and with Parameters (Object[]):
 * Assignment : Write a method to reverse the order of elements in an Object array and return the reversed array.
 * public Object[] reverseArray(Object[] array)
 * */
public class programSix {

	public static Object[] reverseArray(Object[] array) {
		int len=array.length;
		int count =0;
		
		Object [] reverseArray = new Object [len];
		for(int i=(len-1);i>=0;i--) {
			reverseArray[count]=array[i];
			count ++;
			//System.out.print (reverseArray[i] + " ");
		}
		
		return reverseArray;
	}
	
	
	
	
	public static void main(String[] args) {
		Object [] arrayOrder = {'1','2','3','4','5','6','7'};
		Object [] output=programSix.reverseArray(arrayOrder);
		
		for(int i=0;i<output.length;i++) {
			System.out.println(output[i]);
		}
		
	}

}