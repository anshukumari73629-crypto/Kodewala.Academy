package Com.Amazon.Product;

class Product {

	String productName;
	int price;
	String description;
	int quality;

	Product() {
		//System.out.println("inside 0 args Constructor");
	}

	public Product(String _productName, String _description) {
		this.productName = _productName;
		this.description = _description;

	}
	Product(String _productName, int _price, String _description, int _quantity) {
		this.productName = _productName;
		this.price =_price;
		this.description =_description;
		this.quality =_quantity;
	}
}
