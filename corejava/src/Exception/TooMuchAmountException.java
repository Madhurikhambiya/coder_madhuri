package Exception;

//check exception//compile time excepion

public class TooMuchAmountException extends Exception{
	
	public TooMuchAmountException() {
		super();
	}
	public TooMuchAmountException(String message) {
		super(message);
	}

}
