package com.mypackage;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CharacterCount {

	public static void main(String[] args) {

		long max = Integer.MIN_VALUE;
		Character maxChar = null ;

		String str = "aaaaaabbbzzcccccccccccddddddddddddddddd";
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			Integer value = map.get(c);
			if (value != null) {
				map.put(c, value + 1);
			} else {
				map.put(c, 1);
			}
			if (map.get(c) > max) {
				maxChar = c;
				max = map.get(c); //
			}

		}
		Set<Character> set = map.keySet();
		Iterator<Character> it = set.iterator();
		while (it.hasNext()) {
			Character key = it.next();
			Integer val = map.get(key);
			System.out.println(key + " " + val);

		}

		System.out.println("the maximum repeated character is " + maxChar + " repeated " + max + " times");
	}
}
