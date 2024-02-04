package in.Mitanand.Service;

public class FirstFlight implements Courier {

	static {
		System.out.println("Blue.class file is Loading..");
	}
	public FirstFlight() {
		System.out.println("FirstFlight :: Zero Param Constructor...");
	}
	@Override
	public String deliver(int oid) {
		System.out.println("BlueDart.deliver()");
		return "FirstFlight Courier will delivered with the Order id :: "+oid+" for the Ordered Products.";
	}

}
