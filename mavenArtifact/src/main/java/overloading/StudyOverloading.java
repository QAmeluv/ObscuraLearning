package overloading;

public class StudyOverloading {
	
	public static void area(int l, int b) {
		System.out.println("int overload");
	}
	
    public int area(String l, int b) {
    		System.out.println("String overload");
		return 0;
	}

	public static void main(String[] args) {
		StudyOverloading obj= new StudyOverloading();
		obj.area("juydf", 0);
		area(1, 1);

	}

}
