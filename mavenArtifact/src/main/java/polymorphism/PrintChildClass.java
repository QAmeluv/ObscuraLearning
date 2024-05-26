package polymorphism;

public class PrintChildClass extends PrintClass{
	@Override
	public static void display() {
		
		
		System.out.println("Method from child class");
	}

	public static void main(String[] args) {
	
		PrintChildClass child=new PrintChildClass();
		child.display();
	}

}
