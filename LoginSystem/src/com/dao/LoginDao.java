package com.dao;

import java.util.HashMap;
import java.util.Map;

public class LoginDao {
	public Map<String, String> getUserInfoFromDB(){
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("sushil", "training");
		map.put("dep", "java");
		map.put("john", "apple");
		
		return map;
		
		
				
		
	}
	
	
	
	
	
	
	

}

