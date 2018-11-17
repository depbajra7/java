package com.mypackage.dao;

import java.util.HashMap;
import java.util.Map;

public class LoginDao {
	
	public Map<String, String> getUserInfoFromDb(String username){
		Map<String, String> map = new HashMap<String, String>();
		map.put("password", "java");
		return map;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/*public Map<String, String> getUserInfoFromDB(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("password", "java");
		return map;
	}*/

}
