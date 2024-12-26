package JavaSessions;

import java.util.Arrays;

public class ObjectArray {

	public static void main(String[] args) {
		//emp data:
		//name(String)
		//age(int)
		//salary(double)
		//gender(char)
		//isPermanent(boolean)
		
		//Object: is a super(parent) class : in-bulid class
		
		Object empData[]=new Object[5]; //0-4
		System.out.println(Arrays.toString(empData)); //[null, null, null, null, null]
		empData[0] = "tester";
		empData[1] = 30;
		empData[2] = 34.44;
		empData[3] = 'f';
		empData[4] = true;
		
		System.out.println(empData[0]); //tester
		System.out.println(empData.length); //5
		System.out.println(Arrays.toString(empData)); //[tester, 30, 34.44, f, true]
		
		System.out.println("*********************************************");
		
		for(Object e : empData) {
			System.out.println(e);
		}
		

	}

}
