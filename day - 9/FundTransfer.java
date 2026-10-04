class FundTransfer
{
	
public static void main(String args[])
{
System.out.println("Starting main()");
boolean result = FundTransfer.doTransaction(12,"8788778", "9188781");
boolean result1 = FundTransfer.doTransaction(12, "67767776667", "14324599");
boolean result2 = FundTransfer.doTransaction(123,"7786788", "7766766790");

System.out.println("Is  txn Sucessful ? " + result);

System.out.println("Ending main ()");

}


 static boolean doTransaction(int amountToBetxn, String senderAccNo, String recAccNo)
{
	
System.out.println("Entered doTransaction()");

System.out.println("Exit doTransaction()");
return true;
}


}

	
