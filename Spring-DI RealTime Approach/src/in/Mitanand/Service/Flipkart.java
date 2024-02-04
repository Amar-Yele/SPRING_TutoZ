package in.Mitanand.Service;
import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	
	private Courier courier;
	private Float discount;
//	

	public void setDiscount(Float discount) {
		this.discount = discount;
		System.out.println("Flipkart.setDiscount()");
	}
	
	static {
		System.out.println("Flipkart.class file is loading...");
	}

	public Flipkart() {
		System.out.println("Flipkart object is get Instantiated...");
	}
	public void setCourier(Courier courier) {
		this.courier = courier;
		
		System.out.println("Flipkart.setCourier()");
		System.out.println(this);
	}
	
	//Business Logic
	
	public String doShopping(String[] items, float prices[]) {
		
		System.out.println("Flipkart.doShopping()");
		System.out.println("Implementation class is :: "+courier.getClass().getName());
		System.out.println("Discount amount is :: "+ discount);
		
		int oid = 0;
		float billAmt = 0.0f;
		Random random = null;
		
		for(float price : prices) {
			billAmt += price;
		}
		billAmt = billAmt -(discount/100.0f);
		random = new Random();
		oid = random.nextInt(1000);
		System.out.println("Order id is :: "+oid);
		String msg = courier.deliver(oid);
		
		
		return Arrays.toString(items)+"are Purchased having prices "+Arrays.toString(prices)
		+" with bill Amount of "+billAmt+ " -----> "+msg;
	}
	
	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + "]";
	}

}
