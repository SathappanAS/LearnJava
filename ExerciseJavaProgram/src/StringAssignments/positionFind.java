package StringAssignments;

public class positionFind {

	public static void main(String[] args) {
		
		
		String name="my name is testing india"; // 01 3456 89 1011121314151617 1920212223
		
		int positionIchar = name.indexOf('i');
		System.out.println(positionIchar); //8
		
		int secondIchar = name.indexOf('i',name.indexOf('i')+1);
		System.out.println(secondIchar); //15
		
		int thirdchar= name.indexOf('i', secondIchar+1);
		System.out.println(thirdchar);//19
		
		int fourthChar = name.indexOf('i',thirdchar+1);
		System.out.println(fourthChar);//22

	}

}