package OOP_Abstract;

public class Loginpage extends Page {
	
	
	public Loginpage() {
		System.out.println("LP---Default Constructor");
	}
	
	public Loginpage(int i) {
		System.out.println("LP---Default Constructor" + i);
	}

	public Loginpage(int i,int j) {
		System.out.println("LoginPage-----two param constructiors" +  i + j);
	}
	
	
	@Override
	public void title() {
		System.out.println("LP----title");
		
	}

	@Override
	public void url() {
		System.out.println("LP----url");
		
	}
			
	@Override
	public void timeOut() {
		System.out.println("LP----time out: 5 secs");
	}
	
	public void doLogin(String un,String pwd) {
		System.out.println("login to app using:" );
	}

}
