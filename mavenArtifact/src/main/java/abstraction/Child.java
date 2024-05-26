package abstraction;

public class Child extends AbstractClass{

	public static void main(String[] args) {
		
//		Child c= new Child();// all the methods and variables in teh abstract class
		//can be accesssed using this object
//		c.testAbstract();
//		c.simplyme();
		
		
		// but if we need to access only the methods and variables of abstract class
		//we can follow the below steps.
		AbstractClass obj=new Child();// create a reference with CHILD class , so that |
		// we can access only tge methods of abstract class.
		obj.simplyme();
		obj.testAbstract();
		
		
	}

	@Override
	public void testAbstract() {
		System.out.println("I am inside the child");
		
	}

}
