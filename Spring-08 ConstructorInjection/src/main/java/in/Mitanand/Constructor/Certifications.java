package in.Mitanand.Constructor;

public class Certifications {
	
	String name;

	public Certifications(String name) {
		super();
		this.name = name;
		System.out.println("Certifications.Certifications()");
	}

	@Override
	public String toString() {
		return this.name;
	}
	
	

}
