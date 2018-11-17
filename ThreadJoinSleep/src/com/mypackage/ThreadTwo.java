package com.mypackage;

public class ThreadTwo implements Runnable{

	@Override
	public void run() {
		/*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		for (int i = 1; i<=20; i++) {
			System.out.println("inside Thread " + Thread.currentThread().getName() + "iteration " + i);
		}
		
	}
}
