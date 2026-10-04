class OrderMgmt
{
private int orderValue = 1200;
public void placeOrder(String itemName)
{
OrderMgmt objMgmt = new OrderMgmt();
System.out.println("order value is :"+ objMgmt.orderValue);
System.out.println("placing an order for : "+ itemName);
}
}
