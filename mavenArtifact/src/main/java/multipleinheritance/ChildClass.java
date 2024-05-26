package multipleinheritance;

public class ChildClass implements Parent1,Parent2 {

	public static void main(String[] args) {
//		ChildClass child =new ChildClass();
//		child.print();
//        child.display();
		Parent1 p1=new ChildClass();//reference of Parent1 interface
//		p1.print();//print is the method of Parent2
		p1.display();
	}

	@Override
	public void print() {
		System.out.println("Print from chilclass");
		
	}

	@Override
	public void display() {
		System.out.println("Display from chilclass");
		
		
	}

}
//addition interface(add method), sub interface(sub method)
// 3rd class implements above 2 interfaces.