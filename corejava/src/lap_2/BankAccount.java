package lap_2;

//import java.security.DomainCombiner;

public class BankAccount { 
	private double balance;
	private int accountNumber;
	private static int nextAccountNumber = 1;
	
	public BankAccount() {  
		this.balance = 0.0;
	    this.accountNumber = nextAccountNumber++; 
		}
	   public void deposit(double amount) {
		   if(amount>0) {
			   balance+=amount;
			   System.out.println("Deposited" + amount);
		   } 
		   else {
			   System.out.println("invalid diposit amount");
		   }
	   } 
	   public void deposit(double amount ,String description) {
		   if(amount>0) {
			   balance+=amount;
			   System.out.println("Deposited"+amount+"("+description+")");
		   }
		   else {
			   System.out.println("invalid diposit amoun");
		   }
	   } 
	   public void diposit(BankAccount fromAccount,double amount) { 
		   if(amount>0 && fromAccount !=null && fromAccount.balance>=amount) {
			   fromAccount.balance-=amount;
			   this.balance+=amount;
			   System.out.println("Transfered"+amount+"fromAccount"+fromAccount.getAccountNumber());
		   }else { 
			   System.out.println("invalid transfer amount and insufficient fund in the sourse amount");
			   
		   }  
	   }
		   public double getBalance() {
			   return balance;
		   } 
		   public int getAccountNumber() {
			   return accountNumber;
		   }
		   public static void main(String[] args) {
			
			   BankAccount account=new BankAccount();
			   account.deposit(100);
			   System.out.println("Balance"+account.getBalance());
			   
			   account= new BankAccount();
			   account.deposit(50,"salary");
			   System.out.println("Balance"+account.getBalance());
			   
			   BankAccount account1 = new BankAccount();
			   BankAccount account2 = new BankAccount();
			   account1.deposit(100);
			   account2.deposit(50);
			   System.out.println("Account1 Balance:"+account1.getBalance());
			   System.out.println("Account2 Balance:"+account2.getBalance());
			   
			   
		   }
}
