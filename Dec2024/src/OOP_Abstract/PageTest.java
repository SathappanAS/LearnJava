package OOP_Abstract;

public class PageTest {

	public static void main(String[] args) {
		
		Loginpage lp=new Loginpage(10,20);
		
		lp.title();
		lp.url();
		lp.timeOut();
		lp.displayLogo();
		Page.displayFooter(); //parent class can access static method
		Loginpage.displayFooter(); //chid class can access static method
		lp.doLogin("admin", "test");
		
		System.out.println("----------");
		//
		CartPage cp=new CartPage();
		cp.title();
		cp.url();
		cp.timeOut();
		cp.displayFooter();
		Page.displayFooter();
		
		System.out.println("----------");
	
		//Page pg=new Pager(); Note Abstract class also we can't create the object same like interface
		
		//top casting
		//child class object can be referred by abstract class ref variable
		
		Page pg=new Loginpage();
		pg.title();
		pg.url();
		pg.timeOut();
		pg.displayLogo();
		//pg.doLogin(); //can't access the child class individal method

		//downcasting : NA
	}
}