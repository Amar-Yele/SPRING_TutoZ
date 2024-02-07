package com.Mitanand.MainApp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Mitanand.Methods.Pen;
import com.Mitanand.Interfaces.Laptop;
import com.Mitanand.Annotations.Watch;
public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext app = new ClassPathXmlApplicationContext("com/Mitanand/MainApp/Config.xml");

//		destroy method doesn;t call untill you call the registerShutdownHook() method which is present in the AbstractApplicationContext class
		//Registering the Shutdown hook to destroy the Bean Life Cycle
		app.registerShutdownHook();
		
		System.out.println();
		Pen p = app.getBean("pen", Pen.class);
		System.out.println(p);
		System.out.println();
		
		Laptop lapt = app.getBean("lap", Laptop.class);
		System.out.println(lapt);
		
//		Output order is based on the what order provided in the XML configuration file......
		
		System.out.println();
		Watch w = app.getBean("watch", Watch.class);
		System.out.println(w);
		System.out.println();
		
	}

}
