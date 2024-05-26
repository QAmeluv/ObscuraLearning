package abstraction;

public abstract class AbstractClass {
	
	AbstractClass(){
		System.out.println("Abstract constructor");
	}
	static int age;
	 String name;
	 
	 public abstract void testAbstract();
	
	
	public void simplyme() {
		System.out.println("Iam inside abstract class");
		 
	}

}
