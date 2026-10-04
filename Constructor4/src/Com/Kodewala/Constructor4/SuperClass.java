package Com.Kodewala.Constructor4;

class SuperClass {
	SuperClass(int a) {
		super();
	}
}
 class User extends SuperClass {
	String userName;
	String userId;
	String mobile;

	User(String _userName, String _userId, String _mobile) {
		super(23);// calling super class constructor without args
		// first line of constructor is either super or this. if you are not writing
		// super or this.
		// then compiler will consider super()
		this.userId = _userId;
		this.userName = _userName;
		this.mobile = _mobile;
	}
}
