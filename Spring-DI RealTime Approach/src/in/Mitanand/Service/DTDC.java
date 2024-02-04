package in.Mitanand.Service;

public class DTDC implements Courier {
	
	static {
		System.out.println("DTDC.class file is Loading..");
	}
	public DTDC() {
		System.out.println("DTDC :: Zero Param Constructor...");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("DTDC.deliver()");
		return "DTDC Courier will delivered with the Order id :: "+oid+" for the Ordered Products.";
		
	}

}
