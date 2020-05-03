package com.shelly.thread.poc;

import java.util.stream.IntStream;

public class SimpleThread implements Runnable{

	A a ;
	SimpleThread(A a)
	{
		this.a=a;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
		a.fun();
		
	}
	public static void main(String...arg) {
		/*
		 * Thread t = new Thread(new Runnable() {
		 * 
		 * @Override public void run() {
		 * //System.out.println(Thread.currentThread().getName()); A a = new A();
		 * a.fun();
		 * 
		 * } });
		 */
		
		A a  = new A();
		for (int i=0;i<10;i++) {
			Thread t = new Thread(new SimpleThread(a));
			t.start();
		}
	
		
		
		/*
		 * Thread t1 = new Thread(()-> { A a = new A(); a.fun(); });
		
		IntStream.range(0,10).forEach(i-> t.start());
		 */
	}
	

	
	
}

 class A{
	public synchronized void fun() {
		try {
			
			System.out.println("i m A count"+Thread.currentThread().getName());
			Thread.sleep(10000);
			System.out.println("i m after sleep"+Thread.currentThread().getName());
			
		} catch (InterruptedException e) {
			System.out.println();
			e.printStackTrace();
		}
		
	}
}