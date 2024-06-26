package com.beyond.stack.practice;

import java.util.Arrays;

import javax.management.RuntimeErrorException;

public class ArrayStack<T> implements Stack<T> {
	private int top;
	private int maxSize;
	private T[] values;
	
	
	public ArrayStack(int maxSize) {
//	public ArrayStack(Class<T> clazz, int maxSize) {
		this.top=-1;
		this.maxSize=maxSize;
		this.values= (T[]) new Object[maxSize];
//		this.values = (T[])Array.newInstance(clazz, maxSize);
	}
	
	public ArrayStack(Class<String> class1, int i) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean contains(T value) {
		boolean result = false;
		
		for (int i = 0 ; i<= top ; i++) {
			if(values[i].equals(value)) {
				result = true;
				
				break;
			}
		}
		
		return result;
	}
	
	@Override
	public T peek() {
		if(this.isEmpty()) {
			throw new RuntimeErrorException("스택이 비어 있습니다.");
		} else {
			return values[];
		}
	}
	
	@Override
	public T pop() {
		if (this.isEmpty()) {
			throw new RuntimeException("스택이 비어 있습니다.");
		} else {			
			return values[top--];
		}
	}
	
	@Override
	public int size() {
		
		return(top+1);
	}
	
	@Override
	public void push(T value) {
		if(top == maxSize-1) {
			throw new StackOverflowError("스택이 가득 찼습니다.");
		} else {
			values[++top] = value;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("[");
		
		for (int i =0; i<= top ; i++) {
			sb.append(values[i]+",");
		}
		
		if (sb.lastIndexOf(",")!=-1) {
			sb.replace(sb.lastIndexOf(","), sb.length(), "]");
		} else {
			sb.append("]");
		}
		return Arrays.toString(values);
	}
}
