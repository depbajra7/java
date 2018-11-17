package com.mypackage;

public class ThreadClass extends Thread{
	@Override
	public synchronized void run() {
		for(int i = 0; i <= 1000000; i++ ) {
			System.out.println("inside threadClass start method");
		}
	}

}
