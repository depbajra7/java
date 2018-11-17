package com.eb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsProgram {

	public static void main(String[] args) {
		List<Character> list = new ArrayList<>(Arrays.asList('a','b','c','d'));				
		TypesOfData obj = new TypesOfDataImpl();
		obj.print(list);
			
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(3);
		list2.add(5);
		list2.add(7);
		obj.print(list2);
		//-------------------
		obj.add(40, 4);
		obj.add(50.2, 40.3);
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(10);
		numbers.add(15);
		numbers.add(10);
		obj.addMultipleNumbers(numbers);
		
		List<Double> numbers2 = new ArrayList<>();
		numbers2.add(5.5);
		numbers2.add(10.5);
		numbers2.add(15.55);
		obj.addMultipleNumbers(numbers2);

	}

}
