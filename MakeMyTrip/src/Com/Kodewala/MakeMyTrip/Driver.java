package Com.Kodewala.MakeMyTrip;

public class Driver {
	public static void main(String[] args) {
		DisscountCalculator calculator = new DisscountCalculator();
		double totalFare = 8000;
		double discount = calculator.CalculateDiscount(totalFare);
	double finalFare = totalFare - discount;
		System.out.println("Welcome to MakeMyTrip");
		System.out.println("_______________________");
		System.out.println("Total Fare:"+totalFare);
		System.out.println("Discount:"+discount);
		System.out.println("Final fare:"+finalFare);
	}

}
