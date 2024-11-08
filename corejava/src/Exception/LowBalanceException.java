package Exception;

public class LowBalanceException extends RuntimeException {
	public LowBalanceException() {
		
	}
	public LowBalanceException(String message) {
		super(message);
		
	} 

}
