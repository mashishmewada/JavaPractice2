package com.thread.priority;

public class ThreadPriority extends Thread {
	

    public void run()
    {
        System.out.println("Inside run method....");
    }
 
    public static void main(String[] args)
    {
    	ThreadPriority thread1 = new ThreadPriority();
    	ThreadPriority thread2 = new ThreadPriority();
    	ThreadPriority thread3 = new ThreadPriority();
 
        System.out.println("thread1 priority : "
                           + thread1.getPriority());
 
        System.out.println("thread2 priority : "
                           + thread2.getPriority());
 
        System.out.println("thread3 priority : "
                           + thread3.getPriority());
 
        thread1.setPriority(1);
        thread2.setPriority(2);
        thread3.setPriority(3);
 
       
        System.out.println("thread1 thread priority : "
                           + thread1.getPriority());
 
      
        System.out.println("thread2 thread priority : "
                           + thread2.getPriority());
 
      
        System.out.println("thread3 thread priority : "
                           + thread3.getPriority());
 
      
        System.out.println(
            "Currently Executing Thread : "
            + Thread.currentThread().getName());
 
        System.out.println(
            "Before set Main thread priority : "
            + Thread.currentThread().getPriority());
 
        // Main thread priority is set to 10
        Thread.currentThread().setPriority(4);
 
        System.out.println(
            "After set Main thread priority : "
            + Thread.currentThread().getPriority());
    }

}
