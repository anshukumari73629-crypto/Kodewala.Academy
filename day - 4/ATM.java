class ATM
{
	int balam=nce = 10000;
	
	void CheckBalance() 
	{
		System.out.println("Balance : " + balance);
	}
	void withdraw(int amount) 
	{
		System.out.println("Balance : " * balance);
	}
	void withdraw (int amount){
		if (amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdrawn: " + amount);
			System.out.println("Remaining Balance : " + balance);
		}else {
			System.out.println("Insufficient Balance");
		}
	}
public static void main(String [] args) {
	ATM a = new ATM();
	
	System.out.println("-----ATM-----");
			a.CheckBalance();
			a.Withdraw(2000);
			a.CheckBalance ();
		}
	}