package com.mypackage;

public class ThreadClass implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i = 0; i <= 20; i++ ) {
			System.out.println("inside threadClass run " +  Thread.currentThread().getName());
		}
		
	}
	
}
