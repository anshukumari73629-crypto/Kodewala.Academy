package Com.Kodewala.Constructor;

public class Account {
	int amount;
	String name;

	public Account() {
		System.out.println("inside account");

	}

	Account(int account, String name) {
		System.out.println("inside Account(int account, String name");
		this.amount = amount;
		this.name = name;

		}
}
