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
		
		//
		ArrayList tr=new ArrayList(5); //VC=5;PC=0
		
		System.out.println(tr.size()); //0
		System.out.println(tr); //[]
		tr.add(100);
		System.out.println(tr);//[100]
		System.out.println(tr.size()); //1
		
	    //	System.out.println(tr.get(2));  //IndexOutOfBoundsException
		/*get() method always look for physical capacity PC*/
		
		
//		tr.add(3,30);
//		System.out.println(tr.get(3)); //IndexOutOfBoundsException
		/*Note: We cannot skip any segement of the order */
		/* We should always go with sequential mode/order */
		
		
		ArrayList as=new ArrayList(5);
		as.add(10); //0
		as.add(20); //1
		as.add(30); //2
		as.add(40); //3
		as.add(50); //4
		
		System.out.println(as); //[10, 20, 30, 40, 50]
		as.add(1,25);
		System.out.println(as); //[10, 25, 20, 30, 40, 50]
		as.set(1, 11);
		System.out.println(as); // [10, 11, 20, 30, 40, 50]
		
	}
}