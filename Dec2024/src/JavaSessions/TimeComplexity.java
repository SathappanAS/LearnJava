package JavaSessions;
/*Important for Interview*//*It is basis fundamental for all language*/ /*How exactly you have written the code*/ /*performance improvement*/
//When you are increasing the data, need to check the performance of the application

//50k-1
//500k-1
//5-1

public class TimeComplexity {

	public static void main(String[] args) {
		/**Time Complexity*/
		int i =10;
		System.out.println(i);  // TC: Big Oh--> O(n) -- > Time Complexity 0(1)
		//0(1)--constant time
		System.out.println("*****************");
		
		/**Time Complexity**/
		for(int p=1;p<=10;p++) {
			System.out.println(p);
		}
		//1+n+n+n =>3n+1 =>linear equation 0(n) - Keep Increasing the n (it is data)
		//3n+1-->
		//5 hrs:0.00000001 Sec
		System.out.println("*****************");
		
		/**Time Complexity*/
		 int j=1;
		 while (j<=10) {
			 System.out.println(j);
			 j++;
			 
		 }
		 //1+n+n+n = 3n+1(constant time) = 3n
		 System.out.println("*****************");
		 
		 System.out.println("********Quadratic*********");
		 for(int m=0;m<5;m++ ) {
			 for(int n=0;n<5;n++) {
				 System.out.println(m+"" +n + " ");
			 }
			 System.out.println();
		 }
		 
		 //	()() - one for inner loop and another for outer loop
		 //(1+n+n+n)(1+n+n+n)
		 //(1+3n)*(1+3n) (a+b)^2
		 //9n^2+6n+1 : 9n^2+6n ==>3n(3n+2)==>3n(3n)==>9n^2==n^2==O(n^2)== Quadratic
		 
		 
		 
		 for(int h=0;h<5;h++ ) {
			 for(int g=0;g<5;g++) {
				 for(int s=0;s<5;s++) {
					 System.out.println(h+"" +g + s+ " ");
				 }
				
			 }
		 }
		 System.out.println("********Cubic*********");
		 //(1+n+n)(1+n+n)(1+n+n+n)
		 //(1+2n)(1+2n)(1+3n) 
		 //n^3+n2+n : cubic equation
		 
		 
		 //
			// n --> n/2
			/*  n/4  */
			
			//n/k; k=2 (Binary Search)
			// T=N/K
			//log T = log(n/k)
			//log T = log n - log k; base k=2
			//log T= log n - 1
			//log T = log n
			// T= log n // with the base T
			// T=0(log n)
		
	}

}