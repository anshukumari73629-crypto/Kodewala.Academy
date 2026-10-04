package Com.Kodewala.Constructor2;

public class Customer {

	int customerId;
	String customerName;
	String email;
	String city;
	String phone;

	Customer(int _customerId, String _customerName, String _email, String _city, String _phone) {
		this.customerId = _customerId;
		this.customerName = _customerName;
		this.email = _email;
		this.city = _city;
		this.phone = _phone;

	}

}

class Driver {
	public static void main(String[] args) {
		Customer c = new Customer(5665, "Amit", "amitkumar34@gmail.com", "Banglore", "78766773673");

		Customer c1 = new Customer(5665, "Ajay", "ajay655@gmail.com", "Banglore", "9997636673");

		Customer c2 = new Customer(5665, "Aarav", "aarav12@gmail.com", "Delhi", "8987344453");

	}
}
