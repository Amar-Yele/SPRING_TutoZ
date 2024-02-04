package in.Mitanand.Service;

public class BlueDart implements Courier {

	static {
		System.out.println("Blue.class file is Loading..");
	}
	public BlueDart() {
		System.out.println("BlueDart :: Zero Param Constructor...");
	}
	@Override
	public String deliver(int oid) {
		System.out.println("BlueDart.deliver()");
		return "BlueDart Courier will delivered with the Order id :: "+oid+" for the Ordered Products.";
	}

}
