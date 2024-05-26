package multipleinheritance;

public class TestClass implements Parent2,Parent1 {

	public static void main(String[] args) {
		TestClass test=new TestClass();
		test.display();
		test.print();
		
//		Parent1 p1=new TestClass();
//		p1.display();
		
		Parent2 parent2=new TestClass();
		parent2.print();
	
		
		
	}

	@Override
	public void display() {
		System.out.println("test1");	
	}

	@Override
	public void print() {
		
		System.out.println("test2");
	}

}
