package naveenSessionJava27;

public class StringMethods {

	public static void main(String[] args) {
		
		
		String str="hi this is my java code and i am so happy";
		
		System.out.println("Lenght of the i: " +str.length());
		int lenghtofStr=str.length(); // lenght : 41
		
		int lowestIndex =0;
		int highestIndex=lenghtofStr-1;
		System.out.println("Highest index of i: " +highestIndex); //HighestIndex : 40
		System.out.println("Lowest index of i: "+lowestIndex); //LowestIndex : 0
	 
		
		System.out.println(str.charAt(11));
		System.out.println(str.charAt(highestIndex));
		System.out.println(str.charAt(lowestIndex));
		//System.out.println(str.charAt(highestIndex+1)); //java.lang.StringIndexOutOfBoundsException
		
		
		int firstCharI = str.indexOf("i"); //1st occurence of i
		System.out.println(firstCharI); //1
		
		int secondCharI = str.indexOf("i", firstCharI+1); // 2nd occurance of i
		System.out.println(secondCharI); //5
		
		int thirdCharI = str.indexOf('i', secondCharI+1);
		System.out.println(thirdCharI); // 3rd occurance of i
		
		
		String msg = "welcome admin";
		if(msg.indexOf("admin")==8) {
			System.out.println("pass");
		}
		else{
			System.out.println("fail");
		}
		
		//trim
		String test = " Hello Java ";
				System.out.println(test.trim());
				
				
		//LC/UC
		String un = "naveenautomationLabs";
				System.out.println(un.toUpperCase());
				
		//replace
		String dob = "12-08-1990";
			System.out.println(dob.replace("-", "/"));
			
		String mg = "hi this is my java code and i am so happy";
		System.out.println(mg.replace("java", "Cypress"));

		//contains:
		String tg="hi this is my java code and i am so happy";
		System.out.println(tg.contains("java")); //true
		
		String messg = "admin welcome";
		if(messg.contains("admin")) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		
		//equals:
		String t1 = "hello selenium";
		String t2 = "hello Selenium";
		System.out.println(t1.equals(t2)); //false
		System.out.println(t1.equalsIgnoreCase(t2)); //true
		
		//substring
		String orderMesg = "my order id is 12345";
		System.out.println(orderMesg.substring(6));
		System.out.println(orderMesg.substring(0,10));
	
		
		int count = 0;
        int index = 0;
        
        while (index < str.length()) {
            if (str.charAt(index) == 'i') {
            	 System.out.println("The letter 'i' occurs " + index + " times.");
                count++;
            }
            index++;
        }
        
 
       
	}

}
