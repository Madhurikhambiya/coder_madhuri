package polymorphism;

public class methodoverloading_BankAccount1 {
	String transaction;
	double Amount;
	int Account_number;
	
	void Deposite() {
		System.out.println("please pass account number and amount to be deposite");
	}
	public String Deposite(int Account_number,double Amount) {
		this.Account_number = Account_number;
		this.Amount = Amount;transaction = "Amount" + Amount +"is deposite into"+Account_number;
		return transaction;
		
	}
	public String Deposite(int AccountNumber) {
		this.Amount = 1200.0;
		transaction = "amount" +Amount+"is deposite into"+Account_number;
		return transaction;
	}
	public static String main(String[] args) {
		BankAccount1 a1 = new  BankAccount1();
		a1.Deposite();
		System.out.println(a1.Deposite(1234567890));
		System.out.println(a1.Deposite(a1.Deposite(1234567890,300)));
		System.out.println(a1.Amount);
		
	}
	

}
