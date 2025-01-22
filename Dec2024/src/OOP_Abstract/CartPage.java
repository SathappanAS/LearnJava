package OOP_Abstract;

public class CartPage extends Page {

	@Override
	public void title() {
		System.out.println("CP----title");
		
	}

	@Override
	public void url() {
		System.out.println("CP----url");
		
	}
	
	@Override
	public void timeOut() {
		System.out.println("time out: 15 secs");
	}

}
