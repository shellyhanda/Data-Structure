package com.shelly.thread.poc;

class SimpleSingleton {

	private SimpleSingleton() {
		
	}
	private static SimpleSingleton instanceObj;
	
	public static synchronized SimpleSingleton getInstance() {
		
		if(instanceObj== null) {
			if(instanceObj== null) {
			instanceObj =new SimpleSingleton();
		}}
		
		return instanceObj;
	}
	
}


public class Client{
	
	public static void main(String arg[]) {
		
		SimpleSingleton myObj=SimpleSingleton.getInstance();
		
		System.out.println("myObj::::" +myObj);
		
		SimpleSingleton myObj2=SimpleSingleton.getInstance();
		
		System.out.println("myObj2::::" +myObj2);
		//myObj2.getInstance().
		
	}
}