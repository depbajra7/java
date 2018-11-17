package com.mypackage;

public class Program {

	public static void main(String[] args) {
		Calculate obj = new Calculate();
		obj.setHeight(10);
		obj.setLength(10);
		obj.setWidth(10);
		int vol = obj.volume();
		System.out.println(vol);
		

	}

}
