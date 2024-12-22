package LoopsExercise;
/*Print the following series: 
1.0 2.0 3.0  ...... 10.0  
0 9 18 27 36 …99*/
public class loopExerciseNine {

	public static void main(String[] args) {
		for(double i=1.0;i<=10.0;i++) {
			System.out.println(i);
		};
	System.out.println("====================");	
	
	
		for(int k=1;k<=11;k++) {
			int j;
			j=k*9;
			System.out.println(j);
		}
		

	}

}
