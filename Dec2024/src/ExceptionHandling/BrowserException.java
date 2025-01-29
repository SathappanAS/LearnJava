package ExceptionHandling;

public class BrowserException extends RuntimeException{
	
	public BrowserException(String msg) {
		super(msg); //call the parent class constructor RuntimeException 
	}

}
