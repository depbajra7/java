package com.eb;

import java.util.List;

public interface TypesOfData {
	
	public <T> void print(List<T> list);
	public <T extends Number> void add(T num1, T num2);
	public <T extends Number> void addMultipleNumbers(List<T> numbers);
	

}
