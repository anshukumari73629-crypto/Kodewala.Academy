class ATMWithdrawal
{

public static void main (String args [])
{

System.out.println("Starting main");

boolean result = ATMWithdrawal.withdraw(500, "1235");

System.out.println("Withdrawal Successful? " + result);

System.out.println("Ending main ()");

}

static boolean withdraw (int amount,String accountNo)

{

System.out.println("Entered withdraw()");

System.out.println("Amount : " + amount);

System.out.println("Account: + accountNo");

System.out.println("Exit withdraw()");

return true; 

}

}