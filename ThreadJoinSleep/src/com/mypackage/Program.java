package com.mypackage;

public class Program {

	public static void main(String[] args) throws InterruptedException {
		
		
		Runnable r = new ThreadClass();
		Thread t1 = new Thread(r);
		t1.setName("firstThread");		
		t1.start();
		//t1.join();
		
		Runnable r2 = new ThreadTwo();
		Thread t2 = new Thread(r2);
		t2.setName("secondThread");
		t2.start();
		//t2.join();
		
		for(int i = 0; i <= 20; i++ ) {
			System.out.println("inside main");
		}
	}

}
