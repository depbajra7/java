package com.services;
import java.util.Map;
import com.dao.LoginDao;
public class LoginService {
	
	public boolean authenticate(String username, String password){
		LoginDao obj = new LoginDao();
		Map<String, String> map = obj.getUserInfoFromDB();
		String passwordFromDb = map.get(username);
		if(password.equals(passwordFromDb)) {
			return true;
		}else {
			return false;
		}			
	}	
}

/*class Z{
	void sum(int a, int b) {
		return (a+b);
	}
}

class A{
	void main() {
		B obj = new B();
		int number = obj.m2();
		System.out.println(number);
				
		A obj = new A();
		obj.m1();
	}
	void m1() {
		System.out.println(7);
	}
}

class B{
	int m2() {
		return 6;
	}
}*/