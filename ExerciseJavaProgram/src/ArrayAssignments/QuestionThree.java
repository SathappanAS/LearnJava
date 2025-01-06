package ArrayAssignments;
/*print all the elements of this array using for , foe=r each, while and do-while loop*/
public class QuestionThree {

	public static void main(String[] args) {
		
		int p[]= {1,3,4,5,22,56,88,90};
		
		int a=p.length;
		System.out.println(a);
		
		System.out.println("*********forLoop***********");
		for(int i=0;i<a;i++) {
			System.out.print(p[i]+ " ");
		}
		
		System.out.println();
		System.out.println("*********forEachLoop***********");
		
		for(int e:p) {
			System.out.print(e + " ") ;
		}
	
		System.out.println();
		System.out.println("*********WhileLoop***********");
		
		int i=0;
		while(i<a) {
			System.out.print(p[i] +  " ");
			i++;
		}
		
		System.out.println();
		System.out.println("*********doWhileLoop***********");
		
		int j=0;
		do {
			System.out.print(p[j]);
			j++;
		}while(j<a);
		
		
	}

}
