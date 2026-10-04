class Driver 
{
public static void main(String args[])
{
System.out.println("Driver.main () START");
orderMgnt objMgmt = new orderMgmt();
objMgmt.placeOrder("iphone 18 pro");
System.out.println("Driver.main () END");
}
}
