package polymorphismFinalassignment;

public class OffSeason {
	public final double offdiscount=0.15;
	
	
	public void discount(double total) {
		System.out.println("The onseason discount is "+(total-(total*offdiscount)));
	}
	
	
	

}
