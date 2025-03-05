package ArrayList;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(12.33);
		ar.add(true);
		ar.add('c');
		ar.add("test");
		
		//Generics in AL
		ArrayList<Integer> marksList = new ArrayList<Integer>();//vc=10,pc=0
		marksList.add(100);
		
		ArrayList<Double> bmiList = new ArrayList<Double>();//vc=10,pc=0
		bmiList.add(12.33);
		bmiList.add(23.44);
		
		ArrayList<String> browserList = new ArrayList<String>();//vc=10,pc=0
		browserList.add("chrome");//0
		browserList.add("firefox");//1
		browserList.add("edge");//2
		
		System.out.println(browserList);
		
		System.out.println(browserList.get(0));
		
		//
		ArrayList<Object> empData = new ArrayList<Object>();
		empData.add("Jaya");
		empData.add(30);
		empData.add(34.55);
		empData.add('f');
		empData.add(true);
		System.out.println(empData);
	}

}
