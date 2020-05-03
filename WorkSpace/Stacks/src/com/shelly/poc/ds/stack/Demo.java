package com.shelly.poc.ds.stack;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String... arg) {
		
		Human sF = new Human(null,null);
		Human sM = new Human(null,null);
		Human s = new Human(sF, sM);
		
		System.out.println(s.parents.get(0).cashInHand);
		
	}
}

 class Human{
	
	 public int cashInHand = 0;
	 List<Human> parents;
	 List<Human> children;
	 Human(Human father , Human mother){
		 parents  = new ArrayList();
		 parents.add(father);
		 parents.add(mother);
	 }
}

