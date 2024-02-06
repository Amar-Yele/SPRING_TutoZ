package com.Mitanand.Ref;

public class A {
	
	
	
	public A() {
		super();
		
	}

	private Integer x;
	private B object;
	
	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		System.out.println("A.setX()");
		this.x = x;
	}

	public B getObject() {
		return object;
	}

	public void setObject(B object) {
		System.out.println("A.setObject()");
		this.object = object;
	}

	@Override
	public String toString() {
		return "A [x=" + x + ", object=" + object + "]";
	}

	


}
