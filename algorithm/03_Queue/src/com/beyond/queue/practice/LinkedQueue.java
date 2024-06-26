package com.beyond.queue.practice;

public class LinkedQueue<T> implements Queue<T> {

	private Node<T> rear;
	private Node<T> front;


	public void enqueue(T value) {
		Node<T> newNode = new Node<>(value);
		if ( isEmpty()) {
			front = newNode;
			rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
		
		size++;
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
	public T dequeue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T peek() {
		if(isEmpty()) {
			throw new RuntimeException("큐가 비어 있습니다.");
		}
		return front.data;
	}

	@Override
	public boolean contains(T value) {
		Node<T> current = front;
		while(current !=null) {
			if (current.data.equals(value)) {
				return true;
			}
			current = current.next;
			}
		return false;
	}
	
	@Override
	public String toString() {
		Node<T> current = front;
		StringBuilder sb = new StringBuilder();
		
		sb.append("[");
		
		while(current !=null) {
			sb.append(current.data + ",");
			
			current = current.next;
		}
		if ( sb.lastIndexOf(",")!=-1) {
			sb.replace(sb.lastIndexOf(","), sb.length(),"]");
		} else {
			sb.append("]")
		}
		return "LinkedQueue []";
	}

	private static class Node<T>{
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
			this.next = null;
		}
		
	}

}
