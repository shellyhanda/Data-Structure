package com.shelly.thread.poc;

import java.util.stream.IntStream;

public class SimpleThread2 implements Runnable{


	/*
	 * SimpleThread2(A2 a) { this.a=a; }
	 */
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		A2 a = new A2();
		a.fun();
		/*
		 * synchronized (a.getClass()) { a.fun(); }
		 */
		
		
	}
	public static void main(String...arg) {
		/*
		 * Thread t = new Thread(new Runnable() {
		 * 
		 * @Override public void run() {
		 * //System.out.println(Thread.currentThread().getName()); A2 a = new A2();
		 * a.fun();
		 * 
		 * } });
		 */
		
		
		for (int i=0;i<10;i++) {
			Thread t = new Thread(new SimpleThread2());
			t.start();
		}
	
		
		
		/*
		 * Thread t1 = new Thread(()-> { A2 a = new A2(); a.fun(); });
		
		IntStream.range(0,10).forEach(i-> t.start());
		 */
	}
	

	
	
}

 class A2 {
	 
   static Object lock = new Object();
	public   void fun() {
		synchronized(lock) {
			try {
				
				System.out.println("i m A2 count"+Thread.currentThread().getName());
				Thread.sleep(10000);
				System.out.println("i m after sleep"+Thread.currentThread().getName());
				
			} catch (InterruptedException e) {
				System.out.println();
				e.printStackTrace();
			}
		}
		
		
	}
}