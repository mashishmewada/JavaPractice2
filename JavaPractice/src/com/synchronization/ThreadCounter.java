package com.synchronization;

public class ThreadCounter extends Thread{
	
	private Thread t;
	   private String threadName;
	   PrintCount  PD;
	   //class constructor for initialization    
	   ThreadCounter( String name,  PrintCount pd) {
	      threadName = name;
	      PD = pd;
	   }
	   //run () method for thread with synchronized block
	   public void run() {
	      synchronized(PD) {
	         PD.printCounter();
	      }
	      System.out.println("Thread " +  threadName + " exiting.");
	   }
	    //start () method for thread
	   public void start () {
	      System.out.println("Starting " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }

}
