package main.java.error;

public class NoMatchingItemException extends Exception {

	private static final long serialVersionUID = 1L;
	public NoMatchingItemException() {
	}
	public NoMatchingItemException(String message) {
		super(message);
	}
}
