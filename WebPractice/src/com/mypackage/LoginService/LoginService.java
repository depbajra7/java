package com.mypackage.LoginService;

import java.util.Map;

import com.mypackage.LoginDao.LoginDao;


public class LoginService {

	public boolean authenticate(String password) {
		LoginDao dao = new LoginDao();
		Map<String, String> map =  dao.getUserInfoFromDB();
		String passwordFromDB = map.get("password");
		
		if(password.equals(passwordFromDB)) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
