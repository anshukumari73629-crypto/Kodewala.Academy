package Com.Kodewala.product1;

public class Product {
	String productName;
	String productId;
	String productPrice;

	Product(String _productName, String _productId, String _productPrice) {

		this.productName = productName;
		this.productId = productId;
		this.productPrice = productPrice;
	}

}
 
class ElectronicProduct extends Product {
	int warranty;

    public ElectronicProduct(String _productName, String _productId,
            String _productPrice, int _warranty) {

        super(_productName, _productId, _productPrice);

        this.warranty = _warranty;
    }
}

class Driver {

    public static void main(String[] args) {

        ElectronicProduct product =
                new ElectronicProduct("Laptop", "L101", "50000", 2);

        System.out.println(product.productName);
        System.out.println(product.productId);
        System.out.println(product.productPrice);
        System.out.println(product.warranty);
    }
}
	
