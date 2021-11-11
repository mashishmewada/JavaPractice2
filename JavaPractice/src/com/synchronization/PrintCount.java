package com.synchronization;

public class PrintCount {

	// print thread counter
	public void printCounter() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Counter ==>  " + i);
			}
		} catch (Exception e) {
			System.out.println("Thread  interrupted.");
		}
	}

}
