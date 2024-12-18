package JavaSessions;
/*Type of Data Types*/
/*Primitive or Fundamental Data Types*/
/*Referenced or Advanced Data Types*/
/*Casting Primitive Data Type */

/*Widening : Converting a lower data type into higher data type is called widening*/  
/*Narrowing : Converting a higher data type into lower data type is called Narrowing*/


/*Byte-->Short--->int-->long--->float---->double*/ //Widening-implicit
/*byte<--short<--int<--long<--float<--double*/ //Narrowing-explicit

public class TypeCasting {

	public static void main(String[] args) {
		
		byte b=10;
		short s=b;
		int i=s;
		long Ln=i;
		System.out.println(s);
		System.out.println("*******************************");
		//Byte range = -128 to 127 
//		byte b1=120;
//		byte b2=120;
//		byte b3= b1+b2; //240  can't be stored in the byte b3 - byte b3=b1+b2 depend on value of the b1 & b2
		
		
		byte b1=120;
		byte b2=120;
		int b3=b1+b2;
		long b4=b1+b2;
		System.out.println(b3);
		System.out.println(b4);
		System.out.println("*******************************");
		
		short s1=1000;
		short s2=1200;
		int s3=s1+s2;
		
		int i1=15000;
		int i2=14000;
		int i3=i1+i2;
		System.out.println(i3);
		System.out.println("*******************************");
		
		long l1=1700000;
		long l2=9000000;
		long l3=l1+l2;
		System.out.println(l3);
		System.out.println("*******************************");
		

		int price = 100;
		int totalPrice=price+50;
		System.out.println(totalPrice);
		System.out.println("*******************************");
		
		short sh=100;
		byte bh=(byte)sh; //100
		System.out.println(bh); //100
		System.out.println("*******************************");
		
		
		short vh=200;
		byte ch=(byte)vh; //256-200=-56
		System.out.println(ch); //-56 //Narrowing - we will loss data and it is not good
		System.out.println("*******************************");
		
		int ih = 130;
		byte th = (byte)ih;//130 //-256+130=-126
		System.out.println(th);//-126
		System.out.println("*******************************");
		
		int ih1 = 10;
		byte th1 = (byte)ih1;
		System.out.println(th1);
		System.out.println("*******************************");
		
		long lh = 1088887700777L;
		int k = (int)lh;//1088887700777
		System.out.println(k);//-2033992407
		System.out.println("*******************************");
		
		byte r=10;
		float f=r;
		double d = r;
		System.out.println(f);//10.0
		System.out.println("*******************************");
		System.out.println(r);//10.0
		System.out.println("*******************************");
		
		float bmi=132.33f;
		byte bm=(byte)bmi;
		System.out.println(bm);//-124 (-256+132=124)
		System.out.println("*******************************");
		
		double dmi=4550.999;
		long lmi=(long)dmi;
		System.out.println(lmi);
		System.out.println("*******************************");
		
		float x1 = 12.33f;
		float x2 = 12.44f;
		float x3 = x1+x2;//24.77
		double x4 = x1+x2;
		System.out.println(x3);
		System.out.println(x4);
		System.out.println("*******************************");
		
		char gender = 'm';//109
		byte bg = (byte) gender;//109
		System.out.println(bg);//109
		System.out.println("*******************************");
		
		
		short sg = (short) gender;
		System.out.println(sg);//109
		System.out.println("*******************************");
		
		
		int ig = (int) gender;
		System.out.println(ig);//109
		System.out.println("*******************************");
		
		
		long lg = (long) gender;
		System.out.println(lg);//109
		System.out.println("*******************************");
		
		byte vg = 'a';//97
		float fg = 'a';
		System.out.println(fg);//97.0
		System.out.println("*******************************");
		
		long num = 97;
		char cl = (char)num;
		System.out.println(cl);//a
		System.out.println("*******************************");
		
		float nm = 97.11f;
		char cm = (char)nm;//97-->a
		System.out.println(cm);//a
		System.out.println("*******************************");
		
		System.out.println(Integer.MAX_VALUE);//2147483647
		//2147483647 + 1 = 2147483648
		int x = Integer.MAX_VALUE + 3;//2147483647
		System.out.println(x+1);//2147483648	
		System.out.println("*******************************");
		
		
		long x7=(long)(Integer.MAX_VALUE)+1;
		System.out.println(x7);	
		System.out.println("*******************************");
		
		byte test=8;
		System.out.println(test*8);	
		System.out.println("*******************************");
		
		byte a1=1;
		char b8=(char)a1;
		System.out.println(b8);
		System.out.println("*******************************");
	}
}
