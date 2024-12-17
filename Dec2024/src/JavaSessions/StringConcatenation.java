package JavaSessions;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// What is mean by Concatenation - Merger two things
		
		int a = 10;
		int b = 20;
		
		
		System.out.println("the value of a is :" +a);
		System.out.println("the value of a is :" +b);
		System.out.println("the value of a is :" +(a+b));
		System.out.println("the value of a is :" +a+b);
		
		double c=12.33;
		double d=12.44;
		
		char ch='a';
		char th='b';
		System.out.println(ch+th);
		System.out.println("---------------");
		
		char yh=99;//c
		System.out.println(yh);
		System.out.println("---------------");
		
		System.out.println(a+b); //30
		/* This + operator : If We add anything with int it will become addition */
		System.out.println("---------------");
		
		String x = "hello";
		String y = "world";
		System.out.println(x+y); //helloworld 
		/* This + operator : If We add anything with string it will become concatenation */
		System.out.println("---------------");
		
		System.out.println(x+y);//hello10
		/*This is concatenation*/
		System.out.println("---------------");
		
		System.out.println(a+b+x+y);//30helloworld
		System.out.println("---------------");
		
		System.out.println(a+b+x+y);//helloworld1020
		/*Java Execution will start left to right*/
		System.out.println("---------------");
		
		System.out.println(x+y+(a+b));//helloworld30
		System.out.println("---------------");
		
		System.out.println(a+b+x+y+a+b);//30helloworld1020
		System.out.println("---------------");
		
		
		System.out.println(c+d+x+y);//24.77helloworld
		System.out.println("---------------");
		
		System.out.println(x+y+c+d);//helloworld12.3312.44
		System.out.println("---------------");
		
		System.out.println(x+y+c+d+a+b);//helloworld12.3312.441020
		System.out.println("---------------");
		
		System.out.println(a+b+c+d+x+y+a+b);//helloworld12.3312.441020 {final data types will be string}
		System.out.println("---------------");
		
		
		System.out.println(ch + th + x + y);//195helloworld
		System.out.println("---------------");
		
		System.out.println(x + y+ch+th+a+b);//helloworldab1020
		System.out.println("---------------");
		
		System.out.println(x + y+(ch+th)+a+b);//helloworld1951020
		System.out.println("---------------");
		
		System.out.println(ch + th + yh);//294
		System.out.println("---------------");
		
		System.out.println(ch + th + yh + x);//294hello
		System.out.println("---------------");
		
		System.out.println(a+b+yh);//30+99=129
		System.out.println("---------------");
		
		char test = 100;
		System.out.println(test); //d
		System.out.println("---------------");
		
		System.out.println(x + y + b/a); //helloworld2
		System.out.println("---------------");
		
		System.out.println("Minimum value of Character is: " +Character.MIN_VALUE);
		System.out.println("Maximum value of Character is: " +Character.MAX_VALUE);
		System.out.println("---------------");
		char ph = 'c';
		System.out.println(ph);//c
		System.out.println((byte)ph);//99
		System.out.println("---------------");
		
		double d4 = -98765431.4566455656565656;
		System.out.println(d4);
		System.out.println("---------------");
		
		
		System.out.println(Integer.MAX_VALUE);//2147483647+1=2147483648
		long t1 = Integer.MAX_VALUE;
		System.out.println(t1+1);//2147483648
		
	}

}
