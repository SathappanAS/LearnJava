package StringManipulation;

import java.util.Arrays;
/**
 * my testing stringmethiods
 */
public class StringMethods {

	public static void main(String[] args) {
		
		//String is the collection of multiple character 
		String str="hi this is my java code and i am so happy";
				  //0123456789------------------------------40//
		System.out.println(str.length());  //41
		int len=str.length(); // length ==> 41
		int li=0; // length ==> 41
		int hi=len-1; //length ==> 41
		
		System.out.println("length ==> " + len);
		System.out.println("li ===>" + li);
		System.out.println("hi ===>" + hi);
		
		
		System.out.println(str.charAt(0)); //0 number - it will provide the character
		System.out.println(str.charAt(11)); //11 position
		System.out.println(str.charAt(40)); //40th Position
		//System.out.println(str.charAt(41)); //StringIndexOutOfBoundsException   (Runtime -SIOB)
		
		
		System.out.println(str.indexOf('h')); // 0 index
		System.out.println(str.indexOf('i')); // 1st occurrence of i
		
		
		/*Very important question find the 2nd occurrence of i*/
		
		System.out.println(str.indexOf('i', 2)); //5 (Hot code value)
		
		System.out.println(str.indexOf('i', str.indexOf('i')+1));
		
		int position2= str.indexOf('i', str.indexOf('i')+1);
		
		//3rd position of i
		
		System.out.println(str.indexOf('i', position2+1));
		
		//4th position of i
		 int position3=str.indexOf('i', position2+1);
		 
		 System.out.println(str.indexOf('i', position3+1)+1);
		
		 System.out.println(str.indexOf("naveen"));
		            //012345678 
		 String mesg="welcome admin";
				 if(mesg.indexOf("admin") == 8) {
					 System.out.println("mesg is valid -- pass");
				 }
				 else {
					 System.out.println("mesg is invalid -- fail");
				 }
				 
		//trim
		String test = " hello world ";//hello world
		System.out.println(test.trim());
				 
		//LC/UC
		String um = "naveenautomationlabs";
		System.out.println(um.toUpperCase()); //NAVEENAUTOMATIONLABS
		System.out.println(um.toLowerCase()); //naveenautomationlabs		 
				 
		//replace
		String dob="12-08-1990"; //12/08/1990
		System.out.println(dob.replace("-", "/"));
				 
		String rest=" hello world ";		 
		System.out.println(rest.replace(" ", ""));	//helloworld	 
				 
		String msg= "hi this is my java code and i am so happy"	;	 
		System.out.println(msg.replace("java","Cypress"));	 
		 
		//equals:
		String t1="hello selenium";
		String t2="hello selenium";
		
		System.out.println(t1.equals(t2));
		System.out.println(t1.equalsIgnoreCase(t2));
		
		
		//contains:
		String tg="hi this is my java code and i am so happy";
		System.out.println(tg.contains("java"));
		
		
		String message="welcome admin";
		
		if(message.contains("admin")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("FAIL");
		}
		
		
		//substring:
		String orderMesg = "my order id is 12345"; 
		System.out.println(orderMesg.substring(6));
		System.out.println(orderMesg.substring(0,10));
		System.out.println(orderMesg.substring(orderMesg.indexOf("is")+2, orderMesg.length()));
	
		
		//split: split the string into two parts
		String lang = "java_python_ruby_javascript";
		String lg[]=lang.split("_");
		System.out.println(lg[0]); //java
		System.out.println(Arrays.toString(lg)); // [java, python, ruby, javascript]
		
		
		//
		String top="xXtestXxXautomationXXxXseleniumxXapplicationX";
		
		String tp[]=top.split("xX");
		
		System.out.println(tp[0]); // EMPTY STRING
		System.out.println(tp[0].length()); //0
		System.out.println(tp[1]);
		System.out.println(tp[2]);
		System.out.println(tp[3]);
		System.out.println(tp[4]);
		
		try {
		System.out.println(tp[5]);//ArrayIndexOutOfBoundsException
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException");
			//e.printStackTrace();
		}
		
		System.out.println(Arrays.toString(tp));
		
		// 
		String pop = "testing | automation | selenium | Loginpage";
		String p[]=pop.split("\\|");
			System.out.println(p[0].trim());
			/* | is a or operator */
			System.out.println("-----------");
		System.out.println(Arrays.toString(p));
		
		//
		String st = "testing.automation.selenium.Loginpage";
		String sg[] = st.split("\\.");
		System.out.println(sg[0]);
		
		//	
		String myMsg="I love \"java\" language"; //(backslash)
		System.out.println(myMsg);
		
		String xpath="//input[@value=\"Login\"]";
		System.out.println(xpath);
		
		String testing = "I love 'coding' in Java";
		System.out.println(testing);
		
		StringMethods.getScoreCard("ViratKohli");
		
		
	}
	//Interview Questions
	public static void getScoreCard(String playerName) {
		String xpath="//input[text()='"+playerName+"']";
		System.out.println(xpath);
	}
	

}
