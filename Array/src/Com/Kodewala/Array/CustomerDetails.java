package Com.Kodewala.Array;

public class CustomerDetails {
	public static void main(String[] args) {
		Customers customers1 = new Customers("Aman", 900000, 993746647);
		Customers customers2 = new Customers("Aarav", 20000, 993746647);
		Customers customers3= new Customers("sumit", 30000, 993746647);
		Customers customers4 = new Customers("Neha", 58000, 993746647);
		Customers customers5= new Customers("Swati", 78000, 993746647);
		Customers customers6 = new Customers("Swati", 8000, 993746647);
		
		Customers customers [] = new Customers[7];
		customers[0] = customers1;
		customers[0] = customers1;
		customers[1] = customers2;
		customers[2] = customers3;
		customers[3] = customers4;
		customers[4] = customers5;
		customers[5] = customers6;
		for (int i = 0; i < 7; i ++)
			
			{
				
		        System.out.println("The number is : "+i);
	         }

}
}
