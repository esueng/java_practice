package com.beyond.queue.practice;

public interface Queue<T> {
	Object enque = null;
	void enqueue(T value);
	int size();
	boolean isEmpty();
	T dequeue();
	T peek();
	boolean contains(T value);
}
