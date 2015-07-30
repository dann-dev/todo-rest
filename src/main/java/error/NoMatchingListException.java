package main.java.error;

public class NoMatchingListException extends Exception {

	private static final long serialVersionUID = 1L;
	public NoMatchingListException() {
	}
	public NoMatchingListException(String message) {
		super(message);
	}
}
