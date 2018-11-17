package com.mypackage;

public class Program {

	public static void main(String[] args) {
		ThreadClass t = new ThreadClass();
		t.start();
		for(int i = 0; i <= 100000; i++ ) {
			System.out.println("inside main");
		}

	}

}
