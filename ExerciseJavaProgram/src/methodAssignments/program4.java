package methodAssignments;
/*Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.*/
public class program4 {

	public int max(int a,int b,int c) {
		if(a>b && a>c) {
			return a;
		}
		else if (b>c) {
			return b;
		}
		else {
			return c;
		}	
	}
	
	public int min(int a, int b,int c) {
		if(a<b && a<c) {
			return a;
		}
		else if (b<c) {
			return b;
		}
		else {
			return c;
		}	
	}
	
	public static void main(String[] args) {
		
		program4 p1=new program4();
		int maximum=p1.max(2,15,7);
		System.out.println(maximum);
		
		int minimum=p1.min(2,15,1);
		System.out.println(minimum);
	}

}
