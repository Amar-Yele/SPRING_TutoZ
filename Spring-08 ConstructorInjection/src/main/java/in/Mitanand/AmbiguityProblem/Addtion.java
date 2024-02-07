package in.Mitanand.AmbiguityProblem;

public class Addtion {
	
	private int a;
	private int b;
	
	public Addtion(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println("Data is :: int, int");
	}
	public Addtion(double a, double b){
		this.a =(int) a;
		this.b =(int) b;
		System.out.println("Data is :: double, double");
	}
	public Addtion(String a, String b){
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Data is :: String, String");
	}
	
	public void doSum() {
		System.out.println("Sum of "+a+" and "+b +" is :: "+(this.a+this.b));
	}

}