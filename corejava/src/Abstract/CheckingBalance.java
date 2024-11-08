package Abstract;

public class CheckingBalance extends BankAccount {

	@Override
	void CalculateIntrest() {
		// TODO Auto-generated method stub
		System.out.println("your untrest rate is 5%");
		System.out.println("intrest is calculating");
		
	}
	public static void main(String[] args) {
		SavingAccount s = new SavingAccount();
		s.CalculateIntrest();
		CheckingBalance cb = new CheckingBalance();
		cb.CalculateIntrest();
	}

}
