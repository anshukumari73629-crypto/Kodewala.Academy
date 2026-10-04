package Com.Car.Information;

class Car {

	String brand;
	int price;
	String color;
	int modelYear;

	Car() {
		System.out.println("inside 0 args Constructor");
	}

	Car(String _brand, String _color) {
		this.brand = _brand;
		this.color = _color;
	}

	Car(String _brand, int _price, String _color, int _modelYear) {
		this.brand = _brand;
		this.price = _price;
		this.color = _color;
		this.modelYear = _modelYear;
	}
}
