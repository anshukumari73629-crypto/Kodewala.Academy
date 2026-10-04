package Com.Kodewala.Array;

public class CarDetails {
	public static void main(String[] args) {
		Car car1 = new Car("Maruti Suzuki", 7000000, "CG12");
		Car car2 = new Car("Fortuner", 400000, "CG12");
		Car car3 = new Car("Honda", 500000, "D34");
		Car car4 = new Car("BMW", 20000000, "G56");
		Car car5 = new Car("Beleno", 800000, "F43");
		Car car6 = new Car("Thar", 180000, "HG776");
		Car car7 = new Car("Creta", 2500000, "NE23");

		Car cars[] = new Car[7];
		cars[0] = car1;
		cars[1] = car2;
		cars[2] = car3;
		cars[3] = car4;
		cars[4] = car5;
		cars[5] = car6;
		cars[6] = car7;

		for (int i = 0; i < 7; i++) {
			System.out.println("car index: " + i);
		}
	}
}