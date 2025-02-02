package StringAssignments;

public class findaPositionWhileLoop {

	public static void main(String[] args) {
		
		String name="my name is testing india";
		
		
		
		int len=name.length();
		System.out.println(len); //24
		
		int firstPos=name.indexOf("i");
		System.out.println(firstPos); //8
		
		System.out.println("------WhileLoop-------");
		
		int i=0;
		while(i<len) {
			if(name.indexOf('i', i) == i) {
				System.out.println(i);
			}
			i++;
		}
	}}
