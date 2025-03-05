package ArrayList;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		//List(Interface) --- > ArrayList(Child class)
		//maintain the order/index
		
		ArrayList ar = new ArrayList(); //vc=10; pc=0
		//System.out.println(ar.get(0)); //IndexOutOfBoundException
		
		System.out.println(ar.size()); //pc=0
		System.out.println(ar);//[]
		
		ar.add(100);//0 location
		ar.add(200);//1 location
		ar.add(300);//2 location
		
		System.out.println(ar.get(0)); //100
		System.out.println(ar.size());  //size will be 3
		
		ar.add(400);//1
		ar.add(500);//2
		System.out.println(ar); //[100, 200, 300, 400, 500]
		System.out.println(ar.size());  //5
		ar.remove(3);
		 
		System.out.println(ar.size());	//4
		System.out.println(ar); // [100, 200, 300, 500]
		System.out.println(ar.get(3)); //500
		
	}
}