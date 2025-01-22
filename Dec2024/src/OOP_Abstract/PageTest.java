package OOP_Abstract;

public class PageTest {

	public static void main(String[] args) {
		
		Loginpage lp=new Loginpage();
		lp.title();
		lp.url();
		lp.timeOut();
		lp.displayLogo();
		Page.displayFooter(); //parent class can access static method
		Loginpage.displayFooter(); //chid class can access static method
		
		//
		CartPage cp=new CartPage();
		cp.title();
		cp.url();
		cp.timeOut();
		cp.displayFooter();
		Loginpage.displayFooter();
		

	}

}
