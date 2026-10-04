class Driver 
{
public static void main(String args[])
{
System.out.println("Driver.main () START");
OrderMgnt objMgmt = new OrderMgmt();
objMgmt.placeOrder("iphone 18 pro");
System.out.println("Driver.main () END");
}
}
