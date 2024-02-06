package com.Mitanand.Ref;

public class B {
	

	public B() {
		super();
		System.out.println("B.B()");
	}

	private int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		System.out.println("B.setY()");
		this.y = y;
	}

	@Override
	public String toString() {
		return "B [y=" + y + "]";
	}
	
	
	
}
