package Com.Kodewala.ControlFlow;

public abstract class Driver {
	public static void main(String[] args) {

		TripPlanner planner = new TripPlanner();
		String response = planner.suggestPlan("BLR", "Goa", 3400);
// System.out.println("response");
	}

}
