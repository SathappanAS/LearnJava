package StringManipulation;

public class StringPool {

	public static void main(String[] args) {
	
	//String literals: SCP-HEAP
	String s1="hello";
	String s2="hello";
	
	System.out.println(s1==s2); //true
	System.out.println(s1.equals(s2)); //true
	
	
	String s3=new String("hello");
	System.out.println(s1==s3); //false
	/*It will compare the object reference 
	 * s1 is in some memory location
	 * s3 is in some memory location*/
	System.out.println(s2==s3); //false
	
	//Best way to comparing the value is s1.equal(s3)
	System.out.println(s1.equals(s3));//true
	
	String s4=new String("hello");
	System.out.println(s3==s4); //false
	System.out.println(s1.equals(s4)); //true
	
	String s5=new String("testing");
	
	
	String t1=new String("automation");
	String t2="automation";
	System.out.println(t1==t2); //false
	System.out.println(t1.equals(t2)); //true
	
	String r1=null;
	String r2=null;
	
	System.out.println(r1 == r2); //true
	//System.out.println(r1.equals(r2)); //NPE
	
	
	String p1=null;
	if("naveen".equals(p1)) {
		System.out.println("both are not equal");
	}
	
//	if(p1.equals("naveen")) { //NPE
//		
//	}
	
	/*Very Important Question*/
	String x="hello";
	x.concat("automation");
	System.out.println(x); //hello
	
//	}
	
	//hi
	//hi this
	//hi this is naveen
	
//	//String Buffer and String bulider = non-immutable
//	
	 StringBuilder sb = new StringBuilder("Selenium");
     sb.append("automation");
     System.out.println(sb);
	
	System.out.println("-----");
	
	String a= "abc";
	String b= "abc";
	System.out.println(a.concat(b));
	System.out.println(a);
	
	int i = 10;
	int j = 10;
//	
}}
