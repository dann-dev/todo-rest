package main.webapp.error;

public class ExistingListException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public ExistingListException() {
		super();
	}
	
	public ExistingListException(String message) {
		super(message);
	}
	
}
