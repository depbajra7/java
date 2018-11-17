package com.dao;

import java.util.HashMap;
import java.util.Map;

public class LoginDao {
	
	public Map<String, String> getUserInfoFromDB(){
	
	Map<String, String> map = new HashMap<String, String>();
	map.put("dep", "java");
	map.put("saumya", "pradhan");
	return map;
	}
}
