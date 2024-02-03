package com.Mitanand.DAO;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	public UserDao() {
		System.out.println("DAO's Object created...");
	}

	public boolean save() {
		
		System.out.println("Yes, able to save into DB..");
		return true;
	}
}
 