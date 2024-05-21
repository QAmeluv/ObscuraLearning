package moneyWithdraw;

public class User {
	public static boolean valid;
	
	public void withdrawAmount() {
		if(valid) {
		
		System.out.println(" You can withdraw the amount");
	}
		else {
			System.out.println(" Invalid Pin.You cannot withdraw the amount");
		}
	}
	

	public static void main(String[] args) {
		Bank bankObj=new Bank();
		bankObj.setPin(1234);
		valid=bankObj.validPin();
		User usrObj=new User();
		usrObj.withdrawAmount();
		
	}

}
