package FunctionsConcept;

public class User {
	//function/method -- non static -- data member of the class
	
	//function will have its own body in the class
	//I can not create a function inside another function (very important question)
	//but I can call the function from another function
	
	//1. no input and no return
	//void -- no return: can not return anything
	public void test() { //function name should start with small letter
		System.out.println("test method");
	}
	
				//example for void function 
				//			public void click() {
				//				System.out.println("click on button");
				//				return; //blank return : void
				//			}
	
	//2. no input and return
	//return type : int 
	public int add() { //return type : int 
		System.out.println("add method");
		int a=100;
		int b=200;
		int c=a+b;
		return c;
		//return c; // return and void - should not come together	
	}
	
	//return type : String
	public String getTraineName() {
		String name = "Naveen";
		return name;
	}
	
	
	//3. some input and some return
	//return type: int
	//params: 2
	public int sum(int a,int b) {  // a, b - parameters
		System.out.println("sum method");
		int z=a+b;
		return z;
	}
	
	public double getFinalBillingAmount(double foodBill, double drinksBill, double tax) {
		System.out.println("calculating the final bill");
		double finalBill = foodBill+drinksBill+tax;
		return finalBill;
	}
	
	public boolean isUserActive(String userName) {
		System.out.println("checking user"+ userName +"is active");
				
		if(userName.equals("admin")) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	public static void main(String[] args) {
		// how to call non static method : create the object of the class 
		User u1=new User();
		u1.test(); //calling the function	
		int s1=u1.add();
		System.out.println(s1);
		
		
		String n1=u1.getTraineName();
		System.out.println(n1);
		
					if(n1.equals("Naveen")) {
						System.out.println("then only i'll join");
					}
					else {
						System.out.println("I wont join the training");
					}	
		
		int t1=u1.sum(10, 20); //10,20 - values or arguments 
		//calling function by passing two arguments/value: call by value..call by parameters
		System.out.println(t1);
		
		int t2 = u1.sum(20,-5);
		System.out.println(t2);
		
		double amt = u1.getFinalBillingAmount(200.12, 56.65, 3.2);
				System.out.println(amt-30);
				
		
			if(u1.isUserActive("admin")) {
				System.out.println("login");
			}
			else {
				System.out.println("not login");
			}
		
	}
}