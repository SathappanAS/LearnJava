package OOP_Abstract;

public class Browser  extends Web{
	
	public  Browser() {
		System.out.println("Browser -- default");
	}
	
	public  Browser(int i) {
		System.out.println("Browser -- one params");
	}
		
	public Browser(int i,int j) {
		System.out.print("Browser -- two params");
	}
	

}