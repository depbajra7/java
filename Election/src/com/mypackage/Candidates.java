package com.mypackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Candidates {
	public List region1Candidates(){
		String region1 = "R1";
		List r1Candidates = new ArrayList();
		r1Candidates.add("A");
		r1Candidates.add("B");
		r1Candidates.add("C");
		r1Candidates.add("D");
		
	
		Map<String, List> candidates = new HashMap<String, List>();
		candidates.put(region1, r1Candidates);
		
		return candidates.get(region1);
		
		
		}
				
	
	
	public List region2Candidates() {
		String region2 = "R2";
		List r2Candidates = new ArrayList();
		r2Candidates.add("G");
		r2Candidates.add("A");
		r2Candidates.add("D");
		r2Candidates.add("B");
		
		Map<String, List> candidates2 = new HashMap<String, List>();
		candidates2.put(region2, r2Candidates);
		return candidates2.get(region2);
		
		
	}

}
