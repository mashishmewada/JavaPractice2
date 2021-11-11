package com.thread.currentThread;

public class CurrentThreadEx implements Runnable {

	@Override
	public void run() {
		
		// Getting thread's name
		System.out.println("Current Thread Name- " + Thread.currentThread().getName());
		
		// Getting thread's ID
		System.out.println("Current Thread ID- " + Thread.currentThread().getId() + " For Thread- "
				+ Thread.currentThread().getName());
	}
}
