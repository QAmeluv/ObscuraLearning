package globalObjectcreation;

import globalobjectcreation2.Address;

public class Employee {
	Address adreference;//global reference to address class
	public int empid;
	public String empName;
	public String designation;
	
	public Employee(String empName,int empid,String designation,Address adreference) {
		this.empid=empid;
		this.empName=empName;
		this.designation=designation;
		this.adreference=adreference;
		
	}
	public void display() {
		System.out.println("Name :"+empName);
		System.out.println("ID :"+empid);
		System.out.println("Designation :"+designation);
		System.out.println("Address :"+adreference.housename);
		System.out.println(adreference.stname);
		System.out.println(adreference.district);
		System.out.println(adreference.pin);
		System.out.println("***************************");
		
	}

	public static void main(String[] args) {
		
		Address ad1=new Address("housename1","street1","district1",12345);
		Address ad2=new Address("housename2","street2","district2",12346);
		Address ad3=new Address("housename3","street3","district3",12347);
		Employee empobj1=new Employee("XYZ",123,"QA",ad1);
		Employee empobj2=new Employee("ABC",111,"QA",ad2);
		Employee empobj3=new Employee("REW",122,"QA",ad3);
		
		empobj1.display();
		empobj2.display();
		empobj3.display();
	}

}
