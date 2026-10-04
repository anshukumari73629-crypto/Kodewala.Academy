package Com.Kodewala.Constructor;

public class Driver {
	public static void main(String[] args) {
		Account acc = new Account();
		System.out.println(acc.amount + " " + acc.name);
		Account acc1 = new Account(2344, "Rani");
		System.out.println(acc1.amount + " " + acc1.name);

	}

}
