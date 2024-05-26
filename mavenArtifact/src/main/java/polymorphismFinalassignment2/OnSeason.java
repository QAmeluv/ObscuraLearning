package polymorphismFinalassignment2;

import polymorphismFinalassignment.OffSeason;

public class OnSeason extends OffSeason{
	
	public final double ondiscount=0.40;
	
	
	public void discount( double total) {
		super.discount(total);
			System.out.println("The onseason discount is "+(total-(total*ondiscount)));	
	}
	
	public static void main(String[] args) {
		OnSeason obj=new OnSeason();
		obj.discount(5000);
	}
}
