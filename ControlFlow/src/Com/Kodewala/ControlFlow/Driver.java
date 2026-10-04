package Com.Kodewala.ControlFlow;

public class Driver {
	public static void main(String[] args) {
		
		ShoppingPlanner planner = new ShoppingPlanner();
		
		String response = planner.suggestShopping("Shoes",3500);
		
		System.out.println(response);
	}

}
