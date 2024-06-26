package com.beyond.stack.practice;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class ArrayListStack<T> implements Stack<T> {
	private int maxSize;
	private int top;
	private List<T> values;
	
	public ArrayListStack(int maxSize) {
		this.top = -1;
		this.maxSize = maxSize;
		this.values = new ArrayList<>();
	}
	
	@Override
	public void push(T value) {
		if(top==maxSize-1) {
			throw new RuntimeException("스택이 가득 찼습니다.");
		} else {
			values.add(++top,value);
		}
	}
	
	@Override
	public int size() {
		return top+1;
	}
	
	@Override
	public boolean isEmpty() {
		return top==1;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("[");
		
		for(int i=0 ; i<= top ; i++) {
			sb.append(values.get(i)+",");
			
		}
		
		if(sb.lastIndexOf(",")!=-1) {
			sb.replace(sb.lastIndexOf(","), sb.length(), "]")
		}
		
		return sb.toString();
	}

	@Override
	public T pop() {
		if(this.isEmpty()) {
			throw new RuntimeErrorException(null, "스택이 비었어");
		}else {
		return values.get([top--]);
		}
		return null;
	}

	@Override
	public boolean contains(T value) {
		boolean result = false;
		for (int i=0; i<=  top ; i++) {
			if (values.get(i).equals(value)) {
				result = true;
				break;
			}
		}
		return false;
	}

	@Override
	public T peek() {
		if (this.)
		return null;
	}
}
