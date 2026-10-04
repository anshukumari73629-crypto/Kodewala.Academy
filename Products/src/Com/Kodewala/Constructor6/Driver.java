package Com.Kodewala.Constructor6;

public class Driver {
	public static void main(String[] args) {
		
		 ElectronicProduct  electronicProduct = new  ElectronicProduct("Laptop","G101","50000","2 years",2);
		
		System.out.println(electronicProduct.productName);
		System.out.println(electronicProduct.productId);
		System.out.println(electronicProduct.productPrice);
         System.out.println(electronicProduct.productWarranty);
	}
	}

