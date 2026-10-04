package Com.Kodewala.loops1.copy;

public class Driver13 {
	public static void main(String[] args) {
	String [] cities = {	
			"Banglore","Mumbai","Delhi","Banglore","Ranchi",
			"Jaipur","Banglore","Delhi","Surat","Banglore","Mumbai",
			"Banglore","Delhi"
	};
	String searchCity = "Banglore";
	int  count = 0;
	System.out.println("Searching for : "+ searchCity);
	for(int i = 0; i < cities.length; i++) {
		String currentCity = cities[i];
		if (currentCity.equals(searchCity)) {
			System.out.println("found at position: "+ i);
			count ++;
		}
	}
	
	System.out.println("Total occurences: "+ count);	
	if (count == 0) {
		System.out.println(searchCity + " is not present in the list");
	}
	}
	}

