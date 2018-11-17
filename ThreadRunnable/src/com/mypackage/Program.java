package com.mypackage;

public class Program {

	public static void main(String[] args) {
		for(int i = 0; i <= 10000; i++ ) {
			System.out.println("inside main");
		}
		
		Runnable r = new ThreadClass();
		Thread t1 = new Thread(r);
		t1.setName("firstThread");
		t1.start();
	}

}
