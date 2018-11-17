package com.services;

import java.util.Map;

import com.dao.LoginDao;

public class LoginService {

	public boolean authenticate(String username, String password) {

		LoginDao dao = new LoginDao();
		Map<String, String> map = dao.getUserInfoFromDB();
		String passwordFromDB = map.get(username);
		if(password.equals(passwordFromDB)) {
			return true;
		}
		else {
			return false;
		}
		
		
		
		
		
		
	}

}
