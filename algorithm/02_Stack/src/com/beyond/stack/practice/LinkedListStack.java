package com.beyond.stack.practice;

public class LinkedListStack<T> implements Stack<T> {
	
	private Node<T>;
	
	@Override
	public String toString() {
		return "LinkedListStack [size()=" + size() + ", isEmpty()=" + isEmpty() + ", pop()=" + pop() + ", peek()="
				+ peek() + "]";
	}

	private static class Node<T>{
		private T data;
	}

	@Override
	public void push(T value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(T value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return null;
	}
}
