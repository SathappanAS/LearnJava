package JavaSessions;

public class NestedLoops {

	public static void main(String[] args) {
		//RC - Row Column //6*6
		//00 01 02 03 04 05
		//10 11 12 13 14 15
		//20 21 22 23 24 25
		//30
		//40
		//00 01 02 03 04 05
		
		for(int i=0;i<=5;i++) {
			for (int j=0;j<=5;j++) {
				System.out.print(i + "" + j + " ");	
			}
			System.out.println("");
		}
		System.out.println("====================");
		
		//Home Work
		//000 001 002 003 004 005
		//
		//
		for(int i=0;i<=9;i++) {
			for (int j=0;j<=9;j++) {
				for(int k=0;k<=9;k++) {
				System.out.print(i + "" + j + "" + k + " ");	
				}
			}
			System.out.println("");
		}
		System.out.println("====================");
		
		
		for(int i=0;i<=5;i++) {
			for (int j=0;j<=5;j++) {
				System.out.print(i + "" + j + " ");	
				break;  //only inner loop will break
			}
			System.out.println("");
		}
		System.out.println("====================");
		
		for(int i=0;i<=5;i++) {
			for (int j=0;j<=5;j++) {
				System.out.print(i + "" + j + " ");	
				break;
			}
			System.out.println("");
			break; //outer loop will break
		}
		System.out.println("====================");
		
		
	}
}