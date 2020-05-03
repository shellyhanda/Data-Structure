package com.shelly.poc.ds.stack;

public class Stack {

	private int[] stack;
	private int size;
	private int top;
	
	public Stack(int size)
	{
		top=-1;
		this.size=size;
		stack =new int[size];
	}
	
	public boolean push(int item)
	{
		if(!isFull()) {
			++top;
			stack[top] = item;
			return true;
		}
	  return false;
	}
	
	public int pop()
	{
		if(!isEmpty())
		{
			
		}
	}
	
	private boolean isFull()
	{
		return top == size-1;
	}
	private boolean isEmpty()
	{
		return top == -1;
	}
}
