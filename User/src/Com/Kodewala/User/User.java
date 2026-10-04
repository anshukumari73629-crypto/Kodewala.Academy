package Com.Kodewala.User;

public class User {
	String userName;
	String userId;
	String mobile;

	User(String _userName, String _userId, String _mobile) {
		this.userName = _userName;
		this.userName = _userId;
		this.mobile = _mobile;
	}

}

class UserInfo {
	public static void main(String[] args) {
		User user = new User("Amit", "C343", "7886887728");
		User user1 = new User("Aarman", "D455", "678765509");
		User user2 = new User("Mannat", "E566", "890988877");
		User user3 = new User("Aman", "D677", "798887728");
	}

}
