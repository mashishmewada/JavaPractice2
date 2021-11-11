package com.thread.Ex;

public class threadEx extends Thread {
	public void run() {
		for (int i = 1; i <= 4; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		threadEx th1 = new threadEx();
		threadEx th2 = new threadEx();
		threadEx th3 = new threadEx();
		th1.start();
		try {

			// join() method waits for a thread to die
			th1.join();
		} catch (Exception e) {
			System.out.println(e);
		}

		th2.start();
		th3.start();
	}
}