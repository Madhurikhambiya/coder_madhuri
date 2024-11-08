package Exception;

public class Demo {
	public static void main(String[] args) {
		Bank bb = new Bank(); // unchecked
		System.out.println("bb instance of Bank");
		try {
			bb.withDraw(10);
			System.exit(0);
			return;
			
		}catch(LowBalanceException e) {
			System.out.println(e);
		}finally {
			System.out.println("you are most welcome");
		}
		System.out.println("Madhuri");
		
	}
	
}
	