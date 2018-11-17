package com.mypackage.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean isAuthenticated(String username, String password ) {
		
		if(username.equals("dep") && password.equals("java")) {
		return true;
		}else {
			return false;
		}
	}
}
