package ExceptionHandling;

public class TestDataException extends RuntimeException {

	public TestDataException(String msg) {
		super(msg); //call the parent class constructor RuntimeException 
	}
}

