package com.beyond.queue.practice;

public class ArrayQueue<T> implements Queue<T> {
	private int front;
	private int rear;
	private int maxSize;
	private int size;
	private Object[] values;
	
	
	public ArrayQueue(int maxSize) {
		super();
		this.front = 0;
		this.maxSize = maxSize;
		this.size = 0;
		this.values = new Object[this.maxSize];
		this.rear = -1;
	}

	@Override
	public void enqueue(T value) {
		// TODO Auto-generated method stub
		if ( size == maxSize) {
			throw new RuntimeException("큐가 가득 찼습니다.");
		} else {
			if (rear == maxSize-1) {
				rear=-1;
		}
			values[++rear] = value;
			size++;
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.size == 0;
	}

	@Override
	public T dequeue() {
		if (isEmpty()) {
			throw new RuntimeException("큐가 비어 있습니다");
		} 
		T value = (T)values[front++];
		if (front == maxSize) {
			return null;
		}
		size--;
		return null;
	}
	
	@Override
	public boolean contains(T value) {
		boolean result = false;
		int front = this.front;
		
		for(int i=0 ; i<size ; i++) {
			if (values[front].equals(value)) {
				result = true;
			}
			front = (front +1)%maxSize;
		}
		return result;
	}

	@Override
	public T peek() {
		if (isEmpty()) {
			throw new RuntimeException("쿠가 빔");	
		}
		
		return (T)values[front];
	}
	
	@Override
	public String toString() {
		int front = this.front;
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("[");
		
		for ( int i =0 ; i<size ; i++) {
			sb.append(values[front] + ", ");
			
			front = front +1;
		}
		
		if (sb.lastIndexOf(",")!=-1) {
			sb.replace(sb.lastIndexOf(","), sb.length(), "]");
		} else {
			sb.append("]");
		}
		return "ArrayQueue []";
	}
	
	

}
