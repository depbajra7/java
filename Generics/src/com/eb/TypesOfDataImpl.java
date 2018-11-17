package com.eb;

import java.util.ArrayList;
import java.util.List;

public class TypesOfDataImpl implements TypesOfData {

	@Override
	public <T> void print(List<T> list) {
		for (T type : list) {
			System.out.println(type);
		}
	}

	@Override
	public <T extends Number> void add(T num1, T num2) {
		System.out.println(num1.doubleValue() + num2.doubleValue());
	}

	@Override
	public <T extends Number> void addMultipleNumbers(List<T> numbers) {
		double sum = 0.00;
		for (T number : numbers) {
			sum = sum + number.doubleValue();
		}
		System.out.println(sum);
	}
}
