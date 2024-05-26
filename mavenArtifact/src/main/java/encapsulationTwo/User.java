package encapsulationTwo;

import encapsulationOne.EncapClass;

public class User {

	public static void main(String[] args) {
		EncapClass eclass= new EncapClass(); //aggregation .HAS a relation 
		eclass.setter("Reshma", 30);
		eclass.getter();

	}

}


