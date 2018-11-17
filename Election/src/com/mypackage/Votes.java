package com.mypackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Votes {

	public Set calculateVotesForR1(int voter) {

		Set voter1 = new HashSet();
		voter1.add("A");
		voter1.add("C");
		voter1.add("D");

		Set voter2 = new HashSet();
		voter2.add("C");
		voter2.add("A");
		voter2.add("D");

		Set voter3 = new HashSet();
		voter3.add("C");
		voter3.add("A");
		voter3.add("Z");

		Set voter4 = new HashSet();
		voter4.add("D");
		voter4.add("A");
		voter4.add("H");

		Set voter5 = new HashSet();
		voter5.add("D");
		voter5.add("A");
		voter5.add("D");

		Map<Integer,Set> votes = new HashMap<Integer, Set>();
		votes.put(1, voter1);
		votes.put(2, voter2);
		votes.put(3, voter3);
		votes.put(4, voter4);
		votes.put(5, voter5);
		
		return votes.get(voter);
		
		

	}
}
