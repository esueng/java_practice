package com.beyond.queue.practice;


public class ArrayListQueue<T> implements Queue<T> {

	
	private Node<T> front;
	private Node<T> rear;
	private int size;
	
	
	@Override
	public void enqueue(T value) {
		Node<T> newNode = newNode<>(value);
		
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.size=;
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean contains(T value) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean Node(T value) {
		// TODO Auto-generated method stub
		return false;
	}
}
