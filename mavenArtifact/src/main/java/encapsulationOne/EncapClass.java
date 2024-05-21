package encapsulationOne;

public class EncapClass { //encapsulated class
	private String name;
	private int age;
	
	public void setter(String name,int age) {
		
		this.name=name;
		this.age=age;
		
	}
	public void getter() {
		System.out.println("The name is "+name);
		System.out.println("The age is "+ age);
	}


}
