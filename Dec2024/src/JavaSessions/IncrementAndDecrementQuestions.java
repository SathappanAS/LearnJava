package JavaSessions;

public class IncrementAndDecrementQuestions {

	public static void main(String[] args) {
		
		//int i = 11;
		//int j = i++ + ++i;

		//System.out.println(i); //13
		//System.out.println(j); //24
		
		System.out.println("---------------");
		
		//int a=11, b=22, c;
		
		//c = a + b + a++ + b++ + ++a + ++b;
		
		//System.out.println("a="+a); // 13
		//System.out.println("b="+b); // 24
		//System.out.println("c="+c); // 108
		
		System.out.println("---------------");
		
		
		//int z=0;
		//z = z++ - --z + ++z - z--;
		//System.out.println(z);
		
		System.out.println("---------------");
		
		// Note : Boolean can't be increased or decremented
		
		//int i=1, j=2, k=3;
		//int m = i-- - j-- - k--;
		//System.out.println("i="+i);//0
		//System.out.println("j="+j);//1
		//System.out.println("k="+k);//2
		//System.out.println("m="+m);//-4
		System.out.println("---------------");
		
		//int a=1, b=2; 
		//int c;
		//System.out.println("c="+(--b - ++a + ++b - --a));//3
		//System.out.println("a="+a);//0
		//System.out.println("b="+b);//1
		System.out.println("---------------");
		
		//int i=19, j=29, k=0;
		//int m = i-- - j-- - k--;
		//System.out.println("i="+i);//18
		//System.out.println("j="+j);//28
		//System.out.println("k="+k);//-1
		//System.out.println("m="+k);//-1
		//System.out.println("---------------");
		
		//int j = 11;
		//int j = --(i++);  //Note : Not possible
		
		//int m = 0, n = 0;
		//int p = --m * --n * n-- * m--;
		//System.out.println(m); //-2
		//System.out.println(n); //-2
		//System.out.println(p); //1
		System.out.println("---------------");
		
		//int a=1;
		//a = a++ + ++a * --a - a--; // 1+3*2-2 // 1+(6)-2 // 7-2 //5
		//System.out.println(a);
		System.out.println("---------------");
		
		//int a = 11++; // invalid argument to operation ++/--
		//System.out.println(a);
		System.out.println("---------------");
		
		//int ch = 'A';//65
		//System.out.println(ch++);//65
		//System.out.println(ch);//66
		System.out.println("---------------");
		
		//char ch = 'A';
	    //System.out.println(++ch); //B
	    System.out.println("---------------");
	    
	    //double d = 1.5, D = 2.5;

	   //System.out.println(d++ + ++D);// 1.5+3.5 = 5.0
	   //System.out.println(d);//2.5
	   //System.out.println(D);//3.5
	    
	    byte b = 127;
		byte c = b++;
		System.out.println(b);//127+1=128-256=-128
		System.out.println(c);//127
		System.out.println('a'+ 3); //97+3
	}

}
