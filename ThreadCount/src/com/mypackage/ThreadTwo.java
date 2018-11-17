package com.mypackage;

public class ThreadTwo implements Runnable {
private Counter c;

ThreadTwo(Counter c1){
	this.c = c1;
	
}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			//System.out.println("inside thread " + Thread.currentThread().getName());
			this.c.increaseCount();

		}

	}
}
