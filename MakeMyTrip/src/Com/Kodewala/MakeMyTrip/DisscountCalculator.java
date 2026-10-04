package Com.Kodewala.MakeMyTrip;

public class DisscountCalculator {
/**
 * Calculators
 */ 
	//Discount based on the total fare.
 public double CalculateDiscount(double totalFare) {
	 double discount = 0;
	 if (totalFare <= 5000) {
		 discount = 0;
	 }
	 else if (totalFare <=10000) {
		 discount = totalFare * 0.10;
	 }
	 //Apply maximum discount limit
	 if (discount> 1250) {
		 discount = 1250;
	 }
 return discount ;
 }
}
