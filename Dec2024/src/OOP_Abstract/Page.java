package OOP_Abstract;

public abstract class Page {
	
	//abstract class: can not have the object
	
	public abstract void title();

	public abstract void url();
	
	public final void displayLogo() {
		System.out.println("display logo");
	}
	
	public void timeOut() {
		System.out.println("time out: 10 secs");
	}
	
	public static void displayFooter() {
		System.out.println("page---footer");
	}
	
}
