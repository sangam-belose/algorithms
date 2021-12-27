package com.belose.stack;

import java.util.Arrays;

public class StackDemo{
	private int data[];
	private int topIndex;
	private int capacity;
	
	public StackDemo(int size){
		data = new int[size];
		topIndex = -1;
		capacity = size;
	}
	
	public boolean isEmpty(){
		return this.topIndex == -1;
	}
	
	public boolean isFull(){
		return topIndex == capacity -1;
	}
	
	public void push(int element){
		if(!isFull()) {
			this.data[++this.topIndex] = element;
		}
	}
	
	public int pop(){
		if(!isEmpty()) {
			int returnValue = data[topIndex];
			data[topIndex] = 0;
			topIndex--;
			return returnValue;
		}
		return -1;
	}
	
	public String toString(){
		return Arrays.toString(this.data);
	}
	
	public static void main(String [] args){
		StackDemo s = new StackDemo(5);
		System.out.println(s.isEmpty());
		
		System.out.println(s.isFull());
		
		//add element to stack
		s.push(10);
		System.out.println(s);
		s.push(20);
		System.out.println(s);
		System.out.println(s.pop());
		
		System.out.println(s);
		
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.pop());
		
	}
}