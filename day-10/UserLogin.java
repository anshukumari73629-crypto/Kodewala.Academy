
class UserLogin
{
    public static void main(String args[])
    {
        System.out.println("Starting main()");

        boolean result = UserLogin.checkLogin("Anshu", "1234", "Admin");

        System.out.println("Login successful ? " + result);

        System.out.println("Ending main()");
    }

    static boolean checkLogin(String username, String password, String role)
    {
        System.out.println("Entered checkLogin()");

        System.out.println("Input Received " + username + " " + password + " " + role);

        System.out.println("Exit checkLogin()");

        return true;
    }
}