package com.Collection.Standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String args[]) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("com/Collection/Standalone/AloneConfig.xml");
		
		Mobiles mb = app.getBean("collect", Mobiles.class);
		System.out.println(mb);
	}

}
