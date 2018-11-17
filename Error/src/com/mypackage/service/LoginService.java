package com.mypackage.service;

import java.util.Map;

import com.mypackage.dao.LoginDao;

public class LoginService {
	public boolean authenticate(String username, String password) {
		LoginDao dao = new LoginDao();
		Map<String, String> map = dao.getUserInfoFromDb();
		String DbPassword = map.get("username");
		if(username.equals(DbPassword)) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/*public boolean authenticate(String password) {
		LoginDao dao = new LoginDao();
		Map<String, String> map = dao.getUserInfoFromDB();
		String DbPassword = map.get("password");
		if(password.equals(DbPassword)) {
			return true;
		}
		else {
			return false;
		}
		
	}*/
	
	
	

}
