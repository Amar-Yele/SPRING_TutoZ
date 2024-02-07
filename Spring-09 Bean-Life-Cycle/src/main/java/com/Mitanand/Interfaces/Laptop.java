package com.Mitanand.Interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Laptop implements DisposableBean, InitializingBean {

	private double price;
	private String compName;
	private String origin;

	@Override
	public String toString() {
		return "Laptop :: Price=" + price + ", \nCompany Name=" + compName + ", \nOrigin=" + origin ;
	}

	public Laptop() {
		super();
		System.out.println("Laptop Constructor loaded....");
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Laptop.setPrice()");
		this.price = price;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("\nLaptop.afterPropertiesSet()");
		System.out.println("This method based on Interface....\n");
	}

	public void destroy() throws Exception {
		System.out.println("\nLaptop.destroy()");
		System.out.println("This method based on Interface....\n");
	}

}
