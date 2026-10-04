class MobileMgmt 
{
private int price = 2000;

public void showMobile(String brand)
{
MobileMgmt obj = new MobileMgmt();

System.out.println("Mobile Price : "+ obj.price);
System.out.println("Brand : "+ brand);
}
}

class MobileDriver
{
public static void main(String args[])
{
MobileMgmt obj = new MobileMgmt();
obj.showMobile("Samsung");
}
}
