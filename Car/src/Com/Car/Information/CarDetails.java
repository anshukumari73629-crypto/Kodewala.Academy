package Com.Car.Information;

	public class CarDetails {

	    public static void main(String[] args) {

	        Car car = new Car();
	        System.out.println(car.brand + " " + car.price);

	        Car car1 = new Car("BMW", "Black");
	        System.out.println(car1.brand + " " + car1.color);

	        Car car2 = new Car("Toyota", 1800000, "White", 2025);
	        System.out.println(car2.brand + " " + car2.price + " "
	                + car2.color + " " + car2.modelYear);
	    }
	}

