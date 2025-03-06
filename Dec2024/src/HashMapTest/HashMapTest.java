package HashMapTest;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		
		//<K,V > (key and value - pair)
		//does not maintain the order/index
		
		//Map(I)--> HashMap(C)
		//HashMap is a raw type. References to generic type HashMap<K,V> should be parameterized
		
		
		HashMap<String, Integer> markMap=new HashMap<String, Integer>();
		
		markMap.put("jyothi",100);
		markMap.put("aparna",60);
		
		System.out.println(markMap.size()); //2
		
		markMap.put("dev",75);
		System.out.println(markMap.size()); //3
		markMap.put("dev",45);
		System.out.println(markMap.get("dev")); //45
		System.out.println("---");
		System.out.println(markMap.get(75));//null
		
		markMap.put("naveen",45);
		
		System.out.println(markMap.size()); //4
		
		System.out.println(markMap.get("dev")); //45
		System.out.println(markMap.get("tom"));//null
		
		markMap.put(null,55);
		System.out.println(markMap.get(null));//55
		
		markMap.put(null,15);
		System.out.println(markMap.get(null));//15
		
		markMap.put("robin",null);
		markMap.put("divya",null);
		System.out.println(markMap.get("divya")); //null
		
		
		//
		
		HashMap<Integer, Integer> numMap=new HashMap<Integer, Integer>();
		numMap.put(100, 1);
		
		
		HashMap<String, String> empMap=new HashMap<String, String>();
		empMap.put("ravi", "SDET1'");
		empMap.put("ravi", "SDET1");
		empMap.put("dev", "SDET2");
		empMap.put("jyothi", "SDET Manager");
		empMap.put("divya", "dev Manager");
		empMap.put("naveen", "CTO");
		empMap.put(null, "CEO");
		
		System.out.println(empMap);
		//{null=CEO, dev=SDET2, ravi=SDET1, naveen=CTO, jyothi=SDET Manager, divya=dev Manager}
		System.out.println(empMap.size()); //6
		
		
		HashMap<String, Object> userMap=new HashMap<String, Object>();
		userMap.put("tom", "IBM");
		userMap.put("designation", "SDET");
		userMap.put("salary", 14.55);
		userMap.put("isActive", true);
		
		
		
		
		
		
		
			
		
	}

}
