package com.SpringApp.beans;

public class PaymentProcess {
	
	private I_Pay pay;
	
	//We are doing this by Loose Coupling 
	//in Spring Not possible by Tight Coupling to do this process
	
	public PaymentProcess(I_Pay pay) {
		this.pay = pay;
	}
	
	public void setPay(I_Pay pay) {
		System.out.println("\nSetter is get Called....");
		this.pay = pay;
	}
	public void doPayment(Double amt) {
		System.out.println("Here inside doDopayment method");
		boolean payStatus = pay.payBill(amt);
		
//		if(payStatus==true) {
		if(payStatus==true) {
			System.out.println("Pyament is Successfully Done..");
		}
		else {
			System.out.println("Payment Failed...");
		}
	}

}
