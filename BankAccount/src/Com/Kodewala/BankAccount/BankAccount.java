package Com.Kodewala.BankAccount;

class BankAccount {
	int accountName;
	String account;
	String bankName;
	String branch;
	String accountType;

	BankAccount(int _accountName, String _account, String _bankName, String _branch, String accountType) {
		this.accountName = _accountName;
		this.account = _account;
		this.bankName = _bankName;
		this.branch = _branch;
		this.accountType = accountType;

	}
}

public class BankDetail {
	public static void main(String[] args) {

		BankAccount acc = new BankAccount(123444, "Amit", "SBI", "Ranchi", "Saving");
	}
}
