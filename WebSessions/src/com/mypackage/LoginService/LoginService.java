package com.mypackage.LoginService;

import java.util.Map;

import com.mypackage.LoginDao.LoginDao;


public class LoginService {

	public boolean authenticate(String username, String password) {
		LoginDao dao = new LoginDao();
		Map<String, String> map =  dao.getUserInfoFromDB();
		String usersPasswordFromDB = map.get(username);
		
		if(password.equals(usersPasswordFromDB)) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
