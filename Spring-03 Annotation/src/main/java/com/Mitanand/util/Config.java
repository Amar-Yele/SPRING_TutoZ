package com.Mitanand.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config { 

	Config()
	{
		System.out.println("Config's Object is created..");
	}
	
	@Bean
	public EncryptPassword getInstance()
	{
		EncryptPassword pw = new EncryptPassword();
		pw.passEnc("SHA-256");

//		System.out.println("@@@333-->SHA-256");
		return pw;
	}
}
