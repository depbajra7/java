package com.mypackage.LoginDao;

import java.util.HashMap;
import java.util.Map;

public class LoginDao {
	public Map<String, String> 	getUserInfoFromDB(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("Dep", "java");
		map.put("John", "john");
		map.put("harry", "harry");
		map.put("rebecca", "rebecca");
		map.put("anna", "anna");
		map.put("abysek", "passworddd");
		return map;
	}
}
