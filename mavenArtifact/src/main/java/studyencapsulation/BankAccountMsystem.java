package studyencapsulation;

//Bank Account Management System: Create a class named BankAccount that encapsulates
//attributes such as account number, balance, and owner details.
//Implement methods to deposit, withdraw, and check balance, 
//ensuring that the balance cannot be accessed or modified directly.


public class BankAccountMsystem {
	
	private int accountnumber;
	private double balance;
	private String accname;
	
	public void deposit(double amount) {
		balance+=amount;
		
	}
	public void withdraw(double amount) {
		balance-=amount;
		
	}
	public double checkBalance() {
		System.out.println("The name of teh account is "+accname);
		System.out.println("Acc number is "+accountnumber);
		return this.balance;
	}
	
	

}
