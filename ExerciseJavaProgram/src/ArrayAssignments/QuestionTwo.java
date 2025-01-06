package ArrayAssignments;
import java.util.Arrays;
/*Write a program to create a static array, having following cricket data:*/
// --name, age, team name, DOB, gender, Strike Rate
// --Try to create multiple Object Arrays for different Players
// --Try to print all the values of each player on the console using for and for each loops
public class QuestionTwo {

	public static void main(String[] args) {
		
		//int a[]=new int[5]; // int - data type ; a = variable name ; new = keyword ; size of of array(4*5 = 20 bytes)
		
		Object Sachin[] = new Object[5];//
		//System.out.println(Arrays.toString(Sachin));
		Sachin[0]="sachin";
		Sachin[1]=29;
		Sachin[2]="india";
		Sachin[3]="10-10-1989";
		Sachin[4]=99.95;
		
		Object Dhoni[]=new Object[5];
		Dhoni[0]="Dohin";
		Dhoni[1]=27;
		Dhoni[2]="india";
		Dhoni[3]="07-10-1989";
		Dhoni[4]=99.35;
		
		
		for(int i=0;i<5;i++){
			System.out.println(Sachin[i] + " " + Dhoni[i]);
		}
		
		System.out.println("*********forLoop***************");
		for(Object e:Sachin) {
			System.out.println(e);
		}
		
		System.out.println("*********whileLoop***************");
		int i=0;
		while(i<5) {
			System.out.println(Sachin[i]);
			i++;
		}
		
		System.out.println("*********doWhileLoop***************");
		
		int j=0;
		do {
			System.out.println(Sachin[j]);
			j++;
		}while(j<5);
		
	}

}
