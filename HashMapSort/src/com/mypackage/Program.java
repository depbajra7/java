package com.mypackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 10);
		map.put("b", 4);
		map.put("c", 5);
		
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		List list = new ArrayList();
		while(it.hasNext()) {
			String key = it.next();
			list.add(key);						
		}
		
		System.out.println(list.get(2));
	}

}
