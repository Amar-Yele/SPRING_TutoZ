package com.SpringApp.beans;

public class CreditCardPay implements I_Pay {
	
	public CreditCardPay() {
		System.out.println("CreditCardPay Object is Created by IOC...");
	}

	public boolean payBill(Double bill) {
		System.out.println("Payment Successful by Credit Card ");
		return false;
	}

}
