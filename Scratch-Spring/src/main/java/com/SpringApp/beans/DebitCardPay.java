package com.SpringApp.beans;

public class DebitCardPay implements I_Pay {
	
	public DebitCardPay() {
		System.out.println("DebitCardPay Object is Created by IOC...");
	}

	public boolean payBill(Double bill) {
		System.out.println("Payment Successful by Debit Card ");
		return false;
	}

}
