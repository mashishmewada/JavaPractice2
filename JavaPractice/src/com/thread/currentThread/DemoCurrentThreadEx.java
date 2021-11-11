package com.thread.currentThread;

public class DemoCurrentThreadEx {
	
	public static void main(String[] args) {
	   
		// Creating 3 threads, passing thread name as arg
	    Thread t1 = new Thread(new CurrentThreadEx(), "MyThread1");
	    Thread t2 = new Thread(new CurrentThreadEx(), "MyThread2");
	    Thread t3 = new Thread(new CurrentThreadEx());
	    
	    // setting name using setName method
	    t3.setName("MyThread3");
	    t1.start();
	    t2.start();
	    t3.start();
	  }
 

}
