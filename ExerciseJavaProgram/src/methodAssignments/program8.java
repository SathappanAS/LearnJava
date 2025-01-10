package methodAssignments;
import java.util.Scanner;
/*8. Write a program to print the factorial of a number by defining a method named 'Factorial'.
Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-

4! = 1*2*3*4 = 24

3! = 3*2*1 = 6

2! = 2*1 = 2 

Also,
1! = 1
0! = 1*/
public class program8 {
	public int factorial(int n) {
		
		if (n==0){
			return 1;
		}
		
		int fn=1;
		for(int i=1;i<=n;i++) {
			fn=fn*i; // n = 4*1, n= 4*2 , n = 8*3, n = 8*3*4
		}
		
		return fn;
	}
	public static void main(String[] args) {
		program8 p8=new program8();
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		
		int n=sc.nextInt();
		
		int result=p8.factorial(n);
		System.out.println(result);
		
	}

}
