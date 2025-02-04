package StringManipulation;

public class StringMethodsPartTwo {

	public static void main(String[] args) {
		
		//substring:
		
		String orderMesg = "my order id is 12345"; //01 2 34567 8 910 11 1213 14 1516171819
		
		System.out.println(orderMesg.length());//20
		
		System.out.println(orderMesg.substring(6)); //er id is 12345
		
		System.out.println(orderMesg.substring(0, 10)); //(0,9] //my order i

	}

}
