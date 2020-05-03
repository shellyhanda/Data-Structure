package com.shelly.thread.poc;

public class CloneIit implements Cloneable{
	
	 public Object myObj = new Object();

	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
		
	}
	public static void main(String[] args) throws CloneNotSupportedException {
	
		
		CloneIit cit= new CloneIit();
		System.out.println("myObj=="+cit.myObj);
		CloneIit cit2= (CloneIit) cit.clone();
		System.out.println("cit2::myObj=="+cit2.myObj);
		
		
	}

}
