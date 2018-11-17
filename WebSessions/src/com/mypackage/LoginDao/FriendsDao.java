package com.mypackage.LoginDao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FriendsDao {
	
	public Map<String, List<String>> friendsOfUsers() {
		List<String> list1 = new ArrayList<String>();
		list1.add("John");
		list1.add("Ezra");
		list1.add("Taylor");
		list1.add("Kayleigh");
		list1.add("Jeff");
		list1.add("Warren");
		list1.add("Bill");
		list1.add("Jay");
		list1.add("Tony");
		
		
		List<String> list2 = new ArrayList<String>();
		list2.add("Alfred");
		list2.add("Tom");
		list2.add("Henry");
		list2.add("Alex");
		list2.add("Raven");
		list2.add("Gordon");
		
		List<String> list3 = new ArrayList<String>();
		list3.add("Gordon");
		list3.add("Gordona");
		list3.add("Gordonaaaa");
		list3.add("Gordonaaaaaa");
		
		
		
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		map.put("Dep", list1);
		map.put("John", list2);
		map.put("abysek", list3 );
		
		
		return map;
	}

}
