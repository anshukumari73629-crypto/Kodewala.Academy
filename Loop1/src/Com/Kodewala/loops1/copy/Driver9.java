package Com.Kodewala.loops1.copy;

public class Driver9 {
	public static void main(String[] args) {
		String[] cities = {
				"Banglore","Mumbai","Ranchi","Delhi","Udaypur",
				"Mumbai","Delhi", "Chandigar","Banglore","Nagpur",
				"Kochi","Jamsrdpur", "Suraj"};
		String searchCity = "Jaipur";
		boolean found = false;
		
		for (int index = 0; index < cities.length; index++) {
			
			String currentCity = cities [index];
			if (currentCity.equals(searchCity)) {
				System.out.println(searchCity + "is present in the list");
				System.out.println("Position : "+ index);
				found = true;
				break;
				
			}
		}
		
		if (found == false) {
			System.out.println(searchCity + " is not prseent in the list");
		}
	}
}
	
