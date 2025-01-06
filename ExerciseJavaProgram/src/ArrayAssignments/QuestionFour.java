package ArrayAssignments;
/*print all the elements of this array in reverse order using for, for each, while and do-while loop: */
//int p[]={1,3,4,5,22,56,89,90};
public class QuestionFour {
	public static void main(String[] args) {
		int p[]={1,3,4,5,22,56,89,90};
		int len=p.length-1;
		System.out.println("array lenght + " + len);
		
		for(int i=len;i>=0;i--) {
			System.out.print(p[i] + " ");
		}
		
		
			

	}
}