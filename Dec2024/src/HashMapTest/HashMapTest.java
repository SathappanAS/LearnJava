package HashMapTest;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		
		//<K,V >
		//does not maintain the order/index
		
		//Map(I)--> HashMap(C)
		
		HashMap<String, Integer> markMap=new HashMap<String, Integer>();
		
		markMap.put("jyothi",100);
		markMap.put("aparna",60);
		
		System.out.println(markMap.size());
		
		markMap.put("dev",75);
		System.out.println(markMap.size());
		markMap.put("dev",45);
		System.out.println(markMap.get("dev"));
		System.out.println("---");
		System.out.println(markMap.get(75));
		
		markMap.put("naveen",45);
		
		System.out.println(markMap.size());
		
		System.out.println(markMap.get("dev"));
		System.out.println(markMap.get("tom"));//null
		
		markMap.put(null,55);
		System.out.println(markMap.get(null));
		
		markMap.put(null,15);
		System.out.println(markMap.get(null));
		
		markMap.put("robin",null);
		markMap.put("divya",null);
		System.out.println(markMap.get("divya"));
		
		
		//
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
