package DataConversion;

public class ConvertDataConcept {

	public static void main(String[] args) {
		
		//String to int:
		String x="100";
		System.out.println(x+20); //10020
		int i = Integer.parseInt(x);
		System.out.println(i+20);

		/*Very famous interview questions*/
		String y = "100$"; //substring replace to remove A 
//		int p = Integer.parseInt(y); //java.lang.NumberFormatException
//		System.out.println(p+20);
//		
		
		y=y.replace("$", "");
		int p = Integer.parseInt(y);
		System.out.println(p+20);
		
		//String to double
		String z="12.33";
		System.out.println(z+20);
		double d= Double.parseDouble(z);
		System.out.println(d+20);
		
		
		//String to boolean:
		
		String headless = "true";
		boolean flag=Boolean.parseBoolean(headless);
		
		if(flag) {
			System.out.println("run tc in headless");
		}
		
		
		//int to String:
		int total = 2000;
		System.out.println(total+20);//2020
		
		String totalVal =  String.valueOf(total);
		System.out.println(totalVal + 20); //200020
		
		//double to String
		double bmi = 17.12;
		String bmiVal=String.valueOf(bmi); // "17.12"
		System.out.println(bmiVal.length());
		
		//boolean to String
		boolean isTemp = true;
		String tempVal=String.valueOf(isTemp);
		System.out.println(tempVal.length());
		
		//int to String
		int price=1000;
		String priceVal= price+"";
		System.out.println(priceVal+20);
		
		
	}

}
