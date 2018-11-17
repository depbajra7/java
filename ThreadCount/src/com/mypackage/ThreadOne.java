package com.mypackage;

public class ThreadOne implements Runnable {
	
	private Counter c;
	
	ThreadOne(Counter c1){
		this.c = c1;
		
	}

	@Override
	public void run() {
		for (int i = 0; i <100; i++) {
			//System.out.println("inside thread " + Thread.currentThread().getName());
			this.c.increaseCount();

		}
	}
}
