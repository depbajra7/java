package com.mypackage;

public class ThreadCountDemo {
	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		Runnable r1 = new ThreadOne(c);
		Thread t1 = new Thread(r1);
		Runnable r2 = new ThreadTwo(c);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		t2.join();
		
		
		System.out.println("the count is " + c.getCount());
		
		
		
	}
	
		
	

	
}


