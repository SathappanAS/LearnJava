package methodAssignmentMore;
/* Method without Return Value (void) and with Parameters (String[]): Will cover this with String
Manipulation Concept.

Assignment : Write a method to print each element of a string array in reverse order

Signature: public void printReverseStringArray(String[] strings) 
 * */
public class programNine {
	
	public void printReverseStringArray(String[] strings) {
		int count =0;
		int len=strings.length;
		
		String res[]=new String[len];
		
		for(int i=len-1;i>=0;i--) {
			res[count]=strings[i];
			System.out.println(res[count]);
			count ++;
			
		}
		
		
	}

	public static void main(String[] args) {
		
		String[] strArray = {"hello", "world", "java", "programming"};
		programNine sm = new programNine();
        sm.printReverseStringArray(strArray);
	}

}