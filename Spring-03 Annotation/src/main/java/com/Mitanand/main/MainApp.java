package com.Mitanand.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Mitanand.Service.UserService;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		UserService service = context.getBean(UserService.class);
		service.StoreInDB();
	}

}
