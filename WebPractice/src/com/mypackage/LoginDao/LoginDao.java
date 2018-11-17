package com.mypackage.LoginDao;

import java.util.HashMap;
import java.util.Map;

public class LoginDao {
	public Map<String, String> 	getUserInfoFromDB(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("password", "java");
		return map;
	}
}
