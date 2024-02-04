package in.Mitanand.test;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.Mitanand.Service.Flipkart;

public class ControllerUsingApplicationContext {

	public static void main(String[] args) throws IOException {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("in/Mitanand/configuration/applicationContext.xml");
		System.out.println("****Container Started*****\n");
		
		System.in.read();
		
		Flipkart flipkart = app.getBean("fk", Flipkart.class);
		System.out.println(flipkart);
		System.out.println();
		String result = flipkart.doShopping(
			new String[] {"Pack of SmartWatches",  "Pack of IPhones"},
			new float[] {250000.5f, 450000.5f}
		);
		System.out.println(result);
		System.out.println("\n*****Container Stopped****");
		
	}

}
