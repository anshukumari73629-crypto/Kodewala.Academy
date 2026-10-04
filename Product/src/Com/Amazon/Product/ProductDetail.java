package Com.Amazon.Product;
public class ProductDetail {
	public static void main(String[] args) {

		Product product=new Product();
		System.out.println(product.productName+" "+product.price+" "+product.description+" "+product.quality);
		
		Product product1=new Product("Bread", "It is fresh");
		System.out.println(product1.productName+" "+product1.description);
		
		Product product2=new Product("Phone", 784544, "It's sumsung phone", 2);
		System.out.println(product2.productName+" "+product2.price+" "+product2.description+" "+product2.quality);
		
	}
}

