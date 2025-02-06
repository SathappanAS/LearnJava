package ArrayList;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		//List(I) --- > ArrayList(C)
		//maintain the order/index
		
		ArrayList ar = new ArrayList();
		//System.out.println(ar.get(0));
		
		System.out.println(ar.size()); //0
		System.out.println(ar);//[]
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println(ar.get(0));
		System.out.println(ar.size()); 
		
		ar.add(400);//1
		ar.add(500);//2
		
		ar.remove(3);
		System.out.println(ar.size());
		
	}

}
