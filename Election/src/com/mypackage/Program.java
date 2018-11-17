package com.mypackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		long max = Integer.MIN_VALUE;
		Character maxChar = null;

		String votesFromR1 = new String();

		Votes votes = new Votes();
		Set votesR11 = votes.calculateVotesForR1(1);
		Set votesR12 = votes.calculateVotesForR1(2);
		Set votesR13 = votes.calculateVotesForR1(3);
		Set votesR14 = votes.calculateVotesForR1(4);
		Set votesR15 = votes.calculateVotesForR1(5);

		Iterator it = votesR11.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			votesFromR1 = votesFromR1.concat(s);
		}

		Iterator it2 = votesR12.iterator();
		while (it2.hasNext()) {
			String s2 = (String) it2.next();
			votesFromR1 = votesFromR1.concat(s2);
		}

		Iterator it3 = votesR13.iterator();
		while (it3.hasNext()) {
			String s3 = (String) it3.next();
			votesFromR1 = votesFromR1.concat(s3);
		}

		Iterator it4 = votesR14.iterator();
		while (it4.hasNext()) {
			String s4 = (String) it4.next();
			votesFromR1 = votesFromR1.concat(s4);
		}

		Iterator it5 = votesR15.iterator();
		while (it5.hasNext()) {
			String s5 = (String) it5.next();
			votesFromR1 = votesFromR1.concat(s5);
		}

		String str = votesFromR1;
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
		Iterator<Character> iter = set.iterator();
		while (iter.hasNext()) {
			Character key = iter.next();
			Integer val = map.get(key);
			System.out.println(key + " " + val);

		}

		System.out.println("the winner is candidate " + maxChar + " with " + max + " votes");
		
		System.out.println(map);

		
		

		

		}
	}


