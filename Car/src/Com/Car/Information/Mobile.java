package Com.Car.Information;

public class Mobile {

	static int gst = 18;

	int amount;
	String itemName;
	String customerId;
	String billingAddress;
	String customerName;

	Mobile(int _amount, String _itemName, String _customerId, String _billingAddress, String _customerName) {
		this.amount = _amount;
		this.itemName = _itemName;
		this.customerId = _customerId;
		this.billingAddress = _billingAddress;
		this.customerName = _customerName;
	}

}

class ProdutDetail {

	public static void main(String[] args) {
		Mobile m = new Mobile(190000, "mackbook", "C676", "BTM 2nd stage", "Mohit");
		Mobile m1 = new Mobile(30000, "vivo", "C565", "prestige city", "Amit");
		Mobile m2 = new Mobile(170000, "Iphone", "D778", "Whitefield 1st stage", "Aarav");
		Mobile m3 = new Mobile(159000, "Samsung", "E434", "Marathali 1st stage", "Rajat");

	}
}
