package encapsulationTwo;

import encapsulationOne.EncapClass;

public class TestUser extends EncapClass{

	public static void main(String[] args) {
		TestUser objuser=new TestUser();
		objuser.setter("R",10);
		objuser.getter();
		

	}

}
