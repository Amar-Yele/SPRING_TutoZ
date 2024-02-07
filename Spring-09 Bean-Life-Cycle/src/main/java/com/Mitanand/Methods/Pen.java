package com.Mitanand.Methods;

public class Pen {
	
	private double price;
	private String compName;
	
	public Pen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	@Override
	public String toString() {
		return "Pen :: Price=" + price + ", \nCompany Name=" + compName;
	}
	
	
	public void init() {
		System.out.println("Pen.init() :: based on simple Method");
		System.out.println("Inside the Init() Method");
	}
	public void destroy() {
		System.out.println("Pen.destroy() :: based on simple Method");
		System.out.println("Pen Buy Now Leaving...Bye");
	}
	

}
