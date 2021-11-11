package com.thread.Ex;

public class RenameThread extends Thread {

	public void run() {
		System.out.println("running...");
	}

	public static void main(String args[]) {
		RenameThread thread1 = new RenameThread();
//		RenameThread thread2 = new RenameThread();
//		System.out.println("Name of first thread:" + thread1.getName());
//		System.out.println("Name of second thread:" + thread2.getName());
//
//		thread1.start();
//		thread2.start();
		
		thread1.start();
        System.out.println("thread name: "+thread1.getName());

		thread1.setName("Rohit");
		System.out.println("After changing name of thread1: " + thread1.getName());
	}
}
