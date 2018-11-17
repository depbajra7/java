package com.mypackage;

public class ThreadClass implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i <= 10000; i++ ) {
			System.out.println("inside threadClass run method " +  Thread.currentThread().getName());
			
		}
		
	}
	
}
