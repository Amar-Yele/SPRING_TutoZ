package com.SpringApp.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainController {

	public static void main(String[] args) {
		
//		From Here tell to IOC and collect Information from the XML file
		
		//NEW APPROACH
		System.out.println("------NEW Approach-------");
		ApplicationContext app = new ClassPathXmlApplicationContext("Beans.xml");
		app.getBean("Credit", CreditCardPay.class); 
		app.getBean("Debit", DebitCardPay.class); 
		
//		PaymentProcess process = new PaymentProcess();
		PaymentProcess process = app.getBean("payment", PaymentProcess.class);
		process.doPayment(100.0);
//		process.doPayment(300.0);
//		process.doPayment(200.0);
//		
//		No need To Calling by .getBean in New Approach
	
		
/*
 * //***OLD Approach is commented..."		
 * 
		//OLD Approach 
		System.out.println("\n------OLD Approach-------");
		Resource resource = new ClassPathResource("Beans.xml");
		
		BeanFactory factory = new XmlBeanFactory(resource);
		
		factory.getBean("Credit", CreditCardPay.class);
		factory.getBean("Debit", DebitCardPay.class);
		factory.getBean("Amex", AmexCardPay.class);
		
//		Need To Calling by .getBean in Old Approach
		
*/
		
		

	}

}
