package Com.Kodewala.Constructor2;

class CustomerDetail {
	int customerId;
	String customerName;
	String email;
	String city;
	String phone;
	public CustomerDetail(int customerId, String customerName, String email, String city, String phone) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		this.city = city;
		this.phone = phone;
	}

	
}

public class Test {

	public static void main(String[] args) {
		System.out.println("------------------------------------------------------");
		CustomerDetail customerDetail = new CustomerDetail(101, "chhotu-sharma", "chhotusharma@gmil.com", "benglore",
				"4555585855");
		System.out.println("Customer id :- " + customerDetail.customerId);
		System.out.println("Customer Name :- " + customerDetail.customerName);
		System.out.println("Email :- " + customerDetail.email);
		System.out.println("Phone Numbers :- " + customerDetail.phone);

		System.out.println("------------Thank You !!!--------");

	}

}
