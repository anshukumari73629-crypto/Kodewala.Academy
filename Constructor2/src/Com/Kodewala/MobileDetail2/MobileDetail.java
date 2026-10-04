package Com.Kodewala.MobileDetail2;

public class MobileDetail {
	int price;
	String modelName;
	String rAM;
	int storag;
	String colour;
	String brand;

	public MobileDetail(int price, String modelName, String rAM, int storag, String colour) {
		

	public MobileDetail(String colour, String brand) {
		super();
		this.colour = colour;
		this.brand = brand;
	}

	public MobileDetail(int price, String modelName, int storag, String colour, String brand) {
		super();
		this.price = price;
		this.modelName = modelName;
		this.storag = storag;
		this.colour = colour;
		this.brand = brand;
	}

}
