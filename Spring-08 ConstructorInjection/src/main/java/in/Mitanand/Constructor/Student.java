package in.Mitanand.Constructor;

import java.util.List;

public class Student {
	
	private int id;
	private String name;
	private int age;
	private Certifications cert; //Dependent Objet
	private List lst;
	
	
	public Student(int id, String name, int age, Certifications cert, List lst) {
		super();
		System.out.println("Student.Student()");
		this.id = id;
		this.name = name;
		this.age = age;
		this.cert = cert;
		this.lst = lst;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", \nName=" + name + ", \nAge=" + age + ", \nCertificate=" + cert.name + 
				"\nCountry & Team :: "+lst+"]";
	}
	

}
