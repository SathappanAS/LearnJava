package ArrayAssignments;

import java.util.Arrays;

/*Write a program to delete a specific number from the given array.*/
// int p[]={1,4,5,2,3,22,31,2};
// --need to remove 22 from the p[] array.
// --output should be: [1,4,5,2,3,31,2]
public class QuestionOne {

	public static void main(String[] args) {
//		int p[]={1,4,5,2,3,22,31,2};
//		System.out.println(Arrays.toString(p));
//		System.out.println(p.length);
//		System.out.println("-------");
//		int a = p.length;
//		int indextoRemove= 5;
//		int numbertoRemove=22;
//		
//		int a = p.length;
//		System.out.println(a);
//		System.out.println("-------");
//		
//		int newParr[] = new int[p.length];
//		
//		for(int i=0;i<a;i++ ) {
//			if(i != indextoRemove) {
//			newParr[i]=p[i]; //copy array
//			}
//		}
//		System.out.println(Arrays.toString(newParr));		
//		int p[]={1,4,5,2,3,22,31,2};
//		int a[]=new int[p.length-1];
//		int j=0;
//		for(int i=0;i<p.length;i++) {
//			if(p[i]!= 22) {
//				a[j]=p[i];
//					System.out.println(a[j]);
//			}	
//			}
		
		int p[]={1,4,5,2,3,22,31,2};
		int a[]=new int[p.length-1]; 
		System.out.println(Arrays.toString(p));
		System.out.println(p.length);
		System.out.println("-------");
		System.out.println(p[5]);
		
		int m = -1;
		for(int i=0;i<p.length;i++) {
				if(p[i]==22) {
					m =i;
					break;
				}
			
		}
		
		if (m != -1) {
			while(m != (p.length-1) ) {
				p[m] = p[m+1];
				m++;
			}
		}
		
	
		for(int i=0;i<p.length-1;i++) {
			System.out.println(p[i] + " ");
		}
		System.out.println(Arrays.toString(p));
	}

	}


