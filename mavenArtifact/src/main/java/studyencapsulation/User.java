package studyencapsulation;

public class User {
	
	

	 

	public static void main(String[] args) {
		BankAccountMsystem bank = new BankAccountMsystem();
		bank.deposit(1000);
		bank.withdraw(500);
		System.out.println(bank.checkBalance());
	}

}
