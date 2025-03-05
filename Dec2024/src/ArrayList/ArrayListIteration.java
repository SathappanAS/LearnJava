package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> marksList = new ArrayList<Integer>();//vc=10,pc=0

		marksList.add(100);//0
		marksList.add(200);//1
		marksList.add(300);//2
		marksList.add(400);//3
		marksList.add(500);//4
		
		System.out.println(marksList);
		
		for(int i=0; i<marksList.size(); i++) {
			System.out.println(marksList.get(i));//100 200 300 400 500
		}
		
		//
		for(Integer e : marksList) {
			System.out.println(e);
		}
		
		
		//
		ArrayList<String> browserList = new ArrayList<String>();//vc=10,pc=0
		browserList.add("chrome");//0
		browserList.add("firefox");//1
		browserList.add("edge");//2
		browserList.add("safari");//3
		browserList.add("ie");//4
		
		System.out.println(browserList);
		
		for(String e : browserList) {
			System.out.println(e);
				if(e.equals("edge")) {
					System.out.println("launch edge");
					break;
				}
		}
		
		
		
		//
		ArrayList<Object> empData = new ArrayList<Object>();//vc=10, pc=0
		empData.add("Jaya");//0
		empData.add(30);//1
		empData.add(34.55);//2
		empData.add("SDET");//3
		empData.add('f');//4
		empData.add(true);//5
		empData.add("pune");//6
		
		System.out.println(empData.size());//vc=3, pc=7
		
		for(Object e : empData) {
			System.out.println(e);
				if(e.equals("SDET")) {
					System.out.println("increase salary by 10%");
					//break;
				}
		}
		
		
		//
		List<String> dataList = new ArrayList<String>();
		//Top casting with interface
		dataList = new LinkedList<String>();
		dataList = new Vector<String>();
		
		System.out.println("================");
		
		StringBuilder sb1 = new StringBuilder("java");
		StringBuilder sb2 = new StringBuilder("java");
		StringBuffer sb3 = new StringBuffer("java");
		
		System.out.println(sb1.equals(sb2));//false
		
		System.out.println(sb1.toString().equals(sb2.toString()));//true
		System.out.println(sb1.toString().equals(sb3.toString()));//true

		System.out.println(sb1==sb2);//false
		
		String r1 = new String("java");
		String r2 = new String("java");
		System.out.println(r1.equals(r2));//true

	}

}
