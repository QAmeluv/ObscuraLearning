package globalObjectcreation;

import globalobjectcreation2.AddressStudent;

public class Student {
	public String snam;
	public int rollnum;
	public AddressStudent addstd;
	
	public Student(String snam,int rollnum,AddressStudent addstd) {
		this.snam=snam;
		this.rollnum=rollnum;
		this.addstd=addstd;
		
	}
	public void display() {
		
		System.out.println("Student Name: "+snam);
		System.out.println("Roll Number: "+rollnum);
		System.out.println("Address :"+addstd.homename);
		System.out.println(addstd.streetname);
		System.out.println(addstd.district);
		System.out.println(addstd.pin);
	}
	

	public static void main(String[] args) {
		
		AddressStudent astd1=new AddressStudent("RTC","TYU","ALP",9009);
		AddressStudent astd2=new AddressStudent("IOP","HJU","ALP",9119);
		AddressStudent astd3=new AddressStudent("POL","SWE","EKM",9229);
		
		Student st1=new Student("Reshma",42,astd1);
		Student st2=new Student("Rosh",41,astd2);
		Student st3=new Student("Reneeta",43,astd3);
		st1.display();
		st2.display();
		st3.display();

	}

}
