package com.synchronization;

public class Test {
	
	public static void main(String args[]) {
	      PrintCount PD = new PrintCount();
	      //create thread instances
	      ThreadCounter T1 = new ThreadCounter( "Thread_1 ", PD );
	      ThreadCounter T2 = new ThreadCounter( "Thread_2 ", PD );
	      //start both the threads
	      T1.start();
	      T2.start();      // wait for threads to end
	      try {
	         T1.join();
	         T2.join();
	      } catch ( Exception e) {
	         System.out.println("Interrupted");
	      }
	   }

}
