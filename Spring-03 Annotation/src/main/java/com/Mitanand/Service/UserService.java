package com.Mitanand.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mitanand.DAO.UserDao;

@Service
public class UserService {
	
	public UserService() {
		System.out.println("UserService object is created...");
	}

	@Autowired
	private UserDao userDao;
	
	public void StoreInDB() { //This is Actual Way
		
		boolean Status = userDao.save();
		if(Status) {
			System.out.println("Data Stored into DB");
		}
		else{
			System.out.println("Failing!. Data not Stored..");
		}
	}
	
	
	
}
