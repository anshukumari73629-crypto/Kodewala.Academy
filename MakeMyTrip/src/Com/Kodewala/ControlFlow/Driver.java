package Com.Kodewala.ControlFlow;

class Driver {
	public static void main(String[] args)
	{
		Booking booking = new Booking();
		
		String pnr = booking.doBooking("BLR", "Ranchi", 9);
		
		System.out.println("PNR is "+ pnr);
	}

}
	