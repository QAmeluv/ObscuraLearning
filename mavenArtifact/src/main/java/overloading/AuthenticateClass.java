package overloading;

public class AuthenticateClass {
	
	void authenticate(String username,String password){
		System.out.println("Authenticating using username and pssword");
	}
	public int authenticate(String biometric) {
		System.out.println("Authenticating using biometric data");
		return 0;
	}
  private static void authenticate(double securitytoken) {
	  System.out.println("Authenticatign with security token");
  }
  
  
  
  public static void test()
  {
	  
  }
  private static int test(int a) {
	  return 0;
  }
  
  protected static void test(String s) {
	  
  }
  
  
  protected final void display() {
	  
  }
  public final int display(int b) {
	  return 0;
  }
  final void display(String s) {
	  
  }
	public static void main(String[] args) {
		
		AuthenticateClass au=new AuthenticateClass();
		au.authenticate("String");
		au.authenticate("uname", "paswwrd");
		au.authenticate(9.00);
	}

}
