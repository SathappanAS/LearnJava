package OOP_Abstract;

public class Loginpage extends Page {

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
		System.out.println("time out: 5 secs");
	}
	
	public void doLogin(String un,String pwd) {
		System.out.println("login to app using:" );
	}

}
