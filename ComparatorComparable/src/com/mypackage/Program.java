package com.mypackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Student> list1 = new ArrayList<Student>();
		Student joe = new Student();
		joe.setId(1);
		joe.setName("Joe");
		joe.setGender("male");
		
		Student anna =  new Student();
		anna.setId(2);
		anna.setName("Anna");
		anna.setGender("female");		
		
		list1.add(joe);
		list1.add(anna);
		
		Collections.sort(list1);
		
		for(int i = 0; i<list1.size(); i++) {
			System.out.println(list1.get(i).getName());
		}
		
		list1.sort(new AscendingStudentComparator());
		for(int i = 0; i<list1.size(); i++) {
			System.out.println(list1.get(i).getName());
		}
		
		
		

	}

}
